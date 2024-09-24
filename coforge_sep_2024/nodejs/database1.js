var mysql=require('mysql');
var connection=mysql.createConnection(
    {
        host:'localhost',
        user:'root',
        password:'mysql',
        database:'coforge'
    }
);
connection.connect((err)=>{
    if(err)
       throw err;   
    connection.query("insert into employee values(1001,'anand kuamr',50000)" ,
        (err,result)=>{
        if(err)
            throw err;
        console.log(result)
    })

    connection.query("select * from employee",(err,result)=>{
        if(err)
            throw err;
        //console.log(result)
        result.forEach(data => {
            console.log(data.id+"\t"+data.name+"\t"+data.salary )
        });
    })

   }
)
