var x=10
var y=20
var z=x+y

console.log('no1 is '+x);
console.log('no1 is '+y);
console.log('sum is '+z);
console.info('addition program')

console.log(`no1 is ${x}\nno2 is ${y}`)

ar=[1,2,3,4,5];
ar1=new Array(11,22,33,44)

console.log('array program')
console.log("array 1st element "+ar[0])
console.log("array 2nd element "+ar[1])
console.log("first array  "+ar)

// for loop
for (let index = 0; index < ar.length; index++) {
  console.log("\t"+ar[index])    
}
// for in loop   -- gives index
for (index in ar1) {
   console.log("\t"+index+"\t"+ar1[index])
}

// for of loop   -- gives one by one element 

var sum=0;
for (var a of ar1) {
    sum=sum+a;
    console.log("\t\t"+a)
}
 console.log("\t\tsum is "+sum)