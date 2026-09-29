import { Component } from '@angular/core';
import { Personservice } from '../personservice';
import { Person } from './model/person';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-person-compoment',
  imports: [CommonModule],
  templateUrl: './person-compoment.html',
  styleUrl: './person-compoment.css',
})
export class PersonCompoment {
  person:Observable<Person[]>;

  constructor(private service:Personservice){
     this.person=service.getAllperson();
 }

}
