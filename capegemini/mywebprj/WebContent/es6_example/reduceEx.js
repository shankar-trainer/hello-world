sum=function(a,b){
    return a+b;
} 
sum1=(a,b)=>(a+b);
multiplication=(a,b)=> (a*b);

ar=[1,2,3,4,5,6];
console.log(ar.reduce(sum));
console.log(ar.reduce(sum1));
console.log(ar.reduce(multiplication));



