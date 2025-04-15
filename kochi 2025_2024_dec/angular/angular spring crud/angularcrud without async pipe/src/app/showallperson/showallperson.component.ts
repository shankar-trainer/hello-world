import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Observable } from 'rxjs';
import { Person } from '../model/Person';
import { PersonService } from '../service/person.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showallperson',
  imports: [CommonModule, FormsModule],
  templateUrl: './showallperson.component.html',
  styleUrl: './showallperson.component.css'
})
export class ShowallpersonComponent {
  // personlist:Observable<Person[]>;
  personlist:Person[]=new Array();
  msg:string='';
  constructor(private service:PersonService, private router:Router){
   // this.personlist=service.getAllPerson();
    service.getAllPerson().subscribe(data=>{
       this.personlist=data;
       this.msg='all record'
    },error=>{
         this.msg=error.error
    });
  }

  gotodeletePerson(){
    this.router.navigate(['delete']);
  }
  gotoaddPerson(){
    this.router.navigate(['add']);
  }

  gotosearchPerson(){
    this.router.navigate(['search']);
  }

  gotoupdatePerson(){
    this.router.navigate(['update']);
  }
}
