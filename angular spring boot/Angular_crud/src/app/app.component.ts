import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ShowallcustomerComponent } from './showallcustomer/showallcustomer.component';
import { CustomeraddComponent } from './customeradd/customeradd.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet,ShowallcustomerComponent,
  CustomeraddComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Angular_crud';
}
