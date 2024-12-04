import { inject } from '@angular/core';
import { HttpErrorResponse, HttpInterceptorFn } from '@angular/common/http';
import { catchError, throwError } from 'rxjs';
import { UserService } from './user.service';

export const customInterceptor: HttpInterceptorFn = (req, next) => {
  const userService = inject(UserService);

  let loggedUserData: any;
  const localData = localStorage.getItem('tokenData');
  if (localData != null) {
    loggedUserData = JSON.parse(localData);
  }

  const clonReq = req.clone({
    setHeaders: {
      Authorization: `Bearer ${loggedUserData?.token}`,
    },
  });
  return next(clonReq).pipe(
    catchError((error: HttpErrorResponse) => {
      if (error.status === 401) {
        const isrefresh = confirm(
          'Your session is expired. Do you want to contiue'
        );
        if (isrefresh) {
          userService.$refreshToken.next(true);
        }
      }
      return throwError(error);
    })
  );
};
