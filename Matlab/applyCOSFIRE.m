function [output blurredGabor guih] = applyCOSFIRE(inputImage,operator,params,blurredGabor,guih)

if isempty(blurredGabor)    
     blurredGabor = getBlurredGaborResponses(inputImage,params);
%     save blurredGabor blurredGabor;
%     fixedparams = [];
%     fixed = cell(0);
%     
%     % Get responses of a Bank of Gabor filters
%     writeProgress('Computing responses of a bank of Gabor filters ...',params.verbose);
%     tic;
%     gb = getGaborResponse(inputImage,params);
% else
%     gb = filterparams.gb;
%     fixedparams = filterparams.fixedparams;
%     fixed = filterparams.fixed;    
end

sz = size(inputImage);
output = zeros(sz);
dmax = params.d0 + params.alpha*params.maxrho;
diameterRatio = (dmax/params.d0) ^(1/(params.nradials-1));

thetalist = round([0:180/params.noriens:179]*pi/180*1000)/1000;
SImage = zeros(sz(1),sz(2),size(operator.subunits,2), 'single');

if params.invariance.rotation == 0
    oriensRange = 1;
else
    oriensRange = 1:params.noriens*2; 
end

for rot = oriensRange
    if ~isempty(guih)
        waitbar(guih.counter/guih.total,guih.h,[guih.prefix,'Rotation : ',num2str(rot),' of ',num2str(params.noriens*2)]);
        guih.counter = guih.counter + 1;
    end
    minRC = [1 1]; maxRC = [sz(1), sz(2)];         
    
    SF = operator.subunits;
    shift = pi/params.noriens*(rot-1);
    SF(2,:) = mod(SF(2,:) + shift,pi);
    SF(4,:) = mod(SF(4,:) + shift,2*pi);

    for s = 1:size(SF,2)
        lambda      = SF(1,s);
        theta       = SF(2,s);        
        rho         = SF(3,s);
        thetaindex  = find(ismember(thetalist,round(theta*1000)/1000));
        lambdaindex = find(ismember(round(params.lambdalist*1000)/1000,round(lambda*1000)/1000));
        rhoindex    = round(log((params.d0+params.alpha.*rho)/params.d0)/log(diameterRatio)+1);
        %gabor = gb(:,:,thetaindex,lambdaindex);
                
        if rho == 0
            SImage(:,:,s) = blurredGabor(:,:,lambdaindex,thetaindex,rhoindex);
        else
            [col0 row0] = pol2cart(0,rho);         
            [col row]   = pol2cart(SF(4,s),rho);

            shiftrow = -round((row0-row));
            shiftcol = round(col0-col);
            SImage(:,:,s) = circshift(blurredGabor(:,:,lambdaindex,thetaindex,rhoindex),[shiftrow,shiftcol]);                                            
        end
        
%         if params.invariance.scale == 0
%             mem1 = find(ismember(fixedparams,[SF(1,s),SF(2,s),SF(3,s)],'rows'));
%         else
%             mem1 = find(ismember(fixedparams,[SF(2,s),SF(3,s)],'rows'));
%         end
% 
%         if isempty(mem1)
%             rho = SF(3,s);
%             phi = SF(4,s);
%             
%             [col row] = pol2cart(phi,rho);        
%             r = (params.d0 + (params.alpha*rho))/2;
%             if sum(gabor(:)) > 0
%                 SImage(:,:,s) = blurshift(gabor,r/3,-round(row),round(col),minRC,maxRC);
%             else
%                 SImage(:,:,s) = zeros(size(gabor));
%             end
% 
%             fixed{end+1}.location = [round(row) round(col)];
%             fixed{end}.SImage = SImage(:,:,s);
%             if params.invariance.scale == 0
%                 fixedparams(end+1,:) = [SF(1,s),SF(2,s),SF(3,s)];
%             else
%                 fixedparams(end+1,:) = [SF(2,s),SF(3,s)];
%             end
%         else
%             [col row] = pol2cart(SF(4,s),SF(3,s));
%             col = round(col);
%             row = round(row);
% 
%             shiftrow = -(fixed{mem1}.location(1)-row);
%             shiftcol = fixed{mem1}.location(2)-col;
%             SImage(:,:,s) = circshift(fixed{mem1}.SImage,[shiftrow,shiftcol]);                                            
%         end

        if isempty(minRC) || isempty(maxRC)
            break;
        end            
    end
    rotSF = prod(SImage,3).^(1/size(SF,2));
    output = max(output,rotSF);        
end 

% filterparams.gb = gb;
% filterparams.fixedparams = fixedparams;
% filterparams.fixed = fixed;
