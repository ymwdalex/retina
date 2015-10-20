function gb = getGaborResponse(img,params)
if nargin == 1
    params.aspectratio = 0.5;
    params.bandwidth = 2;
    params.lambdalist = 4;
    params.noriens = 16;
    params.phaseoffset = 0;
    params.t0 = 0;
    params.halfwave = 0;
    params.inhibMethod = 1;
end
inhibition.method = params.inhibMethod;
inhibition.alpha = 1;

for lambda = 1:length(params.lambdalist)
    gabor = computeGaborEnergy(img,params.lambdalist(lambda),params.aspectratio,params.bandwidth,params.noriens*2,params.phaseoffset,params.halfwave,2,inhibition,10,params.thinning,params.t0);
    gb(:,:,:,lambda) = gabor(:,:,1,1:params.noriens);
end