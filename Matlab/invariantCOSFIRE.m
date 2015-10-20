function [output mem] = invariantCOSFIRE(inputImage,operator,params,mem,invarianceMode)

NON_INVARIANT                       = 1;
ROTATION_INVARIANT                  = 2;
SCALE_INVARIANT                     = 3;
REFLECTION_INVARIANT                = 4;
ROTATION_SCALE_INVARIANT            = 5;
REFLECTION_ROTATION_INVARIANT       = 6;
REFLECTION_SCALE_INVARIANT          = 7;
REFLECTION_ROTATION_SCALE_INVARIANT = 8;

cosfirefun = @(inputImage,operator,params,mem) COSFIRE(inputImage,operator,params,mem);                                          

    switch invarianceMode
        case NON_INVARIANT
            [output mem] = feval(cosfirefun,inputImage,operator,params,mem);
        case ROTATION_INVARIANT
            [output mem] = rotationInvariantCOSFIRE(inputImage,operator,params,mem,cosfirefun);
        case SCALE_INVARIANT
            [output mem] = scaleInvariantCOSFIRE(inputImage,operator,params,mem,cosfirefun);
        case REFLECTION_INVARIANT
            [output mem] = reflectionInvariantCOSFIRE(inputImage,operator,params,mem,cosfirefun);
        case ROTATION_SCALE_INVARIANT
            scalefun = @(inputImage,operator,params,mem) scaleInvariantCOSFIRE(inputImage,operator,params,mem,cosfirefun);
            [output mem] = rotationInvariantCOSFIRE(inputImage,operator,params,mem,scalefun);
        case REFLECTION_ROTATION_INVARIANT
            rotationfun = @(inputImage,operator,params,mem) rotationInvariantCOSFIRE(inputImage,operator,params,mem,cosfirefun);
            [output mem] = reflectionInvariantCOSFIRE(inputImage,operator,params,mem,rotationfun);        
        case REFLECTION_SCALE_INVARIANT
            scalefun = @(inputImage,operator,params,mem) scaleInvariantCOSFIRE(inputImage,operator,params,mem,cosfirefun);
            [output mem] = reflectionInvariantCOSFIRE(inputImage,operator,params,mem,scalefun);                
        case REFLECTION_ROTATION_SCALE_INVARIANT
            scalefun = @(inputImage,operator,params,mem) scaleInvariantCOSFIRE(inputImage,operator,params,mem,cosfirefun);
            rotationfun = @(inputImage,operator,params,mem) rotationInvariantCOSFIRE(inputImage,operator,params,mem,scalefun);
            [output mem] = reflectionInvariantCOSFIRE(inputImage,operator,params,mem,rotationfun);                     
    end
end
