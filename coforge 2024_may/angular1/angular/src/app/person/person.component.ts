import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Person } from './model/person';
import { data } from './data/persondata';
import { ExponentPipe } from './exponent.pipe';

@Component({
  selector: 'app-person',
  standalone: true,
  imports: [CommonModule,ExponentPipe],
  templateUrl: './person.component.html',
  styleUrl: './person.component.css'
})
export class PersonComponent {
 person:Person[]

 constructor(){
 this.person=data;
 }
}
