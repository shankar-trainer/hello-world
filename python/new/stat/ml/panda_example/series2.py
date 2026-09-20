import pandas as pd
series1=pd.Series([4,7,-5,2],index=['a','b','c','d'])
print(series1)

print('index ',series1.index)
print('values ',series1.values)

print('filter value>4', series1[series1>4])
print('\nfilter value*4', series1*4)
