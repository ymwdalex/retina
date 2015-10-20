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
import java.util.*;

/**
 * The <code>COSFIRE</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  D:\\MatServer\\src\\applyCOSFIRE.m
 *  D:\\MatServer\\src\\blur.m
 *  D:\\MatServer\\src\\blurshift.m
 *  D:\\MatServer\\src\\computeGaborEnergy.m
 *  D:\\MatServer\\src\\convolution.m
 *  D:\\MatServer\\src\\COSFIRE.m
 *  D:\\MatServer\\src\\dilate.mexw32
 *  D:\\MatServer\\src\\gaborfilter.m
 *  D:\\MatServer\\src\\gaborkernel2d.m
 *  D:\\MatServer\\src\\getBlurredGaborResponses.m
 *  D:\\MatServer\\src\\getGaborResponse.m
 *  D:\\MatServer\\src\\getOrientationSelectiveOutput.m
 *  D:\\MatServer\\src\\getRadialList.m
 *  D:\\MatServer\\src\\imshift.m
 *  D:\\MatServer\\src\\invariantCOSFIRE.m
 *  D:\\MatServer\\src\\pickBestCircle.m
 *  D:\\MatServer\\src\\readandinit.m
 *  D:\\MatServer\\src\\reflectionInvariantCOSFIRE.m
 *  D:\\MatServer\\src\\retina.m
 *  D:\\MatServer\\src\\rotationInvariantCOSFIRE.m
 *  D:\\MatServer\\src\\scaleInvariantCOSFIRE.m
 *  D:\\MatServer\\src\\SystemConfig.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>COSFIRE</code> instance 
 * when it is no longer needed to ensure that native resources allocated by this class 
 * are properly freed.
 * @version 0.0
 */
