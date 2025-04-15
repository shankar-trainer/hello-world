import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';

export const authGuard: CanActivateFn = (route, state) => {
  
  const _router = inject(Router)
  const isLoggein = localStorage.getItem('tokenData');
  if(isLoggein){
    return true;
  }

  _router.navigateByUrl('login')
  return false;
};
