import { Employee } from './Employee';
 
class BankEmployee extends Employee{
    location:string;
    hra:number; 


    constructor(empId:number,empName:string,empSalary:number,location:string,hra:number ){
        super(empId,empName,empSalary);
       this.location=location;
       this.hra=hra;
    }

    bankEmpInfo(){
        super.empInfo();
        console.log('location is '+this.location);
        console.log('hra is '+this.hra);
    }

}

var emp1=new BankEmployee(1001,'a kumar',20000,'chennai',0.05);
emp1.bankEmpInfo();