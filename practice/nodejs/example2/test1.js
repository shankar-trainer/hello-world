const http=require('http')

server=http.createServer((req,resp)=>{
    resp.writeHead(200,{'Content-Type':'text/html'})
    resp.write("hello world")
    resp.end("<p><h2>hello world")
    
})

server.listen(4000)
// server.listen(4000,'server running on port 4000')
