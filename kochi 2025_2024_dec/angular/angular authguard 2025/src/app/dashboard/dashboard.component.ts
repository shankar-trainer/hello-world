import { Component } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-dashboard',
  imports: [],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent {
  email = localStorage.getItem('email');

  constructor(private authService: AuthService) { }

  signOut() {
      this.authService.signOut();
  }

}
