sum=lambda x,y,z:x+y+z

print(sum(1,2,3))
ar=[10,11,12]

result=map(lambda a:a*a,ar)
print(list(result))

def hello(b):
	return b*3

result=map(hello,ar)
print(list(result))


result1=filter(lambda p:p%2==0,ar)

print(list(result1))
