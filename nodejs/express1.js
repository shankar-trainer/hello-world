var express=require('express')
var app=express()

app.get("/",(req,resp)=>{
    resp.writeHead(200,{'Content-Type':'text/html'}) 
    resp.write('<h2>hello  this is express application</h2>');
    resp.write('<h2>hello  this is express application</h2>');
    resp.end();
 });
app.listen(5051)







//npm init 
//npm install  express
