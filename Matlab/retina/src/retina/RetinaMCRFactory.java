/*
 * MATLAB Compiler: 4.14 (R2010b)
 * Date: Fri May 18 17:02:07 2012
 * Arguments: "-B" "macro_default" "-W" "java:retina,COSFIRE" "-T" "link:lib" "-d" 
 * "D:\\MatServer\\src\\retina\\src" "-w" "enable:specified_file_mismatch" "-w" 
 * "enable:repeated_file" "-w" "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" 
 * "-w" "enable:demo_license" "-v" 
 * "class{COSFIRE:D:\\MatServer\\src\\applyCOSFIRE.m,D:\\MatServer\\src\\blur.m,D:\\MatServer\\src\\blurshift.m,D:\\MatServer\\src\\computeGaborEnergy.m,D:\\MatServer\\src\\convolution.m,D:\\MatServer\\src\\COSFIRE.m,D:\\MatServer\\src\\dilate.mexw32,D:\\MatServer\\src\\gaborfilter.m,D:\\MatServer\\src\\gaborkernel2d.m,D:\\MatServer\\src\\getBlurredGaborResponses.m,D:\\MatServer\\src\\getGaborResponse.m,D:\\MatServer\\src\\getOrientationSelectiveOutput.m,D:\\MatServer\\src\\getRadialList.m,D:\\MatServer\\src\\imshift.m,D:\\MatServer\\src\\invariantCOSFIRE.m,D:\\MatServer\\src\\pickBestCircle.m,D:\\MatServer\\src\\readandinit.m,D:\\MatServer\\src\\reflectionInvariantCOSFIRE.m,D:\\MatServer\\src\\retina.m,D:\\MatServer\\src\\rotationInvariantCOSFIRE.m,D:\\MatServer\\src\\scaleInvariantCOSFIRE.m,D:\\MatServer\\src\\SystemConfig.m}" 
 */

package retina;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class RetinaMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "retina_D2589B27BB948658B868C191C6772DF4";
    
    /** Component name */
    private static final String sComponentName = "retina";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(RetinaMCRFactory.class)
        );
    
    
    private RetinaMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            RetinaMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{7,14,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
