import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  template:`
  <app-child-input [childMessage]="parentMessage"></app-child-input>`
  
})
export class ParentComponent {
  parentMessage = 'This is a a message from parent';

}
