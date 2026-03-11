var http=require('http')

http.createServer((req,resp)=>{
    resp.write('<h1>hello world</h1>')
    resp.write('<h1>student data</h1>')
    resp.write('<p>'+JSON.stringify(student))

    resp.write('<style>table, tr, td,th{border:solid;padding:13pt;background:lightyellow;color:blue;width:50%}</style>');

    resp.write('<table style="margin-left:200pt"><tr><th>roll</th><th>name</th><th>salary</th></tr>')

    employees.forEach(emp => {
        resp.write("<tr><td>"+emp.id+"</td><td>"+emp.name+"</td><td>"+emp.salary+"</td></tr>");
    });

        resp.write('</table>')

    resp.end()
}).listen(5000)

var student={
   "roll":10001,
   "name":"pawan kumar",
   "subject":"math",
   "marks":56,
}
var employees=[
     {"id":10001,"name":"suman kumar","salary":20000},
     {"id":10002,"name":"vimal kumar","salary":22000},
     {"id":10003,"name":"kamal kumar","salary":24000},
     {"id":10004,"name":"raman kumar","salary":27000},
     {"id":10005,"name":"chaman kumar","salary":29000},
     {"id":10006,"name":"jayant kumar","salary":40000},
]
