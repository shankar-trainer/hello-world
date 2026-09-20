import pandas as pd
#
df=pd.read_csv('ex1.csv')
print(df)

# df1=pd.read_table('ex1.csv')
df1=pd.read_table('ex1.csv',sep=',')

print('\ntable \n ',df1)

df1.to_csv('out1.csv')



