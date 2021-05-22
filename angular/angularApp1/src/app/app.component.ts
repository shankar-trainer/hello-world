import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'angularApp1';
  location:string="chennai";
  state:string;

  constructor(){
    this.title="my first angular application";
    this.location="banglore";
    this.state="karnataka";
  }

}
