import { Component, OnInit } from '@angular/core';
@Component({
    selector: 'app-root',
    template: `<app-child (valueChange)='displayCounter($event)'></app-child>`
})
export class AppComponent implements OnInit {
    ngOnInit() {

    }
    displayCounter(count:any) {
        console.log(count);
    }
}