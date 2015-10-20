function radialList = getRadialList(maxrho,d0,alpha,nradials)

dmax = d0 + alpha*maxrho;
diameterRatio = (dmax/d0) ^(1/(nradials-1));
dlist = d0 * (diameterRatio.^(0:nradials-1));
radialList = (dlist - d0) / alpha;