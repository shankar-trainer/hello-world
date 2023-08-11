import { Component } from '@angular/core';

@Component({
  selector: 'app-parent1',
  templateUrl: './parent1.component.html',
  styleUrls: ['./parent1.component.css']
})

export class Parent1Component {
  name: any;

  send() {
    console.log('send clicked')
    this.name = 'mahesh kumar';
  }
}
