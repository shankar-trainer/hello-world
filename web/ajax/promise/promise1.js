var x=10;
promise=new Promise((resolve,reject)=>{
    if(x%2==0)
        resolve(x+"  even no");
    else 
        reject(x+"  odd  no");
})
console.log(promise)