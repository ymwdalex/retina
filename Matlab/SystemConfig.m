function params = SystemConfig(currPath)

params.nradials = 3;
params.maxrho = 10;
params.noriens = 8;
params.lambdalist = 4.*(sqrt(2).^[0:4]);
params.phaseoffset = 0;
params.halfwave = 0;
params.bandwidth = 2;
params.aspectratio = 0.5;
params.t0 = 0.2;
params.t1 = 0.75;
params.t2 = [0.1 1];
params.d0 = 4;
params.alpha = 0.625;
params.eta = pi/8;
params.inhibMethod = 1;
params.inhibAlpha = 0;
params.thinning = 0;
params.invariance.mode = 8;
params.invariance.rotation.psilist = [0:22.5:360-22.5].*pi/180;
params.invariance.scale.nulist = 2.^((-1:1)./2);
params.invariance.scale.delta = 1;
params.invariance.reflection = 0;
params.verbose = 1;
params.screenSize = get(0,'ScreenSize');

% configure the folder path here
params.dataset.groundtruth = [currPath 'Dataset/groundtruth/'];
params.dataset.testing = [currPath 'Dataset/testing/'];
params.dataset.training = [currPath 'Dataset/training/'];
params.dataset.mask = [currPath 'Dataset/mask/'];
params.dataset.output = [currPath 'Dataset/outputImg/'];
params.dataset.samples = [currPath 'Dataset/samples/bifurcations.bmp'];
params.dataset.operators = [currPath 'Dataset/operators/'];
params.dataset.opresponse = [currPath 'Dataset/operators/responses/'];
params.dataset.testingData = [params.dataset.testing 'data' filesep];
params.dataset.trainingData = [params.dataset.training 'data' filesep];
params.dataset.ext = 'gif';
params.saveFolder = [currPath 'Experiments/'];
% params.t3tolwidth = 0.05;
params.evaluateFull = 1;
params.useweighting = 1;
params.weightingsigma = sqrt(-params.maxrho^2/(2*log(0.5)));
params.Evaluate = 1;
params.minopprecision = 1;
% params.minopprecision = 1;
params.filterResponseDist = 8;
% params.keylist = [34,30];

params.orientationselectivefilter.name = 'Gabor';
params.orientationselectivefilter.phaseoffset = 0;
params.orientationselectivefilter.halfwave = 0;
params.orientationselectivefilter.bandwidth = 2;
params.orientationselectivefilter.aspectratio = 0.5;
params.orientationselectivefilter.t0 = 0.2;
params.orientationselectivefilter.inhibMethod = 1;
params.orientationselectivefilter.inhibAlpha = 0;
params.orientationselectivefilter.thinning = 0;
params.orientationselectivefilter.symmetric = params.orientationselectivefilter.phaseoffset == 0 || params.orientationselectivefilter.phaseoffset == pi;

if ~exist(params.saveFolder)
    mkdir(params.saveFolder);
end

if ~exist(params.dataset.testingData)
    mkdir(params.dataset.testingData);
end

if ~exist(params.dataset.trainingData)
    mkdir(params.dataset.trainingData);
end

if ~exist(params.dataset.opresponse)
    mkdir(params.dataset.opresponse);
end