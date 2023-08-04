export class User {
    userid: number;
    username: string;
    usersalary: number;
    userdob: string;
    userhobby: string[];

    constructor(userid: number, username: string, usersalary: number,
        userdob: string, userhobby: string[]) {
        this.userid = userid;
        this.username = username;
        this.usersalary = usersalary;
        this.userdob = userdob;
        this.userhobby = userhobby;
    }
}
