var fs=require('fs')

fs.unlink('hello.txt',(err)=>{
  if(err)
    console.log(err)
  else 
    console.log('file deleted')
})