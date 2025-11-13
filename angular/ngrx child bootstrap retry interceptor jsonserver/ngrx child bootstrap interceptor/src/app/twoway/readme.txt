Two-way binding in Angular without using @Input() (for child-to-parent communication) can be achieved by combining property binding [] and event binding () on the same element within a component's template. This approach essentially mimics the behavior of [(ngModel)] or custom two-way binding with @Input() and @Output(), but within a single component.
Here's an example:

TypeScript

// app.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>Two-Way Binding without ngModel or @Input/@Output</h1>
    <input
      [value]="userName"
      (input)="onInputChange($event)"
      placeholder="Enter your name"
    />
    <p>Hello, {{ userName }}!</p>
  `
})
export class AppComponent {
  userName: string = 'Guest';

  onInputChange(event: Event): void {
    this.userName = (event.target as HTMLInputElement).value;
  }
}
Explanation:
Property Binding [value]="userName": This binds the value property of the input element to the userName property in the AppComponent. This ensures that the input field initially displays the value of userName and updates if userName changes programmatically within the component.

Event Binding (input)="onInputChange($event)": This listens for the input event on the input element. Whenever the user types or changes the input field's value, the onInputChange method is called.
onInputChange(event: Event) method:

It receives the event object, which contains information about the input event.
event.target as HTMLInputElement casts the event target to an HTMLInputElement to access its value property.
this.userName = (event.target as HTMLInputElement).value; updates the userName property in the component with the new value from the input field.

This combination of property and event binding creates a two-way synchronization: changes in the userName property update the input field, and changes in the input field update the userName property.
