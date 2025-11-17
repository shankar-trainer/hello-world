An NgRx counter example demonstrating the use of store.pipe(select('count')) involves setting up a basic NgRx store with a counter state and then selecting that state within an Angular component.

1. Define Actions (e.g., counter.actions.ts)
TypeScript

import { createAction } from '@ngrx/store';

export const increment = createAction('[Counter Component] Increment');
export const decrement = createAction('[Counter Component] Decrement');
export const reset = createAction('[Counter Component] Reset');

2. Define Reducer (e.g., counter.reducer.ts)
TypeScript

import { createReducer, on } from '@ngrx/store';
import * as CounterActions from './counter.actions';

export interface CounterState {
  count: number;
}

export const initialState: CounterState = {
  count: 0,
};

export const counterReducer = createReducer(
  initialState,
  on(CounterActions.increment, (state) => ({ ...state, count: state.count + 1 })),
  on(CounterActions.decrement, (state) => ({ ...state, count: state.count - 1 })),
  on(CounterActions.reset, (state) => ({ ...state, count: 0 }))
);
3. Configure Store in app.module.ts
TypeScript

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { StoreModule } from '@ngrx/store';
import { counterReducer } from './counter.reducer'; // Adjust path as needed
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    StoreModule.forRoot({ count: counterReducer }) // Key 'count' corresponds to the state slice
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
4. Component (e.g., app.component.ts)
TypeScript

import { Component } from '@angular/core';
import { Store, select } from '@ngrx/store';
import { Observable } from 'rxjs';
import * as CounterActions from './counter.actions'; // Adjust path as needed

interface AppState {
  count: { count: number }; // Matches the structure defined in StoreModule.forRoot
}

@Component({
  selector: 'app-root',
  template: `
    <div>
      <p>Current Count: {{ count$ | async }}</p>
      <button (click)="increment()">Increment</button>
      <button (click)="decrement()">Decrement</button>
      <button (click)="reset()">Reset</button>
    </div>
  `
})
export class AppComponent {
  count$: Observable<number>;

  constructor(private store: Store<AppState>) {
    // Selects the 'count' property from the 'count' state slice
    this.count$ = this.store.pipe(select(state => state.count.count));
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
In this example:
The count$ observable in AppComponent is populated by using this.store.pipe(select(state => state.count.count)).
This selects the count property from the count slice of the overall application state.
The StoreModule.forRoot({ count: counterReducer }) call in app.module.ts registers the counterReducer to manage the state under the
key count.

This key is then used in the select operator to target the correct part of the state.
