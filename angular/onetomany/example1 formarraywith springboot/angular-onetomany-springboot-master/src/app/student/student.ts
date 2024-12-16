import { Book } from './book';

export class Student {
     id:number=0;
     rollNo:number=0;
     name:string='';
     email:string='';
     college:string='';
     branch:string='';    
     books:Book[]=[];

    public constructor(init?: Partial<Student>) {
        Object.assign(this, init);
    }
}
