export class Customer{
    customerId:number;
    customerName:string;
    customerDob:Date;

    constructor(){
        this.customerId=0;
        this.customerName='';
        this.customerDob=new Date();
    }
} 