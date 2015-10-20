/*
 * This is the definitions of some system configuration parameters
 */
class Operator{
	String name; 	// the name of the operator file
	float threshold; 	// the name of the operator file
}

class Path{
	public  String originalInputFolder; // // the path of the color image file
	public  String binaryInputFolder;   // the path of the segmented image file
	public  String operatorFolder;      // the path of the operator file
	public  String outputFolder;	    // // the path of the output image
}

class Config{
	int cleanUpOldFilePeriod; // the interval which check if delete the old file
	int maxLiveTime;		  // the maximum survival time for the uploaded image
}

public class SystemParam {
	public static Path path;  // path in the database
	public static Operator[] operators; // configuration of the operators
	public static Config config; // configuration of the thread which delete the uploaded file
}
