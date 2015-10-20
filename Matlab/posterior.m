% This file is for postprocessing to get a more accurate position
% It is not used now
% Zhe Sun

close all;
clear all;
clc;

% file = 'D:\MatServer\Dataset\groundtruth\32_manual1.gif';
% f = imread(file);
% 
% g = imread('D:\MatServer\21_training_1328885077583.gif');
% load('coordinates.mat');
% imshow(f); hold on; scatter(coordinates(:,2), coordinates(:,1), 'r.' );
% 
% maxLocalMaxflag = zeros(size(coordinates, 1), 1);
% 
% Y = pdist(coordinates,'euclidean'); 
% Z = linkage(Y,'single'); 
% threshold = 10;
% T = cluster(Z,'cutoff',threshold, 'criterion', 'distance'); 
% 
% for i = 1 :  max(T)
%     set = find(T == i);
%     coorVector = [coordinates(set, 1), coordinates(set, 2)];
%     pixel = zeros(size(coorVector, 1), 1);
%     for j = 1 : size(coorVector, 1)
%         pixel(j) = g(coorVector(j, 1), coorVector(j, 2));
%     end
%     [value idx] = max(pixel);
%     maxLocalMaxflag(set(idx(1))) = 1;
% end
% max(T)
% % just keep the point with max response
% coordinates(maxLocalMaxflag == 0, :) = [];

file = 'D:\MatServer\Dataset\groundtruth\21_manual1.gif';
f = imread(file);

coordinates = load('21_training_coordinate.txt');
% imshow(f); hold on; scatter(coordinates(:,2), coordinates(:,1), 'r.' );

radius = 16;
figure; imshow(f); hold on;
% j = 2;

for j = 1 : size(coordinates, 1)
    row = coordinates(j, 1);
    col = coordinates(j, 2);
    scatter(col, row, 'r.');
    
    f1 = f(row-radius:row+radius, col-radius:col+radius);
    f2 = bwmorph(f1, 'skel', Inf);
    f3 = bwmorph(f2, 'branchpoints');
%     H =  fspecial('gaussian', [5,5], 1);
%     f3 = imfilter(f2, H);
    
    [x y] = find(f3);
    min = Inf;
    index = 0;
    if isempty(x)
        newY = col; newX = row;
    else
        for i = 1 : length(x)
            d = (x(i)-radius-1)^2 + (y(i)-radius-1)^2;
            if d < min
                min = d;
                index = i;
            end
        end
        newX = x(index);
        newY = y(index);
    end
    scatter(newY-radius-1+col, newX-radius-1+row, 'g.');
end

folder = 'small';
mkdir(folder);
for j = 1 : size(coordinates, 1)
    smallImg = zeros(2*radius+1, 2*radius+1, 3);
    
    row = coordinates(j, 1);
    col = coordinates(j, 2);
    
    f1 = f(row-radius:row+radius, col-radius:col+radius);
    smallImg(:,:,1) = f1;
    smallImg(:,:,2) = f1;
    smallImg(:,:,3) = f1;
    smallImg(radius+1, radius+1, 1) =  255;
    smallImg(radius+1, radius+1, 2) =  0;
    smallImg(radius+1, radius+1, 3) =  0;
    
    f2 = bwmorph(f1, 'skel', Inf);
    f3 = bwmorph(f2, 'branchpoints');
    
    [x y] = find(f3);
    min = Inf;
    index = 0;
    if isempty(x)
        newY = col; newX = row;
    else
        for i = 1 : length(x)
            d = (x(i)-radius-1)^2 + (y(i)-radius-1)^2;
            if d < min
                min = d;
                index = i;
            end
        end
        newX = x(index);
        newY = y(index);
    end
    smallImg(newX, newY, 1) =  0;
    smallImg(newX, newY, 2) =  255;
    smallImg(newX, newY, 3) =  0;
    
    filename = sprintf('%03d.png', j);
    imwrite(smallImg, [folder '\' filename]);
end


% imshow(f1);hold on; scatter(radius+1, radius+1, 'r.'); 
% scatter(newY, newX, 'g.');