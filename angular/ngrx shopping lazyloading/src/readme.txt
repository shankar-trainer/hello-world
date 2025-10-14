lazy loading in angular 19 example product
In Angular 19, lazy loading is most commonly implemented using standalone components and the router's loadComponent property. This method dynamically imports and loads a component only when the user navigates to its specific route, significantly improving initial application load times. 
Here is an example demonstrating lazy loading for a "product" page in an Angular application.
Step 1: Create a new standalone Angular application
This command sets up a new project with standalone components and routing enabled by default. 
bash
ng new product-app --standalone --routing
cd product-app
Use code with caution.

Step 2: Generate standalone product components
Create separate components for your product-related pages. This example uses ProductListComponent and ProductDetailComponent. 
bash

ng generate component products/product-list --standalone
ng generate component products/product-detail --standalone
Use code with caution.

Step 3: Configure lazy loading in app.routes.ts
Open src/app/app.routes.ts and set up your routes. The key is to use the loadComponent property, which takes a dynamic import() function pointing to your standalone component. 
typescript
// src/app/app.routes.ts
import { Routes } from '@angular/router';

export const routes: Routes = [
  // Eagerly loaded components (e.g., home page)
  { path: '', loadComponent: () => import('./home/home.component').then(m => m.HomeComponent) },

  // Lazy-loaded routes for the 'products' feature
  {
    path: 'products',
    children: [
      {
        path: '',
        loadComponent: () => import('./products/product-list/product-list.component')
          .then(m => m.ProductListComponent)
      },
      {
        path: ':id',
        loadComponent: () => import('./products/product-detail/product-detail.component')
          .then(m => m.ProductDetailComponent)
      }
    ]
  },
  
  // Wildcard route for 404 Not Found
  { path: '**', loadComponent: () => import('./page-not-found/page-not-found.component').then(m => m.PageNotFoundComponent) }
];
Use code with caution.

Step 4: Add router outlet and navigation links
Update your root component's template (src/app/app.component.html) to include the router-outlet and links for navigation. 
html
<!-- src/app/app.component.html -->
<h1>My Product App</h1>
<nav>
  <a routerLink="">Home</a> |
  <a routerLink="/products">Products</a>
</nav>
<hr>
<router-outlet></router-outlet>
Use code with caution.

Remember to add RouterOutlet and RouterLink to the imports array of your AppComponent for this to work in a standalone setup. 
typescript
// src/app/app.component.ts
import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  standalone: true,
  selector: 'app-root',
  templateUrl: './app.component.html',
  imports: [RouterOutlet, RouterLink], // Import RouterOutlet and RouterLink
})
export class AppComponent {
  title = 'product-app';
}
Use code with caution.

Step 5: Verify lazy loading
Run your application with ng serve.
Open your browser's developer tools and navigate to the Network tab.
Refresh the page while on the home route (http://localhost:4200). You will see the main bundle downloaded, but no product-list or product-detail component chunks.
Click the "Products" link. A new network request will appear, downloading a new JavaScript chunk containing the ProductListComponent and related code. 
This process confirms that the product-related components are only loaded when the user navigates to that part of the application, thereby decreasing the initial bundle size and improving the initial page load speed. 
