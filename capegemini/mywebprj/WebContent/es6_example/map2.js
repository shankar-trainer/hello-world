arr=[1,2,3,4]
 function addplus(p){
    return p+2;
 }
console.log(arr)
arr1=arr.map((a)=>Math.sqrt(a))
arr2=arr.map((a)=>(a*a))

console.log(arr1)
console.log(arr2)
console.log(arr.map(addplus))
console.log(arr.map((p)=>p+10))

