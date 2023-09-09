var server=require('http')
server1=server.createServer((req,resp)=>{
    console.log('url is ..'+req.url);
    resp.writeHead(200,{'Content-Type':'text/html'})   
    if(req.url=="/"){

        resp.write('<h2>Home Page</h2>')
        resp.write('<p>This is home page of my web site')
        resp.end('<br>this is located in india')
    }
    if(req.url==="/about"){
        resp.write('<h2>About Page</h2>')
        resp.write('<p>This is about page');
        resp.end('<br>we will update soon');
    }
})
server1.listen(9090);

