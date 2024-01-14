export class Person{
    id:number;
    name:string;
    salary:number;
    dob:Date;
    constructor(){
        this.id=100001;
        this.name="pawan kumar";
        this.salary=56000;
        this.dob=new Date('2001-12-30');
    }
}