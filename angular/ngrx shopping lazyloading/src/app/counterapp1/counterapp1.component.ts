import { Component } from '@angular/core';
import { select, Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { CounterState } from './counter.state';
import * as CounterActions from './counter.actions';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-counterapp1',
  imports: [CommonModule],
  templateUrl: './counterapp1.component.html',
  styleUrl: './counterapp1.component.css'
})
export class Counterapp1Component {

  count$: Observable<number>;

  constructor(private store: Store<{ counter: CounterState }>) {
    this.count$ = store.pipe(select((state) => state.counter.count));
  }

  increment() {
    this.store.dispatch(CounterActions.increment());
  }

  decrement() {
    this.store.dispatch(CounterActions.decrement());
  }

  reset() {
    this.store.dispatch(CounterActions.reset());
  }

  incrementBy(step: number) {
    this.store.dispatch(CounterActions.incrementBy({ step }));
  }
}
