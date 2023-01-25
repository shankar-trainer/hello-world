import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'App2';
  age:number=20;
  name:string;
  
  constructor(){
    this.title ='my first program';
    this.age=40;
    this.name='ram kumar';
  }
}
