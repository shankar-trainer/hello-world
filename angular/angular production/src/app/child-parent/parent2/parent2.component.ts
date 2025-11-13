import { Component } from '@angular/core';

@Component({
  selector: 'app-parent2',
  imports: [],
  templateUrl: './parent2.component.html',
  styleUrl: './parent2.component.css'
})
export class Parent2Component {
    receivedMessage: string = '';

    // Method to handle the event emitted by the child
    receiveMessage(message: string) {
        this.receivedMessage = message;
    }

}
