// const hello=function(){
 const hello=()=>{
      console.log('hello world')
}

//hello=function (){
// hello=()=>{
//       console.log('hello world to es6 ')
// }

hello();
hello();

var arr=[11,2,3,4,1];
arr.forEach(element => {
    console.log(element)
});

arr.forEach(function(element) {
    console.log(element)
});

// multi line  string  es5 
var welcome='hello i m fine how\
 are you\
 i m fine too'

 // multi line  string  es6 

var welcome1=` hello i m fine 
 how are you 
  catch u later  `
console.log(welcome)
console.log(welcome1)