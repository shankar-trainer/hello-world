import { Patient } from "./patient";

export class Doctor {
 id:number=0;
 name:string='';
 age:number=0;

 //patientSet:Patient[]=[]
 patientSet:Array<{id:number,
    name:string,
    age:number,
    location:string;
}>=[];
 

}
