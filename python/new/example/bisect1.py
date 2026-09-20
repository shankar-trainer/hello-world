import bisect

list1=[11,22,3,0,1,12]
list1.sort()
print(list1)

#bisect Return the index where to insert item x in list a, assuming a is sorted.


print(bisect.bisect(list1,4))
print(list1);

bisect.insort(list1,4)
print(list1)
