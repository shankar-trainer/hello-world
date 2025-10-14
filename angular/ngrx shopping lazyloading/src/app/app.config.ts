import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { counterReducer } from './counterapp1/counter.reducer';
import { provideState, provideStore } from '@ngrx/store';
import { counterReducer1 } from './counterapp2/counter.reducer';
import { counterReducer2 } from './counterapp3/counter.reducer';
// import { cartReducer } from './shopping-kart1/store/cart.reducer';
 import { cartReducer } from './shopping-kart/store/cart.reducer';

export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), 
    provideRouter(routes),

    //  provideStore({ counter: counterReducer }),
    // provideStore({ counter1:counterReducer1 }),
    // provideStore({ counter2:counterReducer2 }),
    // provideStore({ cart: cartReducer})
    provideStore({ cart: cartReducer }),
  ]

};
