let ar1=[11,2,3,1,55,6];
console.log(ar1)

ar1.forEach(element => {
    console.log(element)
});

console.log('sum is '+ar1.reduce((a,b)=>a+b))

setInterval(()=>console.log(new Date().toTimeString()),1000)