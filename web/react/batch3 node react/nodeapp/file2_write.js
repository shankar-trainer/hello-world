var fs=require('fs')
// fs.writeFile('hello.txt','hello data',(err)=>{

fs.appendFile('hello.txt','\nhello data',(err)=>{
  if(err)
    console.log(err)
  else 
    console.log('data added')
})