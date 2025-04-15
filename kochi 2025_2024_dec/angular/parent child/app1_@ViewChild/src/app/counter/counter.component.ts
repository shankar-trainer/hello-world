import { Component } from '@angular/core';

@Component({
  selector: 'app-counter',
  imports: [],
  templateUrl: './counter.component.html',
  styleUrl: './counter.component.css'
})

export class CounterComponent {
 c:number=0;
 c1:number=0;

 increment(){
   this.c++;
 }
 decrement(){
   this.c1--;
 }

}
