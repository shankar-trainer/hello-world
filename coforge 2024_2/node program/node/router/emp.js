var express=require('express');

var emp=require('../data/employee.json');
var router=express.Router();
router.get("/emp", (req,res)=>{
 
    emp.employees.forEach(emp => {
        res.write(`<div>${emp.id} ${emp.name} ${emp.salary}</div>`);        
    });
});

router.get("/emp/:id", (req,res)=>{
    //var emp1=emp.employees[req.params.id]
  
    var e = emp.employees.find((a) => {
        return a.id === parseInt(req.params.id)
    })
    if(!e)
        res.write('not found')
        //res.write(`<div>${emp1.id} ${emp1.name} ${emp1.salary}</div>`);        
        else
        res.write(`<div>${e.id} ${e.name} ${e.salary}</div>`);        
   
});

module.exports = router;