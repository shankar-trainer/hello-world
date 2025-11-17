import { HttpEvent, HttpEventType, HttpHandler, HttpInterceptor, HttpInterceptorFn, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, tap } from 'rxjs';

// @Injectable()
// export class loggingInterceptor implements HttpInterceptor {
//   constructor() {}

//   intercept(
//     request: HttpRequest<any>,
//     next: HttpHandler
//   ): Observable<HttpEvent<any>> {
//     console.log('Outgoing HTTP request', request);
//     return next.handle(request).pipe(
//       tap((event: HttpEvent<any>) => {
//         console.log('Incoming HTTP response', event);
//       })
//     );
//   }
// }


// // functional implementation
export const loggingInterceptor: HttpInterceptorFn = (req, next) => {
  console.log('Request URL:', req.url);
  //return next(req);

  return next(req).pipe(
    tap(event => {
      // Response handling
      // Check for HttpEventType to ensure it's a response
      if (event.type === 4) { // HttpEventType.Response
        console.log('Incoming Response:', event);
        console.log('Incoming Response:', event.body,event.status);
        // You can access event.body, event.status, etc.
      }
    })
  );
};


// old one  -- using di
// @Injectable() 
// export class loggingInterceptor implements HttpInterceptorFn {
//   constructor() { }

//   intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

//     console.log("outgoing Http Request", req);
//     return next.handle(req).pipe(
//       tap((event: HttpEvent<any>) => {
//         console.log("outgoing Http Response", event);
//       })
//     )

//   }

// }
