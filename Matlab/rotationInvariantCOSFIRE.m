function [output mem] = rotationInvariantCOSFIRE(inputImage,detector,params,mem,funCOSFIRE)

output = zeros(size(inputImage));
rotateDetector = detector;

for psiindex = 1:length(params.invariance.rotation.psilist)
    % Shift the values of parameters (theta,rho) of every subunit by a given psi value
    if params.orientationselectivefilter.symmetric == 1
        rotateDetector.subunits(2,:) = mod(detector.subunits(2,:) + params.invariance.rotation.psilist(psiindex),pi);
    else
        rotateDetector.subunits(2,:) = mod(detector.subunits(2,:) + params.invariance.rotation.psilist(psiindex),2*pi);
    end
    rotateDetector.subunits(4,:) = mod(detector.subunits(4,:) + params.invariance.rotation.psilist(psiindex),2*pi);            
    
    % Compute the output of COSFIRE for the given psi value
    [rotoutput mem] = feval(funCOSFIRE,inputImage,rotateDetector,params,mem);
    
    % Take the maximum over the COSFIRE outputs for all given values of psi
    output = max(output,rotoutput);
end