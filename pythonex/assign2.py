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
name1=[];

for i in range(length1):
    length2=len(PhysicsMark[i])
    total=total+(PhysicsMark[i][length2-1])
    
    if PhysicsMark[i][length2-1] < 20:
        name1.append(PhysicsMark[i][0]+" "+PhysicsMark[i][1])

avg=total/i;
print('total marks ',total)
print('average marks ',avg)

print('\nthe names of the pupils who scored less than 20\n')

for i in range(len(name1)):
    print (name1[i])

SortedData = sorted(PhysicsMark, key=lambda tup: (tup[2]), reverse=True)

print("\nThe details of the gold, silver and bronze medal winners\n")
for i in range(3):
    for j in range(len(PhysicsMark[i])):
        print( SortedData[i][j], end=' ')
    print() 
  