var ar1=new Array(11,22,33,44,55)
alert(ar1)
alert("array1 length is "+ar1.length)

var city=["delhi","chennai","mumbai","nagpur","madurai"];
alert(city)

console.log(city[0])
console.log(city[2])
console.log(city[1])

document.write("using for loop ")

for(var a=0;a<city.length;a++)
   document.write(city[a]+"<br>");
   
document.write("using for in/each   loop ")

for(var a in ar1)// for in/each return index 
   document.write(ar1[a]+"<br>");
   
document.write("using  of  loop ")

for(var a of ar1)// for in/each return index 
   document.write(a+"<br>");
   
   