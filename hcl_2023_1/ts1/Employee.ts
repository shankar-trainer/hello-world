export class Employee {
    empId: number;
    empName: string;
    empSalary: number;
    emp_Martial_status: boolean;

    constructor(empId: number,empName: string,empSalary: number, emp_Martial_status: boolean) {
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
        this.emp_Martial_status=emp_Martial_status;
    }
}