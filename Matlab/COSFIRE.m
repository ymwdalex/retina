function [output mem] = COSFIRE(inputImage,detector,params,mem)       
    output = -1; % Initialise the output of the COSFIRE filter
    sz = size(inputImage);

    if isempty(mem)
        % The channels of the sub units that have already been computed
        mem.subunit.Output   = cell(0);
        mem.subunit.channel.lambda = [];
        mem.subunit.channel.theta = [];
        mem.subunit.channel.rho = [];

        % The channels of the Orientation Selective Filters that have already been computed    
        mem.osf.Output       = cell(0);   
        mem.osf.channel.lambda = [];
        mem.osf.channel.theta = [];        
    end
    
    nsubunits = size(detector.subunits,2);
    subunit.output = zeros(sz(1),sz(2),nsubunits);    
    I = zeros(sz(1),sz(2),nsubunits);
      
    % Loop through all tuples (subunits) of the detector
    for sindex = 1:nsubunits
        lambda = detector.subunits(1,sindex);
        theta  = detector.subunits(2,sindex);        
        rho    = detector.subunits(3,sindex);
            
        % Check if the output of the subunit [lambda,theta,rho,phi=0] 
        % has already been computed.
        subunit.channel.lambda = find(mem.subunit.channel.lambda == round(lambda*100000)/100000,1);
        subunit.channel.theta  = find(mem.subunit.channel.theta  == round(theta*180/pi.*100000)/100000,1);
        subunit.channel.rho    = find(mem.subunit.channel.rho    == round(rho*100000)/100000,1);
        
        %subunitChannel = find(ismember(mem.subunit.Channels,round([lambda,theta,rho].*1000)./1000,'rows'),1);        
        if isempty(subunit.channel.lambda) || isempty(subunit.channel.theta) || isempty(subunit.channel.rho) || isempty(mem.subunit.Output{subunit.channel.lambda,subunit.channel.theta,subunit.channel.rho}) 
            % Check if the output of the orientation selective filter with
            % parameters [lambda,theta] has already been computed            
            osf.channel.lambda = find(mem.osf.channel.lambda == round(lambda.*100000)./100000,1);
            osf.channel.theta  = find(mem.osf.channel.theta  == round(theta.*180/pi.*100000)./100000,1);

            if isempty(osf.channel.lambda) || isempty(osf.channel.theta) || isempty(mem.osf.Output{osf.channel.lambda,osf.channel.theta})
                % Compute the output of the orientation selective filter with
                % parameters [lambda, theta]
                
                if isempty(osf.channel.lambda)
                    osf.channel.lambda = length(mem.osf.channel.lambda) + 1;
                    mem.osf.channel.lambda(osf.channel.lambda) = round(lambda*100000)/100000;
                end
                if isempty(osf.channel.theta)
                    osf.channel.theta = length(mem.osf.channel.theta) + 1;
                    mem.osf.channel.theta(osf.channel.theta) = round(theta*180/pi*100000)/100000;
                end                                
                mem.osf.Output{osf.channel.lambda,osf.channel.theta} = getOrientationSelectiveOutput(inputImage,params.orientationselectivefilter,lambda,theta);
%                 C = imcrop(mem.osf.Output{osf.channel.lambda,osf.channel.theta},[70 25 100 100]);
%                 figure;showim(C);axis off;
%                 z = 0;
                %imwrite(C,['F:\George@GEORGE-PC\#C\ObjectRecognition\Papers\revision\Paper4 - Pattern Recognition Letters\PaperRevision\images\fig4\g',num2str(sindex),'.png']);
                %mem.osf.Output{osf.channel.lambda,osf.channel.theta} = mem.osf.Output{osf.channel.lambda,osf.channel.theta} .* (1-inputImage);
                %mem.osf.Output{osf.channel.lambda,osf.channel.theta} = mem.osf.Output{osf.channel.lambda,osf.channel.theta} .* inputImageMask;
                        
%                 t1 = 0.05*max(mem.osf.Output{osf.channel.lambda,osf.channel.theta}(:));
%                 bw = hysthresh(mem.osf.Output{osf.channel.lambda,osf.channel.theta},t1,0.5*t1);
%                 mem.osf.Output{osf.channel.lambda,osf.channel.theta} = mem.osf.Output{osf.channel.lambda,osf.channel.theta} .* bw;                
            end
                                   
            % Convert the polar coordinate vector (rho,phi=0) to image coordinates
            [col row] = pol2cart(0,rho);        
            
            % Compute the radius of the 2d Gaussian function that will be
            % used to blur the corresponding osfOutput.
            r = (params.d0 + (params.alpha*rho))/2;
            
            % Compute the output of the subunit with parameters
            % [lambda,theta,rho,phi=0] by blurring and shifting the corresponding osfOutput            
            if isempty(subunit.channel.lambda)
                subunit.channel.lambda = length(mem.subunit.channel.lambda) + 1;
                mem.subunit.channel.lambda(subunit.channel.lambda) = round(lambda*100000)/100000;
            end
            if isempty(subunit.channel.theta)
                subunit.channel.theta = length(mem.subunit.channel.theta) + 1;
                mem.subunit.channel.theta(subunit.channel.theta) = round(theta*180/pi*100000)/100000;
            end                                
            if isempty(subunit.channel.rho)
                subunit.channel.rho = length(mem.subunit.channel.rho) + 1;
                mem.subunit.channel.rho(subunit.channel.rho) = round(rho*100000)/100000;
            end                                
                                    
            if length(unique(mem.osf.Output{osf.channel.lambda,osf.channel.theta}(:))) > 1
                mem.subunit.Output{subunit.channel.lambda,subunit.channel.theta,subunit.channel.rho} = blurshift(mem.osf.Output{osf.channel.lambda,osf.channel.theta},r/3,-round(row),round(col));
            else
                mem.subunit.Output{subunit.channel.lambda,subunit.channel.theta,subunit.channel.rho} = zeros(size(mem.osf.Output{osf.channel.lambda,osf.channel.theta}));
            end
                        
            if params.useweighting == 1
                weight = exp(-rho^2/(2*params.weightingsigma*params.weightingsigma)); 
                mem.subunit.Output{subunit.channel.lambda,subunit.channel.theta,subunit.channel.rho} = mem.subunit.Output{subunit.channel.lambda,subunit.channel.theta,subunit.channel.rho} .^ weight;
            end                                    
        end
        
        % Shift the output of subunit [lambda,theta,rho,phi=0] according to
        % the value of phi        
        phi = detector.subunits(4,sindex);
        [col0 row0] = pol2cart(0,rho);
        [col row]   = pol2cart(phi,rho);
        shiftrow    = -round((row0-row));
        shiftcol    = round(col0-col);
        shiftvector = [shiftrow,shiftcol];

        soutput = imshift(mem.subunit.Output{subunit.channel.lambda,subunit.channel.theta,subunit.channel.rho},shiftvector(1),shiftvector(2));
%         C = imcrop(soutput,[70 25 100 100]);
%         figure;showim(C);axis off;
        %imwrite(C,['F:\George@GEORGE-PC\#C\ObjectRecognition\Papers\revision\Paper4 - Pattern Recognition Letters\PaperRevision\images\fig4\s',num2str(sindex),'.png']);
        
        if ~any(soutput(:))
            % if soutput is all zeros then the output of the COSFIRE filter
            % will also be zero in every (x,y) position. So its useless to 
            % compute the outputs of the remaining subunits
            output = zeros(sz);
            break;
        end
        
        subunit.output(:,:,sindex) = soutput;        
        if params.useweighting == 1
            subunit.weight(sindex) = exp(-rho^2/(2*params.weightingsigma*params.weightingsigma)); 
        elseif params.useweighting == 0
            subunit.weight(sindex) = 1;
        end
    end
    
    if output == -1
%         M = max(I,[],3);        
%         for sindex = 1:nsubunits
%             t1 = 0.1*max(max(subunit.output(:,:,sindex)));bw = hysthresh(subunit.output(:,:,sindex),t1,0.5*t1);
%             subunit.output(:,:,sindex) = subunit.output(:,:,sindex) .* bw;
%             %subunit.output(:,:,sindex) = subunit.output(:,:,sindex) .* (I(:,:,sindex) > (0.75 .* M));
%         end
%         
%         M = max(subunit.output,[],3);
%         for sindex = 1:nsubunits
%             S = subunit.output(:,:,sindex);
%             S(S < (0.5 .* M)) = 0;
%             subunit.output(:,:,sindex) = S;
%         end
                
        % Compute the COSFIRE output: weighted geometric mean
        output = prod(subunit.output,3).^(1/sum(subunit.weight));
%         output = prod(subunit.output(:,:,valid),3).^(1/sum(subunit.weight(valid)));
%         C = imcrop(output,[70 25 100 100]);
        % imwrite(C,'F:\George@GEORGE-PC\#C\ObjectRecognition\Papers\revision\Paper4 - Pattern Recognition Letters\PaperRevision\images\fig4\output.png'); 
    end
end