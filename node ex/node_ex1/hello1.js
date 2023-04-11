var http=require('http')
http.createServer(function(req,res){
res.writeHead(200,{
    "ContentType":"text/html"
});
res.end("<h1>hello world</h1>")

}).listen(3000,'127.0.0.1')

