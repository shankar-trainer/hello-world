import { Routes } from '@angular/router';
import { SecurityComponent } from './security/security.component';
import { UserComponent } from './user/user.component';
export const routes: Routes = [
  // { path: '', component: CustomerComponent },
  // { path: 'customer', component: CustomerComponent },
  // { path: 'product', component: ProductComponent},
  // //{ path: 'searchproduct/:id', component: SearchproductComponent}
  // { path: 'searchproduct/:id/:name', component: SearchproductComponent}

   { path: '', component: UserComponent },
   { path: 'user', component: UserComponent },
  
  //    { path: 'security', component: SecurityComponent },
  { path: 'security', component: SecurityComponent },
  { path: 'security/:uname/:upass', component: SecurityComponent },
];

