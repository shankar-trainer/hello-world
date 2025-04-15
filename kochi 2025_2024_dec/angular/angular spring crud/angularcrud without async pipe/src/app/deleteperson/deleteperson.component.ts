import { Component, Input } from '@angular/core';
import { Person } from '../model/Person';
import { PersonService } from '../service/person.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-deleteperson',
  imports: [CommonModule,FormsModule],
  templateUrl: './deleteperson.component.html',
  styleUrl: './deleteperson.component.css'
})
export class DeletepersonComponent {
  
    @Input() p: Person;
    @Input() p1: Person;
    msg:string=''
    visible:boolean=true;
    constructor(private service: PersonService, private router: Router) {
      this.p = new Person();
      this.p1 = new Person();
    }
  
    deletePerson() {
       this.visible=true;
      this.service.deletePerson(this.p.id).subscribe(
        data=>{
          this.p1=data;
          this.msg='Record Deleted';
        },error=>{
           this.msg=error.error;
      })
    }
  
    gotoaddPerson(){
      this.router.navigate(['add'])
    }
    gotoshowAllPerson(){
      this.router.navigate(['all'])
    }
  

}
