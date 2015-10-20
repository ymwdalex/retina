% 
% file = 'D:\MatServer\Dataset\groundtruth\32_manual1.gif';
% f = imread(file);
% 
% imshow(f); hold on; scatter(coordinates(:,2), coordinates(:,1), 'r.' );
% 'D:\MatServer\21_training_1328885077583.gif'
% maxDist = 10;

function [ coordinates ] = copyPickBestCircle( coordinates, maxDist, inputResponseFile)
% coordinates = load(coordinatesFile);
Y = pdist(coordinates,'euclidean'); 
Z = linkage(Y,'single'); 
T = cluster(Z,'cutoff',maxDist, 'criterion', 'distance'); 

maxLocalMaxflag = zeros(size(coordinates, 1), 1);
g = imread(inputResponseFile);
 
for i = 1 :  max(T)
    set = find(T == i);
    coorVector = [coordinates(set, 1), coordinates(set, 2)];
    pixel = zeros(size(coorVector, 1), 1);
    for j = 1 : size(coorVector, 1)
        pixel(j) = g(coorVector(j, 1), coorVector(j, 2));
    end
    [value idx] = max(pixel);
    maxLocalMaxflag(set(idx(1))) = 1;
end
max(T)
% just keep the point with max response
coordinates(maxLocalMaxflag == 0, :) = [];

end
