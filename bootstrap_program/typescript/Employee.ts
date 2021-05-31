export class Employee{
   empId:number;
   empName:string;
   empSalary:number;

    empInfo(){
        console.log('employee information');
        console.log('employee id is '+this.empId);
        console.log('employee  name is '+this.empName);
        console.log('employee salarry is '+this.empSalary);
    }
    constructor(empId:number,empName:string,empSalary:number){
        console.log('constructor called');
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
    }

}
//var emp=new Employee(1001,'a kumar',20000);
//emp.empInfo();


//npm install -g @angular/cli@7.5.4
//ng --version
