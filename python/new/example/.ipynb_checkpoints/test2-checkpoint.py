list1=[1,2,3,4,5]
list1.insert(3,11)
print(list1)

# list is mutable 

tuple1=('delhi','chennai','ooty')
print(tuple1)
for i in tuple1:
    print(i+", ")

list1[1]=9999
print(list1)

city=list(tuple1)
city[0]='kolkotta'
print(city)

