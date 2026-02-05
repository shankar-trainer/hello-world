var mysql=require('mysql')
var http=require('http')


var connection=mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'root',
    database:'cts1',
})

http.createServer((req,resp)=>{
    connection.connect((err)=>{
    if(err)
    resp.write('some problem'+err)
    else {
    resp.write('connection successful')
      res.setHeader('Content-Type', 'text/html');


connection.query("select * from employee",(err,results)=>{
if(err)
    resp.write(err)
else {
    results.forEach(e => {
        resp.write(e.id+","+e.name+","+e.salary+"<br>")
    });
}
resp.end()
})
}
})}).listen(4000);



