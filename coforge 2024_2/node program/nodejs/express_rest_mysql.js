var mysql=require('mysql');
var express=require('express')
var app=express()
app.use(express.json())
 
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
})

app.get("/employee",(req,resp)=>{  
    connection.query("select * from employee",(err,result)=>{
        if(err)
            throw err;
        resp.json(result);
    })
 })
app.get("/employee/:id",(req,resp)=>{  
 
    if(!req.params.id )
      resp.status(404).send('id is not present')

    else if(isNaN(req.params.id))
        resp.status(404).send('id is not a number')
    else {
        var id=parseInt(req.params.id)
    connection.query("select * from employee where id="+id,(err,result)=>{
        //  if(result.length==0)
        //      resp.status(404).send('id is not present')
        if(err)
            throw err;
        
        resp.json(result);
    })
    }
  })
  app.post("/employee",(req,resp)=>{
     const emp={
        "id":req.body.id,
        "name":req.body.name,
        "salary":req.body.salary,
     };
     if(!emp.id)
        resp.status(400).send('id is not present ')
    else  if(!emp.name)
        resp.status(400).send('name is not present ')
    else if(!emp.salary)
        resp.status(400).send('salary is not present ')
else{
     connection.query("insert into employee values("+emp.id+",'"+emp.name+"',"+emp.salary+")",(err,result)=>{
        // if(err)
        //     throw err;
   try{
    if(err)
           // throw err;      
    resp.send(err)
   }
   catch(err){
   resp.send(err)
   }

        resp.json(emp);
     });

   }});

app.listen(8000);
