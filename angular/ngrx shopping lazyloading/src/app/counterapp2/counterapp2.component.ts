import { Component } from '@angular/core';
import { select, Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { CounterState } from './counter.state';
import { increment } from './counter.action';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-counterapp2',
  imports: [CommonModule],
  templateUrl: './counterapp2.component.html',
  styleUrl: './counterapp2.component.css'
})
export class Counterapp2Component {

  count: Observable<number>;

  constructor(private store: Store<{ counter1: CounterState }>) {
    this.count = store.pipe(select((state) => state.counter1.count));
  }

  increment() {
    this.store.dispatch(increment())
  }
}
