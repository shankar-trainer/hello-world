import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterOutlet } from '@angular/router';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ProductComponent } from './product/product.component';
import { CustomerComponent } from './customer/customer.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet,RouterLink,ProductComponent,CustomerComponent,SearchproductComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Project2';
}
