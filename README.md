This website implement the COSFIRE filter.

George Azzopardi and Nicolai Petkov, "Trainable COSFIRE filters for keypoint detection and pattern recognition", IEEE Transactions on Pattern Analysis and Machine Intelligence, vol. 35(2), pp. 490-503, 2013.
http://www.computer.org/csdl/trans/tp/2013/02/ttp2013020490.pdf

A COSFIRE filter is automatically configured to be selective for a local contour pattern specified by a single example. The configuration comprises selecting given channels of a bank of Gabor filters and determining certain blur and shift parameters. Gabor filters are, however, not intrinsic to the method and any other orientation-selective filters can be used. A COSFIRE filter response is computed as the weighted geometric mean of the blurred and shifted responses of the selected Gabor filters. It shares similar properties with some shape-selective neurons in visual cortex, which provided inspiration for this work. 
In our publication, which is given below, we demonstrated the effectiveness of the proposed filters in three applications: the detection of retinal vascular bifurcations (DRIVE data set: 98.50% recall, 96.09% precision), the recognition of handwritten digits (MNIST data set: 99.48% correct classification), 
and the detection and recognition of traffic signs in complex scenes (100% recall and precision).