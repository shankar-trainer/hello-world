import {Component, Input} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {CommonModule, NgIf} from '@angular/common';
import {Customer} from './model/customer';
import {ActivatedRoute, Route, Router} from '@angular/router';

@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule
  ],
  templateUrl: './customer1.component.html',
  styleUrl: './customer1.component.css'
})
export class Customer1Component {
  @Input() c: Customer;

  constructor(private route: ActivatedRoute, private router: Router) {
    this.c = new Customer();
  }

  onsubmit1() {
    sessionStorage.setItem('capital','new delhi');
    this.router.navigate(['/customerdata1', this.c.id, this.c.name, this.c.salary,'hindustan'])
  }
}
