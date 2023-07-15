var express=require('express');
var employee=require('./data/employee.js');


var app=express();
const port=process.env.port||3000
// const employee=[
//    {"id":10001,"name":"suresh kumar","salary":35000},
//    {"id":10002,"name":"avant kumar","salary":12000},
//    {"id":10003,"name":"salman akhtar","salary":90000},
//    {"id":10010,"name":"kashif hussain","salary":55000},
//    {"id":10004,"name":"raman sinha","salary":15000},
//    {"id":10007,"name":"ishaan jaiswa","salary":45000}
// ];

app.get('/',(req,resp)=>{
    resp.write('<h1>hello world</h1>');
});

app.get('/employee',(req,resp)=>{
    //resp.send(employee);
    resp.json(employee);
});

app.get('/employee/:id',(req,resp)=>{
    //resp.send(employee);
    //resp.send(req.params.id);
    resp.send(req.params);
});

app.get('/single', function(req, res) {
    res.json({
      number: 1,
      name: 'John',
      gender: 'male'
    });
  });

  app.get('/array', function(req, res) {
    res.json([{
        number: 1,
        name: 'John',
        gender: 'male'
      },
      {
        number: 2,
        name: 'Ashley',
        gender: 'female'
      }
    ]);
  });



app.get('/hello1',(req,resp)=>{
    resp.send('<h1>we are learning expressjs </h1>');
});


//app.listen(3000,console.log('its running on port 3000'))
app.listen(3000,console.log('its running on port '+port));