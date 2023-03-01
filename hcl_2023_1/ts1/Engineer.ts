import { Employee } from "./Employee";

export class Engineer extends Employee {
  location: string;
  state: string;

  constructor(empId: number, empName: string, empSalary: number, emp_Martial_status: boolean, location: string, state: string) {
    super(empId, empName, empSalary, emp_Martial_status);
    this.location = location;
    this.state = state;
  }
  display() {
    console.log('Engineer data');
    console.log('Id ' + this.empId);
    console.log('Name' + this.empName);
    console.log('Salary ' + this.empSalary);
    console.log('Martial status ' + this.emp_Martial_status);
    console.log('Location ' + this.location);
    console.log('State ' + this.state);
  }
} 