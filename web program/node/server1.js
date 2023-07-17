var server=require('http');

const { setTimeout } = require('timers/promises');
server.createServer((req,resp)=>{
    
    resp.write("<h1>Server Application</h1>");
     
    resp.end();

}).listen(3000);
console.log('server is running');

