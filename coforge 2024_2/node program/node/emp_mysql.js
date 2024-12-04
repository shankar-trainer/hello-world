var emp = require('./data/emp.js');

var express = require('express');
var app = express();
app.use(express.json());

var mysql=require('mysql')
var connection=mysql.createConnection({
     'host':'localhost',
     'user':'root',
     'password':'mysql',
     database:'coforge'
});
app.get("/", (req, resp) => {
    resp.write('hello');
    resp.end();
});
// get method
app.get("/employee", (req, resp) => {
    console.log('get method called')
    //resp.json(emp)
    connection.connect((err)=>{
        if(err)
           throw err;        
          connection.query("select * from employee",(err,result)=>{
            if(err)
                throw err;
            resp.status(200).json(result);
        })
    })
});

// search using get 
app.get("/employee/:eid", (req, resp) => {
    if (!req.params.eid || isNaN(req.params.eid)) {
        return resp.status(404).send('invalid id')
    }
   
    const id = parseInt(req.params.eid);
    let sqlQuery = `select * from employee WHERE id = ${id}`;

    connection.query(sqlQuery, (error, result) => {
        if (error) throw error;
        resp.status(200).json(result[0]);
    });
})
// add record post method
app.post("/employee/", (req, resp) => {
    console.log('post method')
    const newemp = {
        eid: req.body.eid,
        name: req.body.name,
        salary: req.body.salary,
        dob: req.body.dob
    }
    if (!newemp.eid) {
        resp.status(404).send('please add the id')
    }
    else if (!newemp.name) {
        resp.status(404).send('please add the name')
    }
    else if (!newemp.salary) {
        resp.status(404).send('please add the salary')
    }
    else if (!newemp.dob) {
        resp.status(404).send('please add the dob')
    }
    emp.push(newemp);
    resp.send(newemp);
})

//delete 

app.delete('/employee/:eid', (req, resp) => {
    if (!req.params.eid || isNaN(req.params.eid)) {
        return resp.status(404).send('invalid id')
    }
    var e = emp.find((a) => {
        return a.eid === parseInt(req.params.eid)
    });

    if (!e) {
        resp.status(404).json({ 'msg': 'employee with ' + req.params.eid + ' id is not present' });
        //resp.status(404).send('employee with ' + req.params.eid + ' id is not present' );
    }

    const index = emp.indexOf(e);
    console.log(e + ' found at ' + index);
    emp.splice(index, 1);

    //resp.json({ 'msg': 'employee with ' + req.params.eid + 'id is deleted ' });
    return resp.json(e);

});
app.listen(3000)    