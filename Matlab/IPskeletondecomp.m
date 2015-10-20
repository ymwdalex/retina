% Skeleton operation
function [ result ] = IPskeletondecomp(A)

% the structure element is 3 by 3 ones
% B = [1,1,1;1,1,1;1,1,1];
B = strel('rectangle', [3 3]);

[m n] = size(A);
test = zeros(m,n);

% in first iteration, A erode kB = A
newA = A;

% begin iteration
k = 1;
while ~(isequal(newA, test))
    % get A erode B
    part1 = imerode(newA, B);
    part2 = imdilate(imerode(part1,B), B);
    Sk{k} = part1 - part2;  
    k = k+1;
    newA = part1;
end

%combine and get Skf
result = uint8(zeros(m,n));
for i = 1 : k-1
    result = result + ((i+1) .* Sk{i});
end

% Use build-in Erosion, Dilation and Open function to verify
%--------------------------------------------------
% A = im2double(imread('nutsbolts.tif'));
% B = ones(3,3);
% 
% [m n] = size(A);
% test = zeros(m,n);
% 
% % in first iteration, A erode kB = A
% newA = A;
% 
% k = 1;
% while ~(isequal(newA, test))
%     % get A erode B
%     part1 = imerode(newA, B);
%     part2 = imopen(part1,B);
%     Sk{k} = part1 - part2;  
%     %imshow(Sk{k});
%     k = k+1;
%     newA = part1;
% end
% 
% result = zeros(m,n);
% tmp =  zeros(m,n);
% for i = 1 : k-1
%     result = result + ((i+1) .* Sk{i});
%     tmp = result + Sk{i};
% end
% 
% subplot(1,2,1);
% imshow(tmp);
% subplot(1,2,2);
% imshow(A);  
%-----------------------------------------------------

end

