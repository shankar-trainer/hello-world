var server=require('http');
server.createServer(function(request,response){
    response.write('<h1>hello world</h1>');
    response.write('<br>we are learning nodejs');
    response.write('<br>hello world');
    response.end();
}).listen(7070);
console.log('server running on port 7070')
//npm install -g  nodemon 