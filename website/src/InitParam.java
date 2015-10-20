/*
 * This Servlet execute in the beginning when the web app starts.
 * It reads some configuration files: 
 * 		conf_operators.json
 * 		conf_path.json
 * 		conf_period.json
 * And create a thread which delete the uploaded files periodically
 * Zhe Sun
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.google.gson.Gson;


/**
 * Application Lifecycle Listener implementation class InitParam
 *
 */
@WebListener
public class InitParam implements ServletContextListener {

	
	 
    /**
     * Default constructor. 
     */
    public InitParam() {
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent config) {
    	
		Gson gson = new Gson();
		String currentPath = config.getServletContext().getRealPath("/");
		
		// get system configuration from JSON file
    	try {
			BufferedReader br = new BufferedReader(new FileReader(currentPath + "conf_path.json"));
			SystemParam.path = gson.fromJson(br, Path.class);
			
			br = new BufferedReader(new FileReader(currentPath + "conf_operators.json"));
			SystemParam.operators = gson.fromJson(br, Operator[].class);
			
			br = new BufferedReader(new FileReader(currentPath + "conf_period.json"));
			SystemParam.config = gson.fromJson(br, Config.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// create the thread which delete the uploaded file periodically
		UploadFileList.items = new HashMap<File, Long>();
		Runnable r = new Runnable() {
			public void run() {
				while(true){
					try {
						Thread.sleep(SystemParam.config.cleanUpOldFilePeriod * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					long currTime = (long) (System.currentTimeMillis() / 1000);
					synchronized (UploadFileList.items){
						Iterator<Entry<File, Long>> it = UploadFileList.items.entrySet().iterator();
						while (it.hasNext()) {
							Entry<File, Long> pairs = it.next();
							long diff = currTime - pairs.getValue();
							if (diff >= SystemParam.config.maxLiveTime){
								File file = pairs.getKey();
								System.out.println("Delete [" + file.getName()+ ", "+ pairs.getValue() + "]");
								file.delete();
								it.remove(); // avoids a ConcurrentModificationException							
							}
						}
					}
				}
				
			} 
		};
		
		Thread t = new Thread(r);
		t.start();		
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
    }
	
}
