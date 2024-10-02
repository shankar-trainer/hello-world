var employee={
    "id":10001,
    "name":"ram kumar",
    "salary":20000
}
console.log(employee)
console.log("employee id : "+employee.id)
console.log("employee name : "+employee.name)
console.log("employee salary : "+employee.salary)

var customers=[
                {
                    "id":10002,
                    "name":"ram kumar",
                    "salary":10000
                },
                {
                    "id":10001,
                    "name":"suresh kumar",
                    "salary":40000
                },
                {
                    "id":10003,
                    "name":"amitesh kumar",
                    "salary":30000
                },      
]
console.log(customers)
console.log(customers[0])
console.log(customers[1])
customers.forEach(c => {
    console.log(c.id+"\t"+c.name+"\t"+c.salary)
});
customers.sort((a,b)=>a.id-b.id)
console.log('sort by id ')
customers.forEach(c => {
    console.log(c.id+"\t"+c.name+"\t"+c.salary)
});

customers.sort((a,b)=>{
  if(a.name>b.name)    {
    return 1;
  }
  if(a.name<b.name)    {
    return -1
  }
  if(a.name==b.name)    {
    return 0
  }  
}
);

console.log('sort by name ')
customers.forEach(c => {
    console.log(c.id+"\t"+c.name+"\t"+c.salary)
});
