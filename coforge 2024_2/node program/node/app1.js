var express=require('express');
var app=express();
var emp=require('./data/employee.json');
app.get("/hello", (req,res)=>{

    res.write('<div>hello world</div>');
    res.write('<div>hello world</div>');
    res.write('<h1>hello world</h1>');

    emp.employees.forEach(emp => {
        res.write(`<div>${emp.id} ${emp.name} ${emp.salary}</div>`);        
    });

}).listen(3000)


