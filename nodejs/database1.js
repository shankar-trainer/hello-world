var mysql = require('mysql')
var connection = mysql.createConnection(
    {
        host: 'localhost',
        user: 'root',
        password: 'mysql',
        database: 'coforge'
    }
)
connection.connect((err)=>{
    if(err)
      throw err;
       connection.query("select * from student",(err,result)=>{
        if(err)
        throw err;
        console.log(result)
       });
   console.log('connected')    
})                                         