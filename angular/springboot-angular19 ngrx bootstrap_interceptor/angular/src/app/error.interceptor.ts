import { HttpErrorResponse, HttpEvent, HttpHandlerFn, HttpInterceptorFn, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {
  HttpInterceptor,
  HttpHandler,
  HttpResponse,
} from '@angular/common/http';
import { catchError, Observable, tap, throwError } from 'rxjs';

// export const ErrorInterceptor: HttpInterceptorFn = (req: HttpRequest<unknown>, next: HttpHandlerFn) => {
//   return next(req).pipe(
//     catchError((error: HttpErrorResponse) => {
//       let errorMessage = '';
//       if (error.error instanceof ErrorEvent) {
//         // Client-side error
//         errorMessage = `Client Error: ${error.error.message}`;
//       } else {
//         // Server-side error
//         errorMessage = `Server Error Code: ${error.status}, Message: ${error.message}`;
//         // You can add specific handling for different status codes here
//         switch (error.status) {
//           case 401:
//             // Handle unauthorized access (e.g., redirect to login)
//             console.log('Unauthorized request');
//             break;
//           case 404:
//             // Handle not found
//             console.log('Resource not found');
//             break;
//           // ... more cases
//         }
//       }
//       console.error(errorMessage);
//       return throwError(() => new Error(errorMessage)); // Re-throw the error
//     })
//   );
// };
// with functional 
// export const ErrorInterceptor: HttpInterceptorFn = (req: HttpRequest<unknown>, next: HttpHandlerFn) => {
//   return next(req).pipe(
//       catchError((error: HttpErrorResponse) => {
//                 // Handle the error here
//                 console.error('error occurred: using functional ', error);
//                 //throw error as per requirement
//                 return throwError(error);
//     })
//   );
// };

// using class based , di

@Injectable()
export class ErrorInterceptor implements HttpInterceptor {

  constructor() {}

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    return next.handle(request).pipe(
      catchError((error: HttpErrorResponse) => {
        // Handle the error here
        console.error('error occurred: using class based', error);
        //throw error as per requirement
        return throwError(error);
      })
    );
  }
}
