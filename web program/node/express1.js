const { response } = require('express');
const express = require('express');
const uuid = require('uuid');

var employee = require('./data/employee.js');
var app = express();
const port = process.env.port || 3000
// const employee=[
//    {"id":10001,"name":"suresh kumar","salary":35000},
//    {"id":10002,"name":"avant kumar","salary":12000},
//    {"id":10003,"name":"salman akhtar","salary":90000},
//    {"id":10010,"name":"kashif hussain","salary":55000},
//    {"id":10004,"name":"raman sinha","salary":15000},
//    {"id":10007,"name":"ishaan jaiswa","salary":45000}
// ];

app.use(express.json())
app.get('/', (req, resp) => {
  resp.write('<h1>hello world</h1>');
  resp.end();
  // send= write+end
});

//get all employee
app.get('/employee', (req, resp) => {
  //resp.send(employee);
  resp.json(employee);
  console.log('method ' + req.method)
  console.log('ip ' + req.ip)
  console.log('body ' + req.body)
});
//update employee
app.put("/employee/:id", (req, resp) => {
  if (!req.params.id || isNaN(req.params.id)) {
    return resp.status(404).send('invalid id')
  }
  else if (!req.body.name) {
    return resp.status(404).send('invalid name')
  }
  else if (!req.body.salary) {
    return resp.status(404).send('invalid salary')
  }
  let empid = parseInt(req.params.id);
  var emp = employee.find((a) => {
    return a.id === empid;
  })
  if (!emp) {
    resp.send('employee with id ' + req.params.id + ' is not present')
  }
  else {
    emp.name = req.body.name
    emp.salary = req.body.salary
    const index = employee.indexOf(emp);
    employee[index] = emp;
    resp.send(emp);
  }
});




//add employee
app.post("/employee", (req, resp) => {

  const newemp = {
    id: req.body.id,
    //id: uuid.v4(),
    name: req.body.name,
    salary: req.body.salary
  }
  if (!newemp.id) {
    return resp.status(400).send('please add the id');
  }
  else if (!newemp.name) {
    return resp.status(400).send('please add the name');
  }
  else if (!newemp.salary) {
    return resp.status(400).send('please add the salary');
  }

  employee.push(newemp);
  resp.send(newemp);
});

//search employee by id
//http://localhost:3000/employee/10001
app.get('/employee/:id', (req, resp) => {
  //resp.send(req.params);
  // resp.send(req.params.id);
  // console.log(req.params.id);
  // console.log(req.params);

  if (!req.params.id || isNaN(req.params.id)) {
    return resp.status(404).send('invalid id')
  }

  var e = employee.find((a) => {
    return a.id === parseInt(req.params.id)
  });
  console.log(e);
  if (!e) {
    return resp.status(404).send('employee not found  with id ' + req.params.id)
  }
  else
    //return resp.send(e);
    return resp.status(201).send(e);
});

//delete employee 
app.delete('/employee/:id', (req, resp) => {
  if (!req.params.id || isNaN(req.params.id)) {
    return resp.status(404).send('invalid id')
  }
  var e = employee.find((a) => {
    return a.id === parseInt(req.params.id)
  });

  if (!e) {
    resp.status(404).json({ 'msg': 'employee with ' + req.params.id + ' id is not present' });
    //resp.status(404).send('employee with ' + req.params.id + ' id is not present' );
  }

  const index = employee.indexOf(e);
  console.log(e + ' found at ' + index);
  employee.splice(index, 1);

  //resp.json({ 'msg': 'employee with ' + req.params.id + 'id is deleted ' });
  return response.json(e);

});


//============================================

app.get('/book', function (req, res) {
  //res.json
  res.send({
    isbn: 889898,
    bname: 'expressjs in acion',
    cost: 1200
  });
});

app.get('/user', function (req, res) {
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



app.get('/hello1', (req, resp) => {
  resp.send('<h1>we are learning expressjs </h1>');
});


app.listen(3000, console.log('its running on port 3000'))
//app.listen(3000,console.log('its running on port '+port));