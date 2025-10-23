import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { cartReducer } from './store/cart.reducer';
import { provideStore } from '@ngrx/store';

export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes),
    provideStore({ cart: cartReducer }),
  ]
};
