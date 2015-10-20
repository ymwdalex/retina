function [output mem] = scaleInvariantCOSFIRE(inputImage,detector,params,mem,funCOSFIRE)

if ~any(ismember([0 1],params.invariance.scale.delta))
    error('Parameter delta must have either a value of 0 or a value of 1');
end

output = zeros(size(inputImage));
scaleDetector = detector;

for nuindex = 1:length(params.invariance.scale.nulist)
    % Scale the value of parameter lambda of every subunit by a given nu value
    scaleDetector.subunits(1,:) = detector.subunits(1,:) * params.invariance.scale.nulist(nuindex);
    %f1 = scaleDetector.subunits(1,:) < min(params.lambdalist);
    %f2 = scaleDetector.subunits(1,:) > max(params.lambdalist);
    %scaleDetector.subunits(1,f1) = min(params.lambdalist);
    %scaleDetector.subunits(1,f2) = max(params.lambdalist);
    
    if params.invariance.scale.delta == 1    
        % Scale the values of parameter rho of every subunit by a given nu value
        scaleDetector.subunits(3,:) = detector.subunits(3,:) * params.invariance.scale.nulist(nuindex);
    end
        
    % Compute the output of COSFIRE for the given psi value
    [scaleoutput mem] = feval(funCOSFIRE,inputImage,scaleDetector,params,mem);
    
    % Take the maximum over the COSFIRE outputs for all given values of nu
    output = max(output,scaleoutput);
end