import { Component } from '@angular/core';
import { AuthService } from '../auth';

@Component({
  selector: 'app-dashboard',
  imports: [],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css',
})
export class Dashboard {
    email = localStorage.getItem('email');

    constructor(private authService: AuthService) { }

    signOut() {
        this.authService.signOut();
    }

}
