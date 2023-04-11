console.log('will be called after 5 second')
setTimeout(function(){
    console.log('called after 5 s')
},5000)

console.log('will be called after 3 second')
setTimeout(()=>{
    console.log('called after 3 seconds ')
},3000)

