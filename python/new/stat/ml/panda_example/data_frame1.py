import pandas as pd

data={
	'id':[10001,10002,10003],
	'name':['ram kumar', 'shyam kumar','amit kumar'],
	'salary':[200000,150000,450000]
}

frame=pd.DataFrame(data)
print(frame)
print('with head\n', frame.head())

#use columns with order 
frame=pd.DataFrame(data,columns=['name','id','salary'])
print(frame)
print('\n only columns ',frame.columns)

print('\n id only  \n',frame['id'])

# row using loc
print('\n specific row 1  only  \n',frame.loc[0])
print('\n specific row  2 only  \n',frame.loc[1])

# using index 
frame=pd.DataFrame(data,columns=['name','id','salary'], index=['one','two','three'])
print('\nusing index \n',frame)

print('\n specific row 1  only  \n',frame.loc['one'])