public class COSFIRE extends MWComponentInstance<COSFIRE>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>applyCOSFIRE</code> M-function.
     */
    private static final MWFunctionSignature sApplyCOSFIRESignature =
        new MWFunctionSignature(/* max outputs = */ 3,
                                /* has varargout = */ false,
                                /* function name = */ "applyCOSFIRE",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>blur</code> M-function.
     */
    private static final MWFunctionSignature sBlurSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "blur",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>blurshift</code> M-function.
     */
    private static final MWFunctionSignature sBlurshiftSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "blurshift",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>computeGaborEnergy</code> 
     *M-function.
     */
    private static final MWFunctionSignature sComputeGaborEnergySignature =
        new MWFunctionSignature(/* max outputs = */ 3,
                                /* has varargout = */ false,
                                /* function name = */ "computeGaborEnergy",
                                /* max inputs = */ 12,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>convolution</code> M-function.
     */
    private static final MWFunctionSignature sConvolutionSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "convolution",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>COSFIRE</code> M-function.
     */
    private static final MWFunctionSignature sCOSFIRESignature =
        new MWFunctionSignature(/* max outputs = */ 2,
                                /* has varargout = */ false,
                                /* function name = */ "COSFIRE",
                                /* max inputs = */ 4,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>dilate</code> M-function.
     */
    private static final MWFunctionSignature sDilateSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ true,
                                /* function name = */ "dilate",
                                /* max inputs = */ 1,
                                /* has varargin = */ true);
    /**
     * Maintains information used in calling the <code>gaborfilter</code> M-function.
     */
    private static final MWFunctionSignature sGaborfilterSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "gaborfilter",
                                /* max inputs = */ 7,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>gaborkernel2d</code> M-function.
     */
    private static final MWFunctionSignature sGaborkernel2dSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "gaborkernel2d",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>getBlurredGaborResponses</code> 
     *M-function.
     */
    private static final MWFunctionSignature sGetBlurredGaborResponsesSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "getBlurredGaborResponses",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>getGaborResponse</code> M-function.
     */
    private static final MWFunctionSignature sGetGaborResponseSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "getGaborResponse",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the 
     *<code>getOrientationSelectiveOutput</code> M-function.
     */
    private static final MWFunctionSignature sGetOrientationSelectiveOutputSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "getOrientationSelectiveOutput",
                                /* max inputs = */ 4,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>getRadialList</code> M-function.
     */
    private static final MWFunctionSignature sGetRadialListSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "getRadialList",
                                /* max inputs = */ 4,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>imshift</code> M-function.
     */
    private static final MWFunctionSignature sImshiftSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "imshift",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>invariantCOSFIRE</code> M-function.
     */
    private static final MWFunctionSignature sInvariantCOSFIRESignature =
        new MWFunctionSignature(/* max outputs = */ 2,
                                /* has varargout = */ false,
                                /* function name = */ "invariantCOSFIRE",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>pickBestCircle</code> M-function.
     */
    private static final MWFunctionSignature sPickBestCircleSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "pickBestCircle",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>readandinit</code> M-function.
     */
    private static final MWFunctionSignature sReadandinitSignature =
        new MWFunctionSignature(/* max outputs = */ 3,
                                /* has varargout = */ false,
                                /* function name = */ "readandinit",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>reflectionInvariantCOSFIRE</code> 
     *M-function.
     */
    private static final MWFunctionSignature sReflectionInvariantCOSFIRESignature =
        new MWFunctionSignature(/* max outputs = */ 2,
                                /* has varargout = */ false,
                                /* function name = */ "reflectionInvariantCOSFIRE",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>retina</code> M-function.
     */
    private static final MWFunctionSignature sRetinaSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "retina",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>rotationInvariantCOSFIRE</code> 
     *M-function.
     */
    private static final MWFunctionSignature sRotationInvariantCOSFIRESignature =
        new MWFunctionSignature(/* max outputs = */ 2,
                                /* has varargout = */ false,
                                /* function name = */ "rotationInvariantCOSFIRE",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>scaleInvariantCOSFIRE</code> 
     *M-function.
     */
    private static final MWFunctionSignature sScaleInvariantCOSFIRESignature =
        new MWFunctionSignature(/* max outputs = */ 2,
                                /* has varargout = */ false,
                                /* function name = */ "scaleInvariantCOSFIRE",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>SystemConfig</code> M-function.
     */
    private static final MWFunctionSignature sSystemConfigSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "SystemConfig",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private COSFIRE (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(COSFIRE.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>COSFIRE</code> class.
     */
    public COSFIRE() throws MWException
    {
        this(RetinaMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #COSFIRE(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public COSFIRE(String pathToComponent) throws MWException
    {
        this(RetinaMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>COSFIRE</code> class. Use this constructor 
     * to specify the options required to instantiate this component.  The options will 
     * be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public COSFIRE(MWComponentOptions componentOptions) throws MWException
    {
        this(RetinaMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(COSFIRE.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first m-function specified by MCC, with any arguments given on
     * the command line, and prints the result.
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = RetinaMCRFactory.newInstance();
            mcr.runMain( sApplyCOSFIRESignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(COSFIRE.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>applyCOSFIRE</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %     save blurredGabor blurredGabor;
     * %     fixedparams = [];
     * %     fixed = cell(0);
     * %     
     * %     % Get responses of a Bank of Gabor filters
     * %     writeProgress('Computing responses of a bank of Gabor filters 
     * ...',params.verbose);
     * %     tic;
     * %     gb = getGaborResponse(inputImage,params);
     * % else
     * %     gb = filterparams.gb;
     * %     fixedparams = filterparams.fixedparams;
     * %     fixed = filterparams.fixed;
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void applyCOSFIRE(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sApplyCOSFIRESignature);
    }

    /**
     * Provides the interface for calling the <code>applyCOSFIRE</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %     save blurredGabor blurredGabor;
     * %     fixedparams = [];
     * %     fixed = cell(0);
     * %     
     * %     % Get responses of a Bank of Gabor filters
     * %     writeProgress('Computing responses of a bank of Gabor filters 
     * ...',params.verbose);
     * %     tic;
     * %     gb = getGaborResponse(inputImage,params);
     * % else
     * %     gb = filterparams.gb;
     * %     fixedparams = filterparams.fixedparams;
     * %     fixed = filterparams.fixed;
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void applyCOSFIRE(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sApplyCOSFIRESignature);
    }

    /**
     * Provides the standard interface for calling the <code>applyCOSFIRE</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %     save blurredGabor blurredGabor;
     * %     fixedparams = [];
     * %     fixed = cell(0);
     * %     
     * %     % Get responses of a Bank of Gabor filters
     * %     writeProgress('Computing responses of a bank of Gabor filters 
     * ...',params.verbose);
     * %     tic;
     * %     gb = getGaborResponse(inputImage,params);
     * % else
     * %     gb = filterparams.gb;
     * %     fixedparams = filterparams.fixedparams;
     * %     fixed = filterparams.fixed;
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] applyCOSFIRE(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sApplyCOSFIRESignature), 
                    sApplyCOSFIRESignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>blur</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % [rA,cA] = size(A);
     * % [BW nconn] = bwlabel(A);
     * % radius = round(sigma * 3);
     * % [area start stop] = getConnArea(BW,nconn,radius);
     * % if (rA * cA) < area
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void blur(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sBlurSignature);
    }

    /**
     * Provides the interface for calling the <code>blur</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % [rA,cA] = size(A);
     * % [BW nconn] = bwlabel(A);
     * % radius = round(sigma * 3);
     * % [area start stop] = getConnArea(BW,nconn,radius);
     * % if (rA * cA) < area
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void blur(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sBlurSignature);
    }

    /**
     * Provides the standard interface for calling the <code>blur</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % [rA,cA] = size(A);
     * % [BW nconn] = bwlabel(A);
     * % radius = round(sigma * 3);
     * % [area start stop] = getConnArea(BW,nconn,radius);
     * % if (rA * cA) < area
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] blur(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sBlurSignature), 
                    sBlurSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>blurshift</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % [rA,cA] = size(A);
     * % [BW nconn] = bwlabel(A);
     * % radius = round(sigma * 3);
     * % [area start stop] = getConnArea(BW,nconn,radius);
     * % if (rA * cA) < area
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void blurshift(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sBlurshiftSignature);
    }

    /**
     * Provides the interface for calling the <code>blurshift</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % [rA,cA] = size(A);
     * % [BW nconn] = bwlabel(A);
     * % radius = round(sigma * 3);
     * % [area start stop] = getConnArea(BW,nconn,radius);
     * % if (rA * cA) < area
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void blurshift(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sBlurshiftSignature);
    }

    /**
     * Provides the standard interface for calling the <code>blurshift</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % [rA,cA] = size(A);
     * % [BW nconn] = bwlabel(A);
     * % radius = round(sigma * 3);
     * % [area start stop] = getConnArea(BW,nconn,radius);
     * % if (rA * cA) < area
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] blurshift(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sBlurshiftSignature), 
                    sBlurshiftSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>computeGaborEnergy</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % set all the initial data-variables
     *   %data.imagename=strcat(pwd, '\\inputimages\\synthetic1.png'); % init. imagename
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void computeGaborEnergy(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sComputeGaborEnergySignature);
    }

    /**
     * Provides the interface for calling the <code>computeGaborEnergy</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % set all the initial data-variables
     *   %data.imagename=strcat(pwd, '\\inputimages\\synthetic1.png'); % init. imagename
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void computeGaborEnergy(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sComputeGaborEnergySignature);
    }

    /**
     * Provides the standard interface for calling the <code>computeGaborEnergy</code>
     * M-function with 12 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % set all the initial data-variables
     *   %data.imagename=strcat(pwd, '\\inputimages\\synthetic1.png'); % init. imagename
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] computeGaborEnergy(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sComputeGaborEnergySignature), 
                    sComputeGaborEnergySignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>convolution</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % CONVOLUTION: convolves IMG with FILTERKERNEL (by use of fft). If IMGFFT already 
     * contains
     * % the fft of IMG, this IMGFFT is used and less calculations are made.
     * % CONVOLUTION can be called with 2 or 3 parameters:
     * %
     * %   CONVOLUTION(IMG, FILTERKERNEL) convolves
     * %     IMG - the matrix to convolve with the kernel 
     * %     FILTERKERNEL - the filterkernel to convolve IMG with in the frequency domain
     * %
     * %   CONVOLUTION(IMG, FILTERKERNEL, IMGFFT) convolves
     * %     IMG - the matrix to convolve with the kernel 
     * %     FILTERKERNEL - the filterkernel to convolve IMG with in the frequency domain
     * %     IMGFFT - this value should contain the fft of IMG 
     * %              this reduces calculations if IMG remains the same over time
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void convolution(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sConvolutionSignature);
    }

    /**
     * Provides the interface for calling the <code>convolution</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % CONVOLUTION: convolves IMG with FILTERKERNEL (by use of fft). If IMGFFT already 
     * contains
     * % the fft of IMG, this IMGFFT is used and less calculations are made.
     * % CONVOLUTION can be called with 2 or 3 parameters:
     * %
     * %   CONVOLUTION(IMG, FILTERKERNEL) convolves
     * %     IMG - the matrix to convolve with the kernel 
     * %     FILTERKERNEL - the filterkernel to convolve IMG with in the frequency domain
     * %
     * %   CONVOLUTION(IMG, FILTERKERNEL, IMGFFT) convolves
     * %     IMG - the matrix to convolve with the kernel 
     * %     FILTERKERNEL - the filterkernel to convolve IMG with in the frequency domain
     * %     IMGFFT - this value should contain the fft of IMG 
     * %              this reduces calculations if IMG remains the same over time
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void convolution(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sConvolutionSignature);
    }

    /**
     * Provides the standard interface for calling the <code>convolution</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % CONVOLUTION: convolves IMG with FILTERKERNEL (by use of fft). If IMGFFT already 
     * contains
     * % the fft of IMG, this IMGFFT is used and less calculations are made.
     * % CONVOLUTION can be called with 2 or 3 parameters:
     * %
     * %   CONVOLUTION(IMG, FILTERKERNEL) convolves
     * %     IMG - the matrix to convolve with the kernel 
     * %     FILTERKERNEL - the filterkernel to convolve IMG with in the frequency domain
     * %
     * %   CONVOLUTION(IMG, FILTERKERNEL, IMGFFT) convolves
     * %     IMG - the matrix to convolve with the kernel 
     * %     FILTERKERNEL - the filterkernel to convolve IMG with in the frequency domain
     * %     IMGFFT - this value should contain the fft of IMG 
     * %              this reduces calculations if IMG remains the same over time
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] convolution(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sConvolutionSignature), 
                    sConvolutionSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>COSFIRE</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % The channels of the sub units that have already been computed
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void COSFIRE(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sCOSFIRESignature);
    }

    /**
     * Provides the interface for calling the <code>COSFIRE</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % The channels of the sub units that have already been computed
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void COSFIRE(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sCOSFIRESignature);
    }

    /**
     * Provides the standard interface for calling the <code>COSFIRE</code>
     * M-function with 4 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % The channels of the sub units that have already been computed
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] COSFIRE(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sCOSFIRESignature), 
                    sCOSFIRESignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>dilate</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void dilate(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sDilateSignature);
    }

    /**
     * Provides the interface for calling the <code>dilate</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void dilate(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sDilateSignature);
    }

    /**
     * Provides the standard interface for calling the <code>dilate</code>
     * M-function with 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] dilate(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sDilateSignature), 
                    sDilateSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>gaborfilter</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % GABORFILTER: calculates all the convolutions of the input image IMG with
     * % the Gabor-filterkernels for all combinations of orientations (which are 
     * % stored in the array THETA) and all phase-offsets (as stored in the array PHI) 
     * with the input image IMG. 
     * % The result is a 4-dimensional matrix of which the first two indices are the 
     * image-coordinates,
     * % the third index is the phaseoffset, the fourth index is the orientation.
     * % i.e. RESULT(:,:,phaseoffset(i),orientation(j)).
     * % A progressbar of the calculations is also shown.
     * %   GABORFILTER(IMG, LAMBDA, SIGMA, THETA, PHI, GAMMA, BANDWIDTH) calculates
     * %   all convolutions as described above, with the following parameters:
     * %     IMG - a matrix with values (an already read input image)
     * %     LAMBDA - preferred wavelength (wavelength of the cosine factor) of a Gabor 
     * function
     * %     SIGMA - standard deviation of Gaussian factor
     * %     THETA - list of all orientations
     * %     PHI   - list of all phase-offsets              
     * %     GAMMA - spatial aspect ratio (of the x- and y-axis of the Gaussian elipse) 
     * %     BANDWIDTH - spatial frequency bandwidth
     * %     To use the BANDWIDTH, one of the parameters SIGMA or LAMBDA must
     * %     contain the value 0. Otherwise BANDWIDTH is ignored.
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void gaborfilter(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGaborfilterSignature);
    }

    /**
     * Provides the interface for calling the <code>gaborfilter</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % GABORFILTER: calculates all the convolutions of the input image IMG with
     * % the Gabor-filterkernels for all combinations of orientations (which are 
     * % stored in the array THETA) and all phase-offsets (as stored in the array PHI) 
     * with the input image IMG. 
     * % The result is a 4-dimensional matrix of which the first two indices are the 
     * image-coordinates,
     * % the third index is the phaseoffset, the fourth index is the orientation.
     * % i.e. RESULT(:,:,phaseoffset(i),orientation(j)).
     * % A progressbar of the calculations is also shown.
     * %   GABORFILTER(IMG, LAMBDA, SIGMA, THETA, PHI, GAMMA, BANDWIDTH) calculates
     * %   all convolutions as described above, with the following parameters:
     * %     IMG - a matrix with values (an already read input image)
     * %     LAMBDA - preferred wavelength (wavelength of the cosine factor) of a Gabor 
     * function
     * %     SIGMA - standard deviation of Gaussian factor
     * %     THETA - list of all orientations
     * %     PHI   - list of all phase-offsets              
     * %     GAMMA - spatial aspect ratio (of the x- and y-axis of the Gaussian elipse) 
     * %     BANDWIDTH - spatial frequency bandwidth
     * %     To use the BANDWIDTH, one of the parameters SIGMA or LAMBDA must
     * %     contain the value 0. Otherwise BANDWIDTH is ignored.
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void gaborfilter(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGaborfilterSignature);
    }

    /**
     * Provides the standard interface for calling the <code>gaborfilter</code>
     * M-function with 7 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % GABORFILTER: calculates all the convolutions of the input image IMG with
     * % the Gabor-filterkernels for all combinations of orientations (which are 
     * % stored in the array THETA) and all phase-offsets (as stored in the array PHI) 
     * with the input image IMG. 
     * % The result is a 4-dimensional matrix of which the first two indices are the 
     * image-coordinates,
     * % the third index is the phaseoffset, the fourth index is the orientation.
     * % i.e. RESULT(:,:,phaseoffset(i),orientation(j)).
     * % A progressbar of the calculations is also shown.
     * %   GABORFILTER(IMG, LAMBDA, SIGMA, THETA, PHI, GAMMA, BANDWIDTH) calculates
     * %   all convolutions as described above, with the following parameters:
     * %     IMG - a matrix with values (an already read input image)
     * %     LAMBDA - preferred wavelength (wavelength of the cosine factor) of a Gabor 
     * function
     * %     SIGMA - standard deviation of Gaussian factor
     * %     THETA - list of all orientations
     * %     PHI   - list of all phase-offsets              
     * %     GAMMA - spatial aspect ratio (of the x- and y-axis of the Gaussian elipse) 
     * %     BANDWIDTH - spatial frequency bandwidth
     * %     To use the BANDWIDTH, one of the parameters SIGMA or LAMBDA must
     * %     contain the value 0. Otherwise BANDWIDTH is ignored.
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] gaborfilter(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGaborfilterSignature), 
                    sGaborfilterSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>gaborkernel2d</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 2004-04-05
     * % CREATED BY: N. Petkov and M.B. Wieling, Groningen University
     * %
     * % GABORKERNEL2D(LAMBDA, SIGMA, THETA, PHI, GAMMA, BANDWIDTH) 
     * %   fills a (2N+1)*(2N+1) matrix with the values of a 2D Gabor function. N is 
     * computed from SIGMA.
     * %     LAMBDA - preferred wavelength (period of the cosine factor) [in pixels]
     * %     SIGMA - standard deviation of the Gaussian factor [in pixels]
     * %     THETA - preferred orientation [in radians]; can be a 1D array 
     * %     PHI   - phase offset [in radians] of the cosine factor; can be a 1D array
     * %     GAMMA - spatial aspect ratio (of the x- and y-axis of the Gaussian elipse)
     * %     BANDWIDTH - spatial frequency bandwidth at half response,
     * %       BANDWIDTH, SIGMA and LAMBDA are interdependent. To use BANDWIDTH, 
     * %       the input value of one of SIGMA or LAMBDA must be 0. Otherwise BANDWIDTH 
     * is ignored.
     * %       The actual value of the parameter whose input value is 0 is computed 
     * inside the 
     * %       function from the input vallues of BANDWIDTH and the other parameter.
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void gaborkernel2d(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGaborkernel2dSignature);
    }

    /**
     * Provides the interface for calling the <code>gaborkernel2d</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 2004-04-05
     * % CREATED BY: N. Petkov and M.B. Wieling, Groningen University
     * %
     * % GABORKERNEL2D(LAMBDA, SIGMA, THETA, PHI, GAMMA, BANDWIDTH) 
     * %   fills a (2N+1)*(2N+1) matrix with the values of a 2D Gabor function. N is 
     * computed from SIGMA.
     * %     LAMBDA - preferred wavelength (period of the cosine factor) [in pixels]
     * %     SIGMA - standard deviation of the Gaussian factor [in pixels]
     * %     THETA - preferred orientation [in radians]; can be a 1D array 
     * %     PHI   - phase offset [in radians] of the cosine factor; can be a 1D array
     * %     GAMMA - spatial aspect ratio (of the x- and y-axis of the Gaussian elipse)
     * %     BANDWIDTH - spatial frequency bandwidth at half response,
     * %       BANDWIDTH, SIGMA and LAMBDA are interdependent. To use BANDWIDTH, 
     * %       the input value of one of SIGMA or LAMBDA must be 0. Otherwise BANDWIDTH 
     * is ignored.
     * %       The actual value of the parameter whose input value is 0 is computed 
     * inside the 
     * %       function from the input vallues of BANDWIDTH and the other parameter.
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void gaborkernel2d(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGaborkernel2dSignature);
    }

    /**
     * Provides the standard interface for calling the <code>gaborkernel2d</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 2004-04-05
     * % CREATED BY: N. Petkov and M.B. Wieling, Groningen University
     * %
     * % GABORKERNEL2D(LAMBDA, SIGMA, THETA, PHI, GAMMA, BANDWIDTH) 
     * %   fills a (2N+1)*(2N+1) matrix with the values of a 2D Gabor function. N is 
     * computed from SIGMA.
     * %     LAMBDA - preferred wavelength (period of the cosine factor) [in pixels]
     * %     SIGMA - standard deviation of the Gaussian factor [in pixels]
     * %     THETA - preferred orientation [in radians]; can be a 1D array 
     * %     PHI   - phase offset [in radians] of the cosine factor; can be a 1D array
     * %     GAMMA - spatial aspect ratio (of the x- and y-axis of the Gaussian elipse)
     * %     BANDWIDTH - spatial frequency bandwidth at half response,
     * %       BANDWIDTH, SIGMA and LAMBDA are interdependent. To use BANDWIDTH, 
     * %       the input value of one of SIGMA or LAMBDA must be 0. Otherwise BANDWIDTH 
     * is ignored.
     * %       The actual value of the parameter whose input value is 0 is computed 
     * inside the 
     * %       function from the input vallues of BANDWIDTH and the other parameter.
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] gaborkernel2d(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGaborkernel2dSignature), 
                    sGaborkernel2dSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>getBlurredGaborResponses</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void getBlurredGaborResponses(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGetBlurredGaborResponsesSignature);
    }

    /**
     * Provides the interface for calling the <code>getBlurredGaborResponses</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void getBlurredGaborResponses(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGetBlurredGaborResponsesSignature);
    }

    /**
     * Provides the standard interface for calling the <code>getBlurredGaborResponses</code>
     * M-function with 2 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] getBlurredGaborResponses(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGetBlurredGaborResponsesSignature), 
                    sGetBlurredGaborResponsesSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>getGaborResponse</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void getGaborResponse(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGetGaborResponseSignature);
    }

    /**
     * Provides the interface for calling the <code>getGaborResponse</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void getGaborResponse(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGetGaborResponseSignature);
    }

    /**
     * Provides the standard interface for calling the <code>getGaborResponse</code>
     * M-function with 2 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] getGaborResponse(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGetGaborResponseSignature), 
                    sGetGaborResponseSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>getOrientationSelectiveOutput</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void getOrientationSelectiveOutput(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGetOrientationSelectiveOutputSignature);
    }

    /**
     * Provides the interface for calling the <code>getOrientationSelectiveOutput</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void getOrientationSelectiveOutput(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGetOrientationSelectiveOutputSignature);
    }

    /**
     * Provides the standard interface for calling the <code>getOrientationSelectiveOutput</code>
     * M-function with 4 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] getOrientationSelectiveOutput(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGetOrientationSelectiveOutputSignature), 
                    sGetOrientationSelectiveOutputSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>getRadialList</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void getRadialList(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGetRadialListSignature);
    }

    /**
     * Provides the interface for calling the <code>getRadialList</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void getRadialList(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGetRadialListSignature);
    }

    /**
     * Provides the standard interface for calling the <code>getRadialList</code>
     * M-function with 4 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] getRadialList(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGetRadialListSignature), 
                    sGetRadialListSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>imshift</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void imshift(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sImshiftSignature);
    }

    /**
     * Provides the interface for calling the <code>imshift</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void imshift(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sImshiftSignature);
    }

    /**
     * Provides the standard interface for calling the <code>imshift</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] imshift(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sImshiftSignature), 
                    sImshiftSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>invariantCOSFIRE</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void invariantCOSFIRE(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sInvariantCOSFIRESignature);
    }

    /**
     * Provides the interface for calling the <code>invariantCOSFIRE</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void invariantCOSFIRE(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sInvariantCOSFIRESignature);
    }

    /**
     * Provides the standard interface for calling the <code>invariantCOSFIRE</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] invariantCOSFIRE(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sInvariantCOSFIRESignature), 
                    sInvariantCOSFIRESignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>pickBestCircle</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % coordinates = load(coordinatesFile);
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void pickBestCircle(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPickBestCircleSignature);
    }

    /**
     * Provides the interface for calling the <code>pickBestCircle</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % coordinates = load(coordinatesFile);
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void pickBestCircle(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPickBestCircleSignature);
    }

    /**
     * Provides the standard interface for calling the <code>pickBestCircle</code>
     * M-function with 3 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % coordinates = load(coordinatesFile);
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] pickBestCircle(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPickBestCircleSignature), 
                    sPickBestCircleSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>readandinit</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % READANDINIT: fills the initial values (the matrix of the read image: IMG, 
     * %              a list with all orientations: THETA
     * %              the standard deviation of the gaussian factor: SIGMA)
     * %   READANDINIT(IMG, THETA, NORS, SIGMA, LAMBDA, BANDWIDTH) with the
     * %   following parameters:
     * %     IMG - name of the image as a string (e.g. 'lena.jpg')
     * %     THETA - list of one or more orientations, if only one orienation
     * %             (the start-orientation) is entered, NORS is used to calculate the 
     * entire list
     * %             of orientations (2*pi is divided by NORS and added
     * %             sequentially to the previous value in the list of THETA), if 
     * %             multiple values are entered, NORS is ignored
     * %     NORS - number of orientations (see also THETA)
     * %     SIGMA - standard deviation of Gaussian factor
     * %     LAMBDA - preferred wavelength (wavelength of the cosine factor)
     * %     BANDWIDTH - spatial frequency bandwidth
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void readandinit(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sReadandinitSignature);
    }

    /**
     * Provides the interface for calling the <code>readandinit</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % READANDINIT: fills the initial values (the matrix of the read image: IMG, 
     * %              a list with all orientations: THETA
     * %              the standard deviation of the gaussian factor: SIGMA)
     * %   READANDINIT(IMG, THETA, NORS, SIGMA, LAMBDA, BANDWIDTH) with the
     * %   following parameters:
     * %     IMG - name of the image as a string (e.g. 'lena.jpg')
     * %     THETA - list of one or more orientations, if only one orienation
     * %             (the start-orientation) is entered, NORS is used to calculate the 
     * entire list
     * %             of orientations (2*pi is divided by NORS and added
     * %             sequentially to the previous value in the list of THETA), if 
     * %             multiple values are entered, NORS is ignored
     * %     NORS - number of orientations (see also THETA)
     * %     SIGMA - standard deviation of Gaussian factor
     * %     LAMBDA - preferred wavelength (wavelength of the cosine factor)
     * %     BANDWIDTH - spatial frequency bandwidth
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void readandinit(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sReadandinitSignature);
    }

    /**
     * Provides the standard interface for calling the <code>readandinit</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % VERSION 5/1/04
     * % CREATED BY: M.B. Wieling and N. Petkov, Groningen University,
     * %             Department of Computer Science, Intelligent Systems
     * %
     * % READANDINIT: fills the initial values (the matrix of the read image: IMG, 
     * %              a list with all orientations: THETA
     * %              the standard deviation of the gaussian factor: SIGMA)
     * %   READANDINIT(IMG, THETA, NORS, SIGMA, LAMBDA, BANDWIDTH) with the
     * %   following parameters:
     * %     IMG - name of the image as a string (e.g. 'lena.jpg')
     * %     THETA - list of one or more orientations, if only one orienation
     * %             (the start-orientation) is entered, NORS is used to calculate the 
     * entire list
     * %             of orientations (2*pi is divided by NORS and added
     * %             sequentially to the previous value in the list of THETA), if 
     * %             multiple values are entered, NORS is ignored
     * %     NORS - number of orientations (see also THETA)
     * %     SIGMA - standard deviation of Gaussian factor
     * %     LAMBDA - preferred wavelength (wavelength of the cosine factor)
     * %     BANDWIDTH - spatial frequency bandwidth
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] readandinit(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sReadandinitSignature), 
                    sReadandinitSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>reflectionInvariantCOSFIRE</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Apply the given COSFIRE filter
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void reflectionInvariantCOSFIRE(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sReflectionInvariantCOSFIRESignature);
    }

    /**
     * Provides the interface for calling the <code>reflectionInvariantCOSFIRE</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Apply the given COSFIRE filter
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void reflectionInvariantCOSFIRE(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sReflectionInvariantCOSFIRESignature);
    }

    /**
     * Provides the standard interface for calling the <code>reflectionInvariantCOSFIRE</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Apply the given COSFIRE filter
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] reflectionInvariantCOSFIRE(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sReflectionInvariantCOSFIRESignature), 
                    sReflectionInvariantCOSFIRESignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>retina</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %     cd(currPath);
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void retina(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sRetinaSignature);
    }

    /**
     * Provides the interface for calling the <code>retina</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %     cd(currPath);
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void retina(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sRetinaSignature);
    }

    /**
     * Provides the standard interface for calling the <code>retina</code>
     * M-function with 2 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * %     cd(currPath);
     * </pre>
     * </p>
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] retina(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sRetinaSignature), 
                    sRetinaSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>rotationInvariantCOSFIRE</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Shift the values of parameters (theta,rho) of every subunit by a given psi value
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void rotationInvariantCOSFIRE(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sRotationInvariantCOSFIRESignature);
    }

    /**
     * Provides the interface for calling the <code>rotationInvariantCOSFIRE</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Shift the values of parameters (theta,rho) of every subunit by a given psi value
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void rotationInvariantCOSFIRE(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sRotationInvariantCOSFIRESignature);
    }

    /**
     * Provides the standard interface for calling the <code>rotationInvariantCOSFIRE</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Shift the values of parameters (theta,rho) of every subunit by a given psi value
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] rotationInvariantCOSFIRE(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sRotationInvariantCOSFIRESignature), 
                    sRotationInvariantCOSFIRESignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>scaleInvariantCOSFIRE</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Scale the value of parameter lambda of every subunit by a given nu value
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void scaleInvariantCOSFIRE(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sScaleInvariantCOSFIRESignature);
    }

    /**
     * Provides the interface for calling the <code>scaleInvariantCOSFIRE</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Scale the value of parameter lambda of every subunit by a given nu value
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void scaleInvariantCOSFIRE(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sScaleInvariantCOSFIRESignature);
    }

    /**
     * Provides the standard interface for calling the <code>scaleInvariantCOSFIRE</code>
     * M-function with 5 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % Scale the value of parameter lambda of every subunit by a given nu value
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] scaleInvariantCOSFIRE(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sScaleInvariantCOSFIRESignature), 
                    sScaleInvariantCOSFIRESignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>SystemConfig</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % params.t3tolwidth = 0.05;
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void SystemConfig(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sSystemConfigSignature);
    }

    /**
     * Provides the interface for calling the <code>SystemConfig</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % params.t3tolwidth = 0.05;
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void SystemConfig(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sSystemConfigSignature);
    }

    /**
     * Provides the standard interface for calling the <code>SystemConfig</code>
     * M-function with 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % params.t3tolwidth = 0.05;
     * </pre>
     * </p>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] SystemConfig(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sSystemConfigSignature), 
                    sSystemConfigSignature);
        return lhs;
    }
}
