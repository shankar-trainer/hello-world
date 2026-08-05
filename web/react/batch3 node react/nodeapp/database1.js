var mysql=require('mysql')
var connection=mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'root',
    database:'cts1',
})

connection.connect((err)=>{
    if(err)
    console.log('some problem'+err)
    else 
    console.log('connection successful')
});

connection.query("select * from employee",(err,results)=>{
if(err)
    console.log(err)
else {
    results.forEach(e => {
        console.log(e.id,e.name,e.salary)
    });
    connection.destroy();
}
})
