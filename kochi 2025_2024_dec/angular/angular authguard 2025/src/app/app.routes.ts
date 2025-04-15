import { Routes } from '@angular/router';
import { authGuard } from './auth.guard';
//import { authGuard } from './auth.guard';


export const routes: Routes = [
    {
        path: 'auth',
        loadComponent: () =>
            import('./auth/auth.component').then((m) => m.AuthComponent),
    },
    {
        path: 'dashboard',
        loadComponent: () =>
            import('./dashboard/dashboard.component').then(
                (m) => m.DashboardComponent
            ),
        canActivate: [authGuard],
    },

];
