import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { SearchProductComponent } from './search-product/search-product.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path:'showall',component:ProductComponent},
  {path:'add',component:CreateProductComponent},
  {path:'search',component:SearchProductComponent},
  {path:'delete',component:DeleteProductComponent},
  {path:'update',component:UpdateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
