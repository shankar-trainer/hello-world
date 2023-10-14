import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MyproductComponent } from './myproduct/myproduct.component';
import { CreateProductComponent } from './create-product/create-product.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { SearchProductComponent } from './search-product/search-product.component';


const routes: Routes = [

  {path:'',redirectTo:'product',pathMatch:'full'},
  {path:'myproduct',component:MyproductComponent},
  {path:'add',component:CreateProductComponent},
  {path:'detail/:id',component:ProductDetailsComponent},
  {path:'update/:id',component:UpdateProductComponent},
  {path:'search',component:SearchProductComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
