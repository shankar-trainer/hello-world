import { Component } from '@angular/core';
import { Customer } from './customer';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {
  customer: Customer;
  customer1: Customer[];

  customerinfo():void{
   alert(`id is ${this.customer.id}\nname is ${this.customer.name}\nsalary is ${this.customer.salary}`)
  }
  constructor() {
    this.customer = {
      'id': 10001,
      'name': 'suman kumar',
      'salary': 78000,
      'image': 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b.jpg',
      'width': 200,
      'height': 150
    };
    this.customer1 = [
      {
        'id': 90001,
        'name': 'aman kumar',
        'salary': 79000,
        'image': 'http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg'
        , 'width': 200,
        'height': 150
      },
      {
        'id': 90002,
        'name': 'akash kumar',
        'salary': 71000,
        'image': 'http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf.jpg'
        , 'width': 200,
        'height': 150

      },
      {
        'id': 90003,
        'name': 'rohit kumar',
        'salary': 45000,
        'image': 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087.jpg'
        , 'width': 200,
        'height': 150

      },
      {
        'id': 90005,
        'name': 'sarvesh kumar',
        'salary': 67000,
        'image': 'http://i.annihil.us/u/prod/marvel/i/mg/d/50/50febb79985ee.jpg'
        , 'width': 200,
        'height': 150

      },
      {
        'id': 90006,
        'name': 'pursotam kumar',
        'salary': 17000,
        'image': 'http://i.annihil.us/u/prod/marvel/i/mg/6/70/526547e2d90ad.jpg'
        , 'width': 200,
        'height': 150

      },
      {
        'id': 90007,
        'name': 'ashis kumar',
        'salary': 56000,
        'image': 'http://i.annihil.us/u/prod/marvel/i/mg/6/40/526963dad214d.jpg'
        , 'width': 200,
        'height': 150

      },
      {
        'id': 90008,
        'name': 'balram kumar',
        'salary': 71000,
        'image': 'http://i.annihil.us/u/prod/marvel/i/mg/2/80/511a79a0451a3.jpg'
        , 'width': 200,
        'height': 150

      },
    ]
  }

}
