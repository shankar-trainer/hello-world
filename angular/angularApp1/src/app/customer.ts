export class Customer {
    custId: number;
    custName: string;
    custSalary: number;

    constructor(custId: number,custName: string,custSalary: number) {
       this.custId=custId;
       this.custName=custName;
       this.custSalary=custSalary;
    }
}
