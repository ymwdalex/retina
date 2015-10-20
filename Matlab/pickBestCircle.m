% 
% file = 'D:\MatServer\Dataset\groundtruth\32_manual1.gif';
% f = imread(file);
% 
% imshow(f); hold on; scatter(coordinates(:,2), coordinates(:,1), 'r.' );
% 'D:\MatServer\21_training_1328885077583.gif'
% maxDist = 10;

% function [ newCoor ] = pickBestCircle( coordinates, maxDist)%, inputResponse)
% % coordinates = load(coordinatesFile);
% Y = pdist(coordinates,'euclidean'); 
% Z = linkage(Y,'complete'); 
% T = cluster(Z,'cutoff',maxDist, 'criterion', 'distance'); 
% 
% newCoor = [];
% 
% for i = 1 :  max(T)
%     set = find(T == i);
%     coorVector = [coordinates(set, 1), coordinates(set, 2)];
% %     pixel = zeros(size(coorVector, 1), 1);
% %     for j = 1 : size(coorVector, 1)
% %         pixel(j) = g(coorVector(j, 1), coorVector(j, 2));
% %     end
% %      [value idx] = max(pixel);
%     newCoor(i,:) = round(mean(coorVector,1));
% end
% 
% end

%  ====================================================================

% pickBestCircle.m
% Some output of the COSFIRE filter overlap with each other, or their
% distance is too near by each other. This file is to cluster the similiar COSFIRE
% response and pick the unique response which have the maximum value in the
% cluster
% Zhe Sun

% Input arguments:
%   coordinates: n*2 matrix, n is the number of coordinates
%              The first column is No of row, the second column is No of
%              column
%   maxDist: cutoff distance
%   inputResponse: n*1 matrix, n is the number of coordinates, the value is response 
%
% Output:
%   newCoor: the maximum response in one cluster
%  ====================================================================

function [ newCoor ] = pickBestCircle( coordinates, maxDist, inputResponse)

% cluster
% 1. must use "complete" (the farest distance) in linkage file
% 2. "cutoff" distance, if the distance is less than cutoff distance, the
% point will be regarded as one cluster.
Y = pdist(coordinates,'euclidean'); 
Z = linkage(Y,'complete'); 
T = cluster(Z,'cutoff',maxDist, 'criterion', 'distance'); 

newCoor = [];

for i = 1 :  max(T)
    set = find(T == i);
    coorVector = [coordinates(set, 1), coordinates(set, 2)];
    
    response = inputResponse(set);
    [maxResponse, index] = max(response);

% The code commented is get the mean of the cluster    
%     pixel = zeros(size(coorVector, 1), 1);
%     for j = 1 : size(coorVector, 1)
%         pixel(j) = g(coorVector(j, 1), coorVector(j, 2));
%     end
%      [value idx] = max(pixel);

    newCoor(i,:) = coorVector(index, :);
end

end

