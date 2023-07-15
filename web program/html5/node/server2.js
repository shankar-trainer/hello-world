var http=require('http');

http.createServer((req,resp)=>{
   
    console.log(req.url);
    
    resp.writeHead(200,{'Content-Type':'text/html'});
    resp.write('path is'+ req.url);
    resp.write('<br>ip  is'+ req.ip);
    resp.write('<br>host name  is'+ req.hostname);
    resp.write("<h1> hello how are you</h1>");

      if(req.url){
           resp.end('<h2>HomePage</h2>');
      }
   else if(req.url==='/about'){
           resp.end('<h2>About Page</h2>');
           console.log(' about page ..')
      }
}).listen(3000);
