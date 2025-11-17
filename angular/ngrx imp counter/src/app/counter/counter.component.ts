import { Component } from '@angular/core';
import {Observable} from 'rxjs';
import {select, Store} from '@ngrx/store';
import {increment} from './counter.actions';
import {CommonModule} from '@angular/common';

@Component({
  selector: 'app-counter',
  imports: [CommonModule],
  templateUrl: './counter.component.html',
  styleUrl: './counter.component.css'
})

export class CounterComponent {
 public count1:Observable<number>;

 constructor(private store:Store<{count2:number}>) {
   // this.count1=store.pipe(select('count'));
   this.count1=store.pipe(select('count2'));
   // select('count') should match app.config.ts
   //      provideStore({ count: counterReducer }),
 }
 public increment() {
    this.store.dispatch(increment());
 }
}
