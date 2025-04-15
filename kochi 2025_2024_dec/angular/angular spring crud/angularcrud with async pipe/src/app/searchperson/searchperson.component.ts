import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { PersonService } from '../service/person.service';
import { Router } from '@angular/router';
import { Person } from '../model/Person';

@Component({
  selector: 'app-searchperson',
  imports: [CommonModule, FormsModule],
  templateUrl: './searchperson.component.html',
  styleUrl: './searchperson.component.css'
})
export class SearchpersonComponent {

  @Input() p: Person;
  @Input() p1: Person;
  msg:string=''
  visible:boolean=true;
  constructor(private service: PersonService, private router: Router) {
    this.p = new Person();
    this.p1 = new Person();
  }

  searchPerson() {
     this.visible=true;
    this.service.searchPerson(this.p.id).subscribe(
      data=>{
        this.p1=data;
        this.msg='Record Found';
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
