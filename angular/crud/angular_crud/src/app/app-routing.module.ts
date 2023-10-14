import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowallComponent } from './showall/showall.component';
import { AddproductComponent } from './addproduct/addproduct.component';

const routes: Routes = [
  { path: '', component: ShowallComponent },
  { path: 'showall', component: ShowallComponent },
  { path: 'add', component: AddproductComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
