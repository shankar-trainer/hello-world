from scipy import sparse
import numpy as np 

eye=np.eye(4)
print(eye);
# print(format(eye))

sparse_matrix=sparse.csr_matrix(eye)

print("\n sparse_matrix \n",sparse_matrix)
