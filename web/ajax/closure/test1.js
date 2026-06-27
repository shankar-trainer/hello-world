function  createCounter(){

   let count=0

  return function increment(){
    count++
    return count;
  }
}

var counter1=createCounter()

console.log(counter1())
console.log(counter1())
