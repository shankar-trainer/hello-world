export class User{

    id:number;
    name:string;
    salary:number;
    hobbies:Array<string>;

    // constructor(){
    //     this.id=656565;
    //     this.name='ram kumar',
    //     this.salary=12000;
    //     this.hobbies=['music','cricket','movie','reading']
    // }

    constructor(id:number,name:string,salary:number,hobbies:Array<string>){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.hobbies=hobbies;
    }

}