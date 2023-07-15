var mysql=require('mysql');
var connection=mysql.createConnection(
{
 host:"localhost",
 user:"root",
 password:"",
 database:"db2",
 insecureAuth : true
});

connection.connect((err)=>{
    if(err)
      throw err;
      connection.query("select * from mybook",(err,result)=>{
          if(err)
          throw err;
          console.log(result);
        
      });

      console.log('connected');
})


