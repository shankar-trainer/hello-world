import { Component, Input } from '@angular/core';
import { User } from './user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {

  @Input() user: User;

  constructor(private router: Router) {
    this.user = new User();
  }

  submit() {
    
    this.router.navigate(['/security', this.user.username, this.user.password])

  }

}
