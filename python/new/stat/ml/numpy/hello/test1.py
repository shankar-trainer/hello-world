import pandas
from pandas import Series, DataFrame

print(Series([4,7,-5,3]))
obj=Series([4,7,-5,3])
print("values ",obj.values)
print("Keys ",obj.keys())
print("index ",obj.index)

data = {'state': ['Ohio', 'Ohio', 'Ohio', 'Nevada', 'Nevada', 'Nevada'],
'year': [2000, 2001, 2002, 2001, 2002, 2003],
'pop': [1.5, 1.7, 3.6, 2.4, 2.9, 3.2]}
frame=DataFrame(data)
print (frame)