import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
// import {counterReducer} from './counter/counter.reducer';
import {provideStore} from '@ngrx/store';
import {counterReducer} from './counter1/counter.reducer'; // for counter1

export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }),
    provideRouter(routes),

     // for counter
    // this count should match counter.component.ts    this.count1=store.pipe(select('count'));
    /// Key 'count' corresponds to the state slice

     // provideStore({ count: counterReducer }),

    // provideStore({ count2: counterReducer }), // for counter

     // for counter1
    // provideStore({ count: counterReducer }), // for counter1
      provideStore({ count: counterReducer }),  //this count should match counter1.component.ts  his.store.pipe(select(state => state.count.count3));

     // provideStore({ count2: counterReducer }),
  ]

};
