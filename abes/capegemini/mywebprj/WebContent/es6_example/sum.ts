function sum(n1:number, n2:number):void{
     console.log(`sum of ${n1} and ${n2} is ${n1+n2}`)
}
function multiplication(n1:number, n2:number):number{
return n1*n2;
}

function arraySum(n:number[]):void{
   let sum:number=0;
    for(var k=0;k<n.length;k++){
      sum=sum+n[k];
    }
    console.log('sum is '+sum)
}

sum(11,33);

let res=multiplication(4,3);
console.log('multiplication is '+res);
arraySum([1,2,3,4,5]);