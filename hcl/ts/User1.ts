export class User1{
    id:number;
    name:string;
    dob:Date;

    constructor(){
        this.id=10001;
        this.name='mahendra partap';
        this.dob=new Date()        
    }

    display():void {
       console.log('user information');
       console.log('user id '+this.id);
       console.log('user name '+this.name);
       console.log('user salary '+this.dob);
    }
}