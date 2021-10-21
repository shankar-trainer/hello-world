import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import{SignUpComponent} from './sign-up/sign-up.component';
import {SuccessComponent} from './success/success.component';
import { ListUserComponent } from './list-user/list-user.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path:'',redirectTo:'user',pathMatch:'full'},
  {path:'sign-up',component:SignUpComponent},
  {path:'success',component:SuccessComponent},
  {path:'list-user',component:ListUserComponent},
  {path:'upadte/:id',component:UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
