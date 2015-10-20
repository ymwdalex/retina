function [output mem] = reflectionInvariantCOSFIRE(inputImage,detector,params,mem,funCOSFIRE)

% Apply the given COSFIRE filter 
[nonreflectionoutput mem] = feval(funCOSFIRE,inputImage,detector,params,mem);

% Apply a COSFIRE filter which is selective for a reflected version about the y-axis 
% of the pattern of interest 
reflectionDetector = detector;

if params.orientationselectivefilter.symmetric == 1
    reflectionDetector.subunits(2,:) = mod(pi - reflectionDetector.subunits(2,:),pi);
else
    reflectionDetector.subunits(2,:) = mod(pi - reflectionDetector.subunits(2,:),2*pi);
end
reflectionDetector.subunits(4,:) = mod(pi - reflectionDetector.subunits(4,:),2*pi);

[reflectionoutput mem] = feval(funCOSFIRE,inputImage,reflectionDetector,params,mem);

% Take the maximum value of the output of the two COSFIRE filters
output = max(nonreflectionoutput,reflectionoutput);