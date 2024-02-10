import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { SecurityComponent } from './security/security.component';
const routes: Routes = [
    { path: '', component: UserComponent },
    { path: 'user', component: UserComponent },

    //    { path: 'security', component: SecurityComponent },
    //  { path: 'security1', component: SecurityComponent },
    { path: 'security/:uname/:upass', component: SecurityComponent },
    //{ path: 'security', component: SecurityComponent },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule {

}