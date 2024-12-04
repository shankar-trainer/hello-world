import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SecurityComponent } from './security/security.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,SecurityComponent,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title:string='angular security'
}
