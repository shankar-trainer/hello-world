var http=require('http');

http.createServer((req,resp)=>{
    resp.writeHead(200,{'Content-Type':'text/html'})
    resp.write('<br>hello world');
    ar=["delhi","chennai","kolkotta","mumbai","banglore","pune"]
    resp.write('<ol>')
    ar.forEach(element => {
        resp.write("<li>"+element)
    });
    //setInterval(()=>console.log(new Date().toTimeString()),1000)
    setInterval(()=>resp.write(new Date().toTimeString()),1000)
    resp.write('</ol>')
    resp.write('my clock')
    
    resp.end('<br>end of message');
}).listen(8001);
console.log('server is running');