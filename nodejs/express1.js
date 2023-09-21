var express=require('express')
var app=express()
const book={
    'isbn':100001,
    'name':'spring in action',
    'cost':1200,
    'author':'pankaj kumar'
};
app.get("/",(req,resp)=>{
    resp.writeHead(200,{'Content-Type':'text/html'}) 
    resp.write('<h2>hello  this is express application</h2>');
    resp.write('<h2>will add all rest methods </h2>');
   
    resp.end();
 });
 app.get("/book",(req,resp)=>{
  resp.json(book);
})
app.listen(5051)







//npm init 
//npm install  express
