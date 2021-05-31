"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(empId, empName, empSalary) {
        console.log('constructor called');
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    Employee.prototype.empInfo = function () {
        console.log('employee information');
        console.log('employee id is ' + this.empId);
        console.log('employee  name is ' + this.empName);
        console.log('employee salarry is ' + this.empSalary);
    };
    return Employee;
}());
exports.Employee = Employee;
//var emp=new Employee(1001,'a kumar',20000);
//emp.empInfo();
//npm install -g @angular/cli@7.5.4
//ng --version
