import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SecurityComponent } from './security/security.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,SecurityComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angularjwt';
}
