export class User{
    userId:number;
    userName:string;
    userSalary:number;

    constructor(id:number,name:string,salary:number){
        this.userId=id;
        this.userName=name;
        this.userSalary=salary;
    }
    
}