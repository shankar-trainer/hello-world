var express = require('express');
var app = express();
app.use(express.json())

const cors = require('cors');

app.use(cors());

var mysql = require('mysql')

var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'cts1',
})

connection.connect((err) => {
    if (err)
        throw err;
});

app.get("/employee", (req, resp) => {

    connection.query("select * from employee", (err, results) => {
        if (err)
            resp.send(err)
        else {
            resp.json(results)
        }
    })
})
app.get("/employee/:id", (req, resp) => {
    if (!req.params.id)
        resp.status(404).send('id not present')

    else if (isNaN(req.params.id))
        resp.status(404).send('id is not a number')

    else {
        var id = req.params.id

        connection.query("select * from employee where id=" + id, (err, results) => {
            if (err)
                resp.send(err)
            else {
                resp.json(results)
            }
        })
    }
 }
)
app.post("/employee", (req, resp) => {
    const emp = {
        id:req.body.id,
        name:req.body.name,
        salary:req.body.salary,
    };
    if (!emp.id)
        resp.status(404).send('id is not present')
    else if (!emp.name)
        resp.status(404).send('name is not present')
    else if (!emp.salary)
        resp.status(404).send('salary is not present')
    else {
        connection.query("insert into  employee  values(" + emp.id + ",'" + emp.name + "'," + emp.salary + ")",
            (err, results) => {
                if (err) {
                    if (err.code == 'ER_DUP_ENTRY')
                        resp.status(404).send('duplcate record error ')
                    resp.send(err)
                }
                resp.json(emp)
            })
    }
})

app.listen(2000)