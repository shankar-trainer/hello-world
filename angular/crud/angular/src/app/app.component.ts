import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { GetallcustomerComponent } from './getallcustomer/getallcustomer.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,GetallcustomerComponent,RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angularcrud';
}
