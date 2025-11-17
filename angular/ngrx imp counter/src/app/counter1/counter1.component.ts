import {Component} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Observable} from 'rxjs';
import {select, Store} from '@ngrx/store';
import * as CounterActions from './counter.actions';

interface AppState {
  //count: { count: number }; // Matches the structure defined in StoreModule.forRoot
   count: { count3: number }; // Matches the structure defined in StoreModule.forRoot
}

@Component({
  selector: 'app-counter1',
  imports: [CommonModule],
  templateUrl: './counter1.component.html',
  styleUrl: './counter1.component.css'
})

export class Counter1Component {

  count$: Observable<number>;

  constructor(private store: Store<AppState>) {
    // Selects the 'count' property from the 'count' state slice
    // this.count$ = this.store.pipe(select(state => state.count.count));
    this.count$ = this.store.pipe(select(state => state.count.count3));
  }

  increment(): void {
    this.store.dispatch(CounterActions.increment());
  }

  decrement(): void {
    this.store.dispatch(CounterActions.decrement());
  }

  reset(): void {
    this.store.dispatch(CounterActions.reset());
  }
}
