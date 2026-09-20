import os
os.environ['TF_ENABLE_ONEDNN_OPTS'] = '0'

import tensorflow as tf
tensor=tf.constant([[11,22,33],[44,55,66]])
shape=tensor.shape

print(tensor)
print(shape)
