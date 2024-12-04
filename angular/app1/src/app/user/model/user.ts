export class User {
    userId:number;
    userName:string;
    userDob:Date;
    userSalary:number;

    constructor(){
        this.userId=6565650;
        this.userName='govind kumar';
        this.userDob=new Date('10/22/2000');
        //this.userDob=new Date();
        this.userSalary=450000;
    }

}
