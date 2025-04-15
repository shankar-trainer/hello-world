import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Person } from '../model/Person';
import { PersonService } from '../service/person.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updateperson',
  imports: [CommonModule,FormsModule],
  templateUrl: './updateperson.component.html',
  styleUrl: './updateperson.component.css'
})
export class UpdatepersonComponent {

  msg:string='';
  
   @Input() person:Person;
   person1:Person
    constructor(private service:PersonService, private router:Router){
      this.person=new Person();
      this.person1=new Person();
    }
  
    showAll(){
      this.router.navigate(['all'])
    }
  
    visible:boolean=false;
    updatePerson(){
      this.visible=true;
      this.service.updatePerson(this.person).subscribe(data=>{
            this.msg="Record Updated"
            this.person1=data;
      },
      error=>{
             this.msg=error.error
      })
    } 

}
