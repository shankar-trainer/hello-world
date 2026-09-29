import { Component, Input } from '@angular/core';
import { Person } from './model/person';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Personservice } from '../personservice';

@Component({
  selector: 'app-add-person-component',
  imports: [CommonModule, FormsModule],
  templateUrl: './add-person-component.html',
  styleUrl: './add-person-component.css',
})
export class AddPersonComponent {
  @Input() p: Person;
  p1: Person;
   msg:string='';
  constructor(private service: Personservice) {
    this.p = new Person();
    this.p1 = new Person();
  }

  addrecord() {
    //  this.service.addperson(this.p).
    //    subscribe();
       
     this.service.addperson(this.p).
       subscribe((data)=>{
        this.p1=data
        this.msg='record added '
       },
       error=>{
         this.msg=error.error
       }
    );


  }

}
