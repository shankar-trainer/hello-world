var express=require('express');
var app=express();


var mysql=require('mysql');

var connection=mysql.createConnection(
    {
        host:'localhost',
        user:'root',
        password:'mysql',
        database:'coforge'
    }
);


app.get("/",(req,resp)=>{
    resp.writeHead(200,{'Content-type':'text/html'});
  
    resp.write("<h1 style='color:maroon;margin-left:300'>Emplyee Data </h1>");
  
    resp.write("<style> td { border:solid}</style>");
    connection.connect((err)=>{
     if(err)
        throw err;        
     
     connection.query("select * from employee",(err,result)=>{
         if(err)
             throw err;
         resp.write("<table style='color:blue;border:solid;margin-left:300'>");
         result.forEach(data => {
            resp.write("<tr><td>"+data.id+"</td><td>"+data.name+"</td><td>"+data.salary+"</td></tr>" )
         });
         resp.write("</table>");
     })
 })
 }).listen(3000);