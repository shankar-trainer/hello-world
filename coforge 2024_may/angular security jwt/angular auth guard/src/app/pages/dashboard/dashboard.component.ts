import { Component } from '@angular/core';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css',
})
export class DashboardComponent {
  userList: any = [];
  constructor(private usrService: UserService) {
    this.getUsers();
    this.usrService.$refreshTokenReceived.subscribe((res: any) => {
      this.getUsers();
    });
  }

  getUsers() {
    this.usrService.getUsers().subscribe((res: any) => {
      this.userList = res.data;
    });
  }
}
