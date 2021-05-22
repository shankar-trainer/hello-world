export class Employee {
   empId:number;
   empName:string;
   empSalary:number;
   empDob:Date;

     constructor(empId:number,
     empName:string,
     empSalary:number,
     empDob:Date
    ){
       this.empId=empId;
       this.empName=empName;
       this.empSalary=empSalary;
       this.empDob=empDob;
     }

}
