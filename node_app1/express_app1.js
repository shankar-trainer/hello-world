var express=require('express');
var app=express()

app.get("/",(req,resp)=>{
    resp.writeHead(200,{'Content-Type':'text/html'});
    resp.write('<h1>hello world</h1>');
    resp.write('hello world');
    resp.end();
});
app.get("/book",(req,resp)=>{
    resp.json(book);
})
app.get("/student",(req,resp)=>{
     resp.json({
           'roll':10001,
           'name':'ajit kumar'
    })
})
var book={
    "isbn":676767,
    "bname":'express for beginner',
    "author":'a kumar',
    "cost":456
};
var server=app.listen(2000,()=>{
    var address=server.address().address; 
    var port=server.address().port; 
    console.log('address is '+address)
     console.log('port is '+port)
     console.log('now port is %s',port)
});
