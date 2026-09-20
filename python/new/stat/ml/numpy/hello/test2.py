from operator import index

import numpy as np
import pandas as pd
from pandas import DataFrame

ar=pd.Series([11,22,33,44])
print(ar)
print("values are ",ar.values)
print("keys are ",ar.keys)
print("index are ",ar.index)

ar=pd.Series([11,22,33,44],index=['a','b','c','d'])

print("values are ",ar.values)
print("keys are ",ar.keys)
print("index are ",ar.index)

print("np.exp",np.exp(ar))

fr=DataFrame({[1,2,3][4,5,6][7,8,9]});
print(fr)

