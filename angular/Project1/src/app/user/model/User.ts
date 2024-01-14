export class User {
    userId: number;
    userName: string;
    userSalary: number;

    constructor(userId: number,userName: string,userSalary: number) {
         this.userId=userId;
         this.userName=userName;
         this.userSalary=userSalary;
    }

}