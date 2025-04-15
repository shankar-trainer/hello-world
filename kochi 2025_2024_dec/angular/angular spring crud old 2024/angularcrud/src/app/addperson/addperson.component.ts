import { Component, Input } from '@angular/core';
import { PersonService } from '../service/person.service';
import { Router } from '@angular/router';
import { Person } from '../model/Person';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-addperson',
  imports: [CommonModule,FormsModule],
  templateUrl: './addperson.component.html',
  styleUrl: './addperson.component.css'
})
export class AddpersonComponent {
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
  addPerson(){
    this.visible=true;
    this.service.addPerson(this.person).subscribe(data=>{
          this.msg="Record added"
          this.person1=data;
    },
    error=>{
           this.msg=error.error
    })
  }  
}
