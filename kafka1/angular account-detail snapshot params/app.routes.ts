import { Routes } from '@angular/router';
import { AccountDetailComponent } from './account-detail/account-detail.component';
import { HomeComponent } from './home/home.component';
import { AccountComponent } from './account/account.component';

export const routes: Routes = [{ path: 'home', component: HomeComponent },
{ path: 'account', component: AccountComponent },
{ path: 'account/:id', component: AccountDetailComponent },
{ path: '', redirectTo: '/home', pathMatch: 'full' },
];
