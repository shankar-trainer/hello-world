var emp=require('./data/employee.js');

var express=require('express');
var app=express();

app.use(express.json)
app.get("/",(req,resp)=>{
    resp.write('hello');
    resp.end();
});
app.get("/employee",(req,resp)=>{
    resp.json(emp)
});

app.listen(4000)