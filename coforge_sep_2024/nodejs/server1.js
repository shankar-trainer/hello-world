var http=require('http');
var server=http.createServer((req,resp)=>{
    resp.writeHead(200,{'Content-type':'text/html'})
    resp.write('<h1>Welcome</h1>');
    resp.write('<div>hello world<div>');    
    resp.end('hello world');    
});
server.listen(1000)

//npm i http
// npm i mysql 