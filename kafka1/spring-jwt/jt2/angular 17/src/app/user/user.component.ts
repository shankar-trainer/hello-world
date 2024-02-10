import { Component, Input } from '@angular/core';
import { User } from './user';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
  standalone: true,
  imports: [CommonModule,FormsModule],
})
export class UserComponent {

  @Input() user: User;

  constructor(private router: Router) {
    this.user = new User();
  }

  submit() {
    console.log('submit() called '+JSON.stringify(this.user));
    console.log(this.user.username, this.user.password);
    
    this.router.navigate(['/security', this.user.username, this.user.password])

  }

}
