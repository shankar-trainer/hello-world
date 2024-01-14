var employee = require('./data/employee');
var express = require('express')
var app = express();
app.use(express.json())

app.get("/", (req, resp) => {
    resp.write('<h1>Employee Program</h1>')
    console.log('get method with  root (/) path  ')
    resp.end();
});
// get all operation
app.get("/all", (req, resp) => {
    console.log('all employee get method ')
    resp.json(employee);
});
// search operation
app.get("/all/:eid", (req, resp) => {
    console.log(' employee search  method  using id ')
    if (!req.params.eid || isNaN(req.params.eid)) {
        return resp.status(404).send('invalid id  or not a number')
    }

    var e = employee.find((a) => {
        return a.id === parseInt(req.params.eid)
    })
    if (!e) {
        return resp.status(404).send('id is not found')
    }

    return resp.status(302).send(e);
});
app.delete("/all/:eid", (req, resp) => {
    console.log('crud delete operation using id ')
    if (!req.params.eid || isNaN(req.params.eid)) {
        return resp.status(404).send('invalid id <br>id is not a number');
    }
    var e = employee.find((a) => {
        return a.id === parseInt(req.params.eid)
    })
    if (!e) {
        return resp.status(404).send('id is not found')
        console.log('id not found ')
    }
    if (e) {
        let index = employee.indexOf(e);
        let e1 = employee.splice(index, 1);
        console.log('found and deleted')
        //return resp.status(202).json(employee);  // return rest employee after deleted
        return resp.status(202).json(e1);  // return deleted employee
    }
})
//post method -- add record
console.log('post create crud operation ')
app.post("/all/", (req, resp) => {
    const new_employee = {
        id: req.body.id,
        name: req.body.name,
        salary: req.body.salary,
        dob: req.body.dob
    }
    if (!new_employee.id) {
        return resp.status(400).send('add the id ')
    }
    else if (!new_employee.name) {
        return resp.status(400).send('add the name ')
    }

    else if (!new_employee.salary) {
        return resp.status(400).send('add the salary ')
    }

    else if (!new_employee.dob) {
        return resp.status(400).send('add the salary ')
    }
    else {
        employee.push(new_employee);
        return resp.status(201).json(new_employee);
    }
})
// update -- put method
app.put("/all/", (req, resp) => {

    if (!req.body.id) {
        return resp.status(404).send('add the id ')
    }
    else if (!req.body.name) {
        return resp.status(404).send('add the name ')
    }
    else if (!req.body.salary) {
        return resp.status(404).send('add the  salary')
    }
    else if (!req.body.dob) {
        return resp.status(404).send('add the dob ')
    }
    var id1 = req.body.id;
    var emp1 = employee.find((a) => {
        return a.id === parseInt(id1)
    })
    if (!emp1) {
        resp.status(404).send('employee not present with given id')
    }
    else {
        var index=employee.indexOf(emp1)
        emp1.name = req.body.name
        emp1.salary = req.body.salary
        emp1.dob = req.body.dob
        employee[index]=emp1;
     return resp.status(201).send(emp1);
    }
})

app.listen(1000);
