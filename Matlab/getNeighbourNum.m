function [ g ] = getNeighbourNum( f, mod )

[m n] = size(f);
g = uint8(zeros(m, n));

for i =  1 : m
    for j = 1 : n
        if inF(f, i-1, j)
            g(i,j) = g(i,j) + uint8(f(i-1, j)>0);
        end
        if inF(f, i, j-1)
            g(i,j) = g(i,j) + uint8(f(i, j-1) > 0);
        end
        if inF(f, i, j+1)
            g(i,j) = g(i,j) + uint8(f(i, j+1) > 0);
        end
        if inF(f, i+1, j)
            g(i,j) = g(i,j) + uint8(f(i+1, j) > 0);
        end
        % 8 neighbour
        if mod == 1
            if inF(f, i-1, j-1)
                g(i,j) = g(i,j) + uint8(f(i-1, j-1)>0);
            end
            if inF(f, i-1, j+1)
                g(i,j) = g(i,j) + uint8(f(i-1, j+1) > 0);
            end
            if inF(f, i+1, j-1)
                g(i,j) = g(i,j) + uint8(f(i+1, j-1) > 0);
            end
            if inF(f, i+1, j+1)
                g(i,j) = g(i,j) + uint8(f(i+1, j+1) > 0);
            end
        end
    end
end

end

function flag = inF(F, x, y)
    [m n] = size(F);
    if (x > 0) && (x <= m) && (y>0) && (y<=n)
        flag = 1;
    else
        flag = 0;
    end
end

