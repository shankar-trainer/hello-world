'''1. Mrs Elkins is a physics teacher

She wants a program to analyse pupil marks when doing the physics Olympiad.

She wants to encourage physics by awarding gold, silver and bronze medals to the

three pupils who have the highest marks.

Test data has been included in the code.

Write a program in python to calculate and display:

• the total number and average marks pupils

• the names of the pupils who scored less than 20 

• the details of the gold, silver and bronze medal winners.

Your program should function correctly even if the number of pupils in the file

is changed.
'''


#Code
#---

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
[ "Test" , "Montgomerie" , 100 ],]
total = 0
count = 0
#Print file data

#Print file data
print("================ Details of the file ================")
for i in range(len(PhysicsMark)):
    for j in range(len(PhysicsMark[i])):
        print(PhysicsMark[i][j], end=' ')
    print()

print("===== The total number and average marks pupils =====")    
for i in range(len(PhysicsMark)):
    for j in range(len(PhysicsMark[i])):
        if isinstance(PhysicsMark[i][j], int):
          total=total+PhysicsMark[i][j]
        count=count+1
   
print("Total", total)
print("Count", count)
print("Avg", total/count)

print("== Details of the pupils who scored less than 20 ==")
for i in range(len(PhysicsMark)):
    for j in range(len(PhysicsMark[i])):
        if isinstance(PhysicsMark[i][j], int):
            if PhysicsMark[i][j] < 20 :
               print(PhysicsMark[i][j-2]);

PhysicsMarkdesc = sorted(PhysicsMark, key=lambda tup: (tup[2]), reverse=True)

pc=0
print("The details of the gold, silver and bronze medal winners")
for i in range(len(PhysicsMark)):
    for j in range(len(PhysicsMark[i])):
        if pc < 3:
          print( PhysicsMarkdesc[i][j], end=' ') 
    pc = pc+1
    print()
