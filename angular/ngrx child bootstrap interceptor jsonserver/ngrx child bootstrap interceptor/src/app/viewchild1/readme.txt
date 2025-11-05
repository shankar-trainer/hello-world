To access a specific DOM element within a component's template using @ViewChild and ElementRef in Angular, the following steps and example can be used:
1. Template Setup:
Assign a template reference variable (using #) to the desired HTML element in the component's template.
Code

<!-- app.component.html -->
<input type="text" #myInput placeholder="Enter something...">
<button (click)="focusInput()">Focus Input</button>

2. Component Logic:
Import ViewChild, ElementRef, and AfterViewInit from @angular/core.
Use @ViewChild to query the template reference variable and type it as ElementRef.
Implement AfterViewInit to ensure the DOM element is available when accessing nativeElement.
TypeScript

// app.component.ts
import { Component, ViewChild, ElementRef, AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements AfterViewInit {
  @ViewChild('myInput') myInputRef!: ElementRef;

  ngAfterViewInit() {
    // Access the native DOM element and its properties
    console.log('Input element:', this.myInputRef.nativeElement);
  }

  focusInput() {
    this.myInputRef.nativeElement.focus(); // Focus the input element
    this.myInputRef.nativeElement.value = 'Focused!'; // Set its value
  }
}
Explanation:
#myInput: This creates a template reference variable named myInput for the <input> element.
@ViewChild('myInput') myInputRef!: ElementRef;: This decorator in the component class queries for the element with the template reference myInput and assigns it to the myInputRef property. The type ElementRef indicates that we are getting a reference to the native DOM element. The ! is a definite assignment assertion, indicating that myInputRef will be assigned a value before it's used.
ngAfterViewInit(): This lifecycle hook is crucial because it ensures that the component's view, including the DOM elements, has been fully initialized and rendered. Attempting to access nativeElement before this hook might result in undefined.
this.myInputRef.nativeElement: This provides access to the underlying native DOM element, allowing direct manipulation of its properties and methods (e.g., focus(), value, style).
This example demonstrates how to use @ViewChild with ElementRef to interact directly with a specific DOM element in an Angular component.
