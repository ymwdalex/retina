function SImage = getBlurredGaborResponses(inputImage,params)

rholist = getRadialList(params.maxrho,params.d0,params.alpha,params.nradials);
sz = size(inputImage);
inhibition.method = 1;
inhibition.alpha = 0;

G = getGaborResponse(inputImage,params);

SImage = zeros(sz(1),sz(2),size(G,4),size(G,3),length(rholist), 'single');
minRC = [1 1];
maxRC = [sz(1) sz(2)];

for idxlambda = 1:size(G,4)
    for idxtheta = 1:size(G,3);
        for idxrho = 1:length(rholist)
            rho = rholist(idxrho);
            [col row] = pol2cart(0,rho);        
            r = (params.d0 + (params.alpha*rho))/2;
            SImage(:,:,idxlambda,idxtheta,idxrho) = blur(G(:,:,idxtheta,idxlambda),r/3,-round(row),round(col),minRC,maxRC);            
        end
    end
end