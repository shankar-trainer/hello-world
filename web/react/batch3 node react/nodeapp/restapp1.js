var express = require('express');
const emp_data = require('./data/employee');
var app = express();

app.get("/", function (req, resp) {
    resp.setHeader('Content-Type', 'text/html');
    resp.write("<h2>hello world</h2>")
    resp.write("<h2>hello world</h2>")
    resp.write("<h2>hello world</h2>")
    resp.end()
    // }).listen(3000)
})

app.get("/hello", (req, resp) => {
    return resp.json(consumer);
})

app.get("/employee", (req, resp) => {
    return resp.json(emp_data);
})

app.get("/employee1", (req, resp) => {
        resp.setHeader('Content-Type', 'text/html');
     resp.write('<table><tr><th>id</th><th>name</th><th>salary</th></tr>');
       emp_data.forEach(e => {
         resp.write(`<tr><td>${e.id}</td><td>${e.name}</td>
            <td>${e.dob}</td><td>${e.salary}</td></tr>`)
       });
     resp.write('</table>')
})

app.get("/employee2", (req, resp) => {
        resp.setHeader('Content-Type', 'text/html');

    resp.write('<link href="node_modules\bootstrap\dist\css\bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">')
     resp.write('<div class="container">')
     resp.write('<table class="table table-striped"><tr><th>id</th><th>name</th><th>salary</th></tr>');
       emp_data.forEach(e => {
         resp.write(`<tr><td>${e.id}</td><td>${e.name}</td>
            <td>${e.dob}</td><td>${e.salary}</td></tr>`)
       });
     resp.write('</table>')
     resp.write('</div>')
})



app.listen(3000)

var consumer = {
    "id": 100001,
    "name": "suman kumar",
    "dob": "2000-11-12",
}

