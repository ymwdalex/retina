% This is the entry of Matlab code
% Arguments:
%   currPath: the working folder. Matlab code doesn't know the working
%   folder of the web application, it must be passed by Java Servlet.
%   imfilename: The image file which will be processed
% Zhe Sun


function retina(currPath, imfilename)
    % cd(currPath);  If want to test standalone in Matlab, cd(currPath) is
    % needed.
    
    % config the params, especially the working folder for
    % input/output/operators ...
    params = SystemConfig(currPath);
    mem = [];
    
    % output response and localmax in this folder
    % The name of the folder is just the name of the file
    pathName = [params.dataset.output imfilename '\'];
    mkdir(pathName);
    
    % read the input image, now only 'gif' is supported
    imgName = fullfile(params.dataset.groundtruth, [imfilename '.gif']);
    inputImage = single(imread(imgName));
    blurredGabor = [];
    
    % traverse every operator
    dirListing = dir(params.dataset.operators);
    index = 0;
    for d = 1:length(dirListing)
        if ~dirListing(d).isdir
            index = index + 1;
            
            % load the operator
            opfilename = fullfile(params.dataset.operators,dirListing(d).name);
            load(opfilename);
            
            % And get the response of COSFIRE filter
            % [opresponse blurredGabor] = applyCOSFIRE(inputImage,op,params,blurredGabor,[]);                
            [opresponse mem] = invariantCOSFIRE(inputImage,op,params,mem,params.invariance.mode);
            
            % write the filter back to the file, java servlet will do the
            % further step
            [~, opPureName, ~] = fileparts(dirListing(d).name);
            imwrite(im2uint8(opresponse), [pathName opPureName, '.gif']);
            
            % also write the local maximum to the file, java servlet will
            % do the further step
            localmax = opresponse .* (imregionalmax(opresponse) > 0);
            imwrite(im2uint8(localmax), [pathName opPureName '_localMax.gif']);           
        end
    end
    
%     output = max(opresponse,[],3);
%     localmax = output .* (imregionalmax(output) > 0);
%     [row col] = find(localmax);
%     for coord = 1:length(row)
%         % draw circle around [r(coord),c(coord)]
%     end
    
%     thresholdList{j} = [max([0,operator.threshold-handles.params.t3tolwidth]) min([1,operator.threshold+handles.params.t3tolwidth])];
%     retinaimage.operator(j) = struct('stats',[],'opname',opfilename);
%     [retinaimage.operator(j).stats guih] = interactiveEvaluate(handles.axesInput,opresponse,handles.params,inputImage,selectedImageList{i},[],thresholdList{j},1,guih);        
%     response{j} = opresponse{1};

%     imwrite(output, [params.dataset.output,outputName]);

end

