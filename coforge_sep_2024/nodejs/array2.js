var arr=[11,2,3,44,55,6,78]

function sum(a){
    let s=0;
     for (const element of a) {
        s=s+element;
     }
     return s;
}

console.log("sum of "+arr+" is "+sum(arr))

var name=["ram kumar","amit kumar","jayant kumar"]
console.log("unsorted "+name)
console.log("sorted "+name.sort())


function myfunction(a,b){
    return a-b
}
arr.sort(myfunction)
console.log('sorted array'+arr)

