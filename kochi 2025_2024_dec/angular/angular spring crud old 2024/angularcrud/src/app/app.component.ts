import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { ShowallpersonComponent } from './showallperson/showallperson.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ShowallpersonComponent,RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angularcrud';
}
