/*
 * MATLAB Compiler: 4.14 (R2010b)
 * Date: Mon Feb 06 16:12:33 2012
 * Arguments: "-B" "macro_default" "-W" "java:retina,applyCOSFIRE" "-T" "link:lib" "-d" 
 * "D:\\MatServer\\retina\\src" "-w" "enable:specified_file_mismatch" "-w" 
 * "enable:repeated_file" "-w" "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" 
 * "-w" "enable:demo_license" "-v" 
 * "class{applyCOSFIRE:D:\\MatServer\\applyCOSFIRE.m,D:\\MatServer\\blur.m,D:\\MatServer\\computeGaborEnergy.m,D:\\MatServer\\convolution.m,D:\\MatServer\\dilate.mexw32,D:\\MatServer\\gaborfilter.m,D:\\MatServer\\gaborkernel2d.m,D:\\MatServer\\getBlurredGaborResponses.m,D:\\MatServer\\getGaborResponse.m,D:\\MatServer\\getRadialList.m,D:\\MatServer\\readandinit.m,D:\\MatServer\\SystemConfig.m}" 
 */

package retina;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>applyCOSFIRERemote</code> class provides a Java RMI-compliant interface to 
 * the M-functions from the files:
 * <pre>
 *  D:\\MatServer\\applyCOSFIRE.m
 *  D:\\MatServer\\blur.m
 *  D:\\MatServer\\computeGaborEnergy.m
 *  D:\\MatServer\\convolution.m
 *  D:\\MatServer\\dilate.mexw32
 *  D:\\MatServer\\gaborfilter.m
 *  D:\\MatServer\\gaborkernel2d.m
 *  D:\\MatServer\\getBlurredGaborResponses.m
 *  D:\\MatServer\\getGaborResponse.m
 *  D:\\MatServer\\getRadialList.m
 *  D:\\MatServer\\readandinit.m
 *  D:\\MatServer\\SystemConfig.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>applyCOSFIRERemote</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed, and the server-side proxy is unexported.  (Failure to call 
 * dispose may result in server-side threads not being properly shut down, which often 
 * appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of retina.applyCOSFIRE.
 */
public interface applyCOSFIRERemote extends Poolable
{
    /**
     * Provides the standard interface for calling the <code>applyCOSFIRE</code> 
     * M-function with 5 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
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
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] applyCOSFIRE(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>blur</code> M-function with 
     * 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % [rA,cA] = size(A);
     * % [BW nconn] = bwlabel(A);
     * % radius = round(sigma * 3);
     * % [area start stop] = getConnArea(BW,nconn,radius);
     * % if (rA * cA) < area
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] blur(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>computeGaborEnergy</code> 
     * M-function with 12 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
     * <pre>
     * % set all the initial data-variables
     *   %data.imagename=strcat(pwd, '\\inputimages\\synthetic1.png'); % init. imagename
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] computeGaborEnergy(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>convolution</code> 
     * M-function with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
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
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] convolution(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>dilate</code> M-function 
     * with 1 input argument.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] dilate(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>gaborfilter</code> 
     * M-function with 7 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
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
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] gaborfilter(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>gaborkernel2d</code> 
     * M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
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
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] gaborkernel2d(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the 
     * <code>getBlurredGaborResponses</code> M-function with 2 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] getBlurredGaborResponses(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>getGaborResponse</code> 
     * M-function with 2 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] getGaborResponse(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>getRadialList</code> 
     * M-function with 4 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] getRadialList(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>readandinit</code> 
     * M-function with 6 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * M-documentation as provided by the author of the M function:
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
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] readandinit(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>SystemConfig</code> 
     * M-function with 0 input argument.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * No usage documentation is available for this function.  (To fix this, the function 
     * author should insert a help comment at the beginning of their M code.  See the 
     * MATLAB documentation for more details.)
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the M function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.jmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] SystemConfig(int nargout, Object... rhs) throws RemoteException;
  
    /** Frees native resources associated with the remote server object */
    void dispose() throws RemoteException;
}
