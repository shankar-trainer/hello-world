store.pipe(select('count'))

The expression store.pipe(select('count')) is a common pattern used in NgRx, a state management library for Angular applications. It allows you to select a specific slice of your application's state and subscribe to its changes as an RxJS Observable.
Here's a breakdown:

store: This refers to the NgRx Store instance, which holds the entire application state.
.pipe(): This is an RxJS operator that allows you to chain multiple operators together to transform an Observable.

select('count'): This is an NgRx selector operator. When used with a string argument like 'count', it tells the store to select the property named count from the root of your application's state.

In essence, store.pipe(select('count')) creates an Observable that will emit the value of the count property from your NgRx store whenever it changes.
Example:

Consider an NgRx store where your state looks like this:
TypeScript

interface AppState {
  count: number;
  // other state properties
}

In an Angular component, you might inject the Store and then use this expression to get an observable of the count:
TypeScript

import { Component } from '@angular/core';
import { Store, select } from '@ngrx/store';
import { Observable } from 'rxjs';

interface AppState {
  count: number;
}

@Component({
  selector: 'app-my-counter',
  template: `
    Count: {{ count$ | async }}
  `,
})
export class MyCounterComponent {
  count$: Observable<number>;

  constructor(private store: Store<AppState>) {
    this.count$ = this.store.pipe(select('count'));
  }
}
In this example, count$ is an Observable that will emit the current value of count from the store whenever it's updated. The async pipe in the template automatically subscribes to this Observable and displays its latest value.


============

createAction  name can be any thing

// export const increment = createAction('[Counter Component] Increment');
// export const decrement = createAction('[Counter Component] Decrement');
// export const reset = createAction('[Counter Component] Reset');

export const increment = createAction('[Hello Component] Greeting');
export const decrement = createAction('[Hello Component] Welcome');
export const reset = createAction('[Hello Component] Cancel');
