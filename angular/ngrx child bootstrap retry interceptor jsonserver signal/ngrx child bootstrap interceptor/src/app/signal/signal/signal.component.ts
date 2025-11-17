import {Component, computed, signal, effect} from '@angular/core';
import {count} from "rxjs";

@Component({
    selector: 'app-signal',
    imports: [],
    templateUrl: './signal.component.html',
    styleUrl: './signal.component.css'
})
export class SignalComponent {

    count = signal(0);

    increment() {
        this.count.update(count => count + 1);
    }

    x = signal(2);
    y = signal(3);

    // sum = (computed(() => this.x() + this.y()));
    sum: any;

    addition() {
        this.sum = (computed(() => this.x() + this.y()))
    }


    message = signal('Hello');


    constructor() {
        effect(() => {
            console.log(`count is ${this.count()}`);
            console.log(`Current message: ${this.message()}`);
        });
    }


}
