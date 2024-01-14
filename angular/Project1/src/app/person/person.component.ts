import { Component, Input } from '@angular/core';
import { Person } from './model/person';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-person',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './person.component.html',
  styleUrl: './person.component.css'
})
export class PersonComponent {
@Input() person: Person;
submit:boolean=false;

 constructor(){
   this.person=new Person();
 }
 onsubmit(){
  this.submit=true;
 }

}
