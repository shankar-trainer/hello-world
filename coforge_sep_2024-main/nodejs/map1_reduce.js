var ar=new Array(1,2,3,4,5);

console.log(ar)

ar1=ar.map((a)=>a*a)

console.log(ar1)

function sum(a,b){
return a+b
}
//var s=ar.reduce(a,b=>a+b);

var s=ar.reduce(function(a,b){
    return a+b;
}
);

console.log('using reduce sum is '+s)

var s1=ar.reduce((a,b)=>
   a+b
);
console.log('using reduce sum is '+s1)
console.log('using filter ')

console.log(ar.filter(a=>a%2==0))

date=new Date();
console.log(date)
console.log(date.toString())
console.log(date.toDateString())
console.log(date.toLocaleString())
console.log(date.toTimeString())
console.log(date.toLocaleTimeString())



