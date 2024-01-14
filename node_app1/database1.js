var mysql=require('mysql')
var connection=mysql.createConnection({
     'host':'localhost',
     'user':'root',
     'password':'mysql',
     database:'db1'
});
connection.connect((err)=>{
    if(err)
      throw err;
    connection.query("select * from employee",(err,result)=>{
        if(err)
         throw err;
        console.log(result);
        result.forEach(element => {
            console.log(element);
        });
    });
console.log('connected ')
})