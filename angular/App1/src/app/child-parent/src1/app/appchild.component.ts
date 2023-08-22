import { Component, EventEmitter, Output } from '@angular/core';

@Component({
    selector: 'app-child',
    template: `<button class='btn btn-primary' (click)="valueChanged()">Click me</button> `
})
export class AppChildComponent {

    @Output() valueChange = new EventEmitter();
    Counter = 0;

    valueChanged() { // You can give any function name

        this.Counter = this.Counter + 1;
        this.valueChange.emit(this.Counter);
    }
}