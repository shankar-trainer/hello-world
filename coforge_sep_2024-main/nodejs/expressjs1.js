var express=require('express');
var app=express();
var bk=require('./data/book.json')

user={
    "id":10001,
    "name":'shyam kumar',
    "location":"new delhi"
}

app.get("/",(req,resp)=>{
    resp.writeHead(200,{'Content-type':'text/html'});
    resp.write('<h1>Express Application</h1>');
    resp.write("<div style='border:solid 10px tomato;color:blue;margin-left:300pt;background:yellow;padding:20pt;width:30%'>user data ");
    resp.write('<div>id is '+user.id+"</div>");
    resp.write('<div>name is '+user.name+"</div>");
    resp.write('<div>location is '+user.location+"</div>");
    resp.write("</div>");
    resp.send(); //send will end 
})

//http://localhost:9000/welcome

app.get("/welcome",(req,resp)=>{
    resp.writeHead(200,{'Content-type':'text/html'});
    resp.write("<h2>Employee Application</h2>");
    resp.write(JSON.stringify(bk));
    resp.write("<div style='border:solid;padding:20pt;width:30%'>");
    resp.write("<div>isbn "+bk.isbn+"</div>")
    resp.write("<div>name "+bk.bname+"</div>")
    resp.write("<div>cost "+bk.cost+"</div></div>")

    resp.end()
})

app.listen(9000)
// npm i express
// npm i -g nodemon
