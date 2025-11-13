import { ApplicationConfig, importProvidersFrom, provideExperimentalZonelessChangeDetection, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

//import { routes } from './app.routes';
// import { provideBrowserGlobalErrorListeners } from '@angular/core';
// import { provideRouter } from '@angular/router';
import { routes } from './app.routes';
import { provideStore } from '@ngrx/store';
import { counterReducer } from './counterapp1/counter.reducer';
import { HTTP_INTERCEPTORS, HttpClientModule, provideHttpClient, withInterceptors } from '@angular/common/http';
import { loggingInterceptor } from './logging.interceptor';
import { ErrorInterceptor } from './error.interceptor';
// import { counterReducer } from './client/client.store';


export const appConfig: ApplicationConfig = {
  // providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes)]

  providers: [
       // mix of both functional and di  
    {
      provide: HTTP_INTERCEPTORS,
      useClass: ErrorInterceptor,
      multi: true
    },

    // provideBrowserGlobalErrorListeners(),
    // provideExperimentalZonelessChangeDetection(),
    provideExperimentalZonelessChangeDetection(),
    provideRouter(routes),
    provideStore({ counter: counterReducer }),
    importProvidersFrom(HttpClientModule),
    provideHttpClient(
      // only functional 
       // withInterceptors([loggingInterceptor, ErrorInterceptor]) // Register your functional interceptor
   
         // mix of both functional and di  
      withInterceptors([loggingInterceptor])
      // Register your functional interceptor
    ),
  ]
};
