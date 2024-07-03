export class Person {
    id: number;
    name: string;
    salary: number;
    dob: Date;

    constructor(id:number,name:string,salary:number,dob:Date){
        this.id=id;
        this.name=name
        this.salary=salary;
        this.dob=dob;

    }
    // constructor() {
    //     this.id = 0;
    //     this.name = ''
    //     this.salary = 0;
    //     this.dob = new Date();
    // }
}
