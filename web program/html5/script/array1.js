ar1=[1,2,3,4,5]
ar2=new Array(11,22,33,44,55);
console.log(ar1)

console.log('using simple for loop')
for (var index = 0; index < ar1.length; index++) {
    console.log(ar1[index]);
}

document.write('using for in loop <br>');

for (var index in ar1) {
   document.write(ar1[index]+",");
}
document.write("<br>using for of loop <br>");

for (var p of ar1) {
    document.write(p+",");
}
alert(ar2)
ar3=ar1.concat(ar2);
alert(ar3)
var strr1=ar1.join(' - ')
alert(ar1+ 'after join '+strr1)

alert(ar1+"before pop "+ar1.pop())
alert("after pop "+ar1)

ar1.push(66) 
console.log("\nafter push "+ar1)
console.log("\nafter reverse "+ar1.reverse())

//shift -- remove from first
//unshift add element at first
console.log("\n shift "+ar1.shift())
console.log("\n after shift "+ar1)
ar1.unshift(999)
console.log("\nafter unshift "+ar1)


