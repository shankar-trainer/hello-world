import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { selectCount } from './counter.selector';
import { Observable } from 'rxjs';
import {  increment1 } from './counter.action';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-counterapp3',
  imports: [CommonModule],
  templateUrl: './counterapp3.component.html',
  styleUrl: './counterapp3.component.css'
})
export class Counterapp3Component {

    count$: Observable<number>;

  // constructor(private store: Store<{ counter1: CounterState }>) {
  //   this.count = store.pipe(select((state) => state.counter1.count));
  // }

  constructor(private store: Store) {
    this.count$ = this.store.select(selectCount);
  }

  increment() {
    this.store.dispatch(increment1());
  }

}
