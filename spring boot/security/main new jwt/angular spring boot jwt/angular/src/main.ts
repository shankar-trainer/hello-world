import { bootstrapApplication } from '@angular/platform-browser';
import { provideRouter } from '@angular/router';
import { HTTP_INTERCEPTORS, provideHttpClient, withInterceptorsFromDi } from '@angular/common/http';
import { AppComponent } from './app/app.component';
import { routes } from './app/app.routes';
import { ErrorInterceptor } from '@app/interceptors/errorInterceptor';

bootstrapApplication(AppComponent, {
  providers: [
    provideRouter(routes),
    { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },
    provideHttpClient(withInterceptorsFromDi()) // aqui é o correto
  ]
}).catch(err => console.error(err));
