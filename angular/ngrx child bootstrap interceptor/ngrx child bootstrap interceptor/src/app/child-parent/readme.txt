The @Output() decorator in Angular facilitates communication from a child component to its parent component. It is typically used in conjunction with EventEmitter to emit custom events that the parent component can listen to and respond to.
Here is an example demonstrating the use of @Output():
1. Child Component (child.component.ts)
TypeScript

import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  template: `
    <button (click)="sendMessage()">Send Message to Parent</button>
  `
})
export class ChildComponent {
  // Declare an @Output property named 'messageEvent'
  // It's an EventEmitter that emits a string value
  @Output() messageEvent = new EventEmitter<string>();

  sendMessage() {
    // Emit a custom event with a string payload
    this.messageEvent.emit('Hello from the Child Component!');
  }
}
2. Parent Component (parent.component.ts)
TypeScript

import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  template: `
    <app-child (messageEvent)="receiveMessage($event)"></app-child>
    <p>Message from Child: {{ receivedMessage }}</p>
  `
})
export class ParentComponent {
  receivedMessage: string = '';

  // Method to handle the event emitted by the child
  receiveMessage(message: string) {
    this.receivedMessage = message;
  }
}
