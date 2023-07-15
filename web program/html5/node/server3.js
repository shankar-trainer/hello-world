var http=require('http');

http.createServer((req,resp)=>{
   
    resp.write('<h1>hello how are you<h1> ');
    resp.write('<h1>we are learning nodejs <h1> ');
    
    resp.end();

}).listen(4000);