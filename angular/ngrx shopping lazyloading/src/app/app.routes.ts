import { Routes } from '@angular/router';

   export const routes: Routes = [];

 // product list lazy loading
// export const routes: Routes = [
//   { path: '', redirectTo: 'products', pathMatch: 'full' },
//   {
//     path: 'products',
//     loadComponent: () => import('./products/product-list/product-list.component') 
//       .then(m => m.ProductListComponent),
//   },
//   {
//     path: 'products/:id', // Route for individual product details
//     loadComponent: () => import('./products/product-details/product-details.component')
//       .then(m => m.ProductDetailsComponent),
//   },
//   // ... other routes
// ];


//  shopping kart1

// export const routes: Routes = [
//   {path:'',component:CartComponent},
//   {path:'cart',component:CartComponent},
//   {path:'product',component:ProductListComponent},
// ];


