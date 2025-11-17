import { Routes } from '@angular/router';
import { authGuard } from './auth-guard';

export const routes: Routes = [
        {
        path: 'auth',
        loadComponent: () =>
            // import('./auth/auth.component').then((m) => m.AuthComponent),
            import('./auth/auth').then((m) => m.Auth),
    },
    {
        path: 'dashboard',
        loadComponent: () =>
            // import('./dashboard/dashboard.component').then(
            import('./dashboard/dashboard').then(
                (m) => m.Dashboard
            ),
        canActivate: [authGuard],
    },

];
