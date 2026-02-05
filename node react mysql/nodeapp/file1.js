var fs=require('fs')
fs.readFile('restapp2.js',(err,data)=>{
    if(err)
        console.log('err')
    else 
        console.log(data.toString())
})