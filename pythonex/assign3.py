PhysicsMark =  [

[ "James" , "Smith" , 5 ],
[ "Alexandra" , "Zarrent" , 67 ],
[ "Amy" , "White" , 4 ],
[ "Nicholas" , "Bilton" , 58 ],
[ "Malcolm" , "Kelly" , 27 ],
[ "Fiona" , "Kevill" , 29 ],
[ "George" , "Leahy" , 98 ],
[ "Michael" , "Sampras" , 99 ],
[ "Martin" , "Potter" , 61 ],
[ "Felix" , "Calik" , 4 ],
[ "Elouise" , "Iilyas" , 11 ],
[ "Jemima" , "Montgomerie" , 12 ],
[ "Test" , "Montgomerie" , 100 ],
]

total = 0
count = 0

avg=0

length1=len(PhysicsMark)

for i in range(length1):
    length2=len(PhysicsMark[i])
    total=total+(PhysicsMark[i][length2-1])

avg=total/i;
print('total marks ',total)
print('average marks ',avg)

SortedData = sorted(PhysicsMark, key=lambda tup: (tup[2]), reverse=True)

print("\nthe names of the pupils who got the lowest 3 scores\n")
for i in range(length1-1,length1-4,-1):
        print( SortedData[i][0],SortedData[i][1])
  
name1=[];

for i in range(length1):
    s1=PhysicsMark[i][1]
    s2=PhysicsMark[i][0]
    s3=PhysicsMark[i][2]

    name1.append(s1[:3]+s2[0]+str(s3))

for i in range(length1):
    print(name1[i])


