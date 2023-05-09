function hello(){
    console.log('... hi ...')
}

p=function(){
    console.log('... hi ..hi.')
}

p1=function(){
  return "hello";
}


console.log(hello) //[Function: hello]
console.log(p)  //  [Function: p] 
console.log(p1)  // [Function: p1]
console.log(p1()) // print hello 

