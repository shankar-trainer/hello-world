import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent {
  @Input() id:number;
  @Input() name:string;
  @Input() salary:number;
  @Input()  dob:string;
  submitted:boolean=false;
    constructor(){
     this.id=0;
     this.name=''
     this.salary=0;
     this.dob=''
    }

    onSubmit(){
      this.submitted=true;
    }

}
