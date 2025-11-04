import { Injectable } from '@angular/core';
import { HttpEvent, HttpInterceptor, HttpHandler, HttpRequest, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable()
export class ErrorInterceptor implements HttpInterceptor {
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    return next.handle(req).pipe(
      catchError((error: HttpErrorResponse) => {
  console.error('Erro interceptado', error.status, error.error);
  let friendlyMessage = 'Ocorreu um erro inesperado.';
  if (error.status === 401) friendlyMessage = 'Usuário ou senha incorretos.';
  else if (error.status === 403) friendlyMessage = 'Acesso negado. Você não tem permissão.';
  else if (error.status === 404) friendlyMessage = 'Recurso não encontrado.';
  return throwError(() => new Error(friendlyMessage));
})
    );
  }
}