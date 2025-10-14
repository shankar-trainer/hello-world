import { Component } from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {Address, Person} from './model/person';

@Component({
  selector: 'app-person',
  imports: [CommonModule,FormsModule],
  templateUrl: './person.component.html',
  styleUrl: './person.component.css'
})
export class PersonComponent {

  person: Person = {
    id: 1,
    firstName: 'John',
    lastName: 'Doe',
    email: 'john.doe@example.com',
    addresses: [
      { street: '123 Main St', city: 'Anytown', state: 'CA', zipCode: '90210', type: 'home' },
      { street: '456 Oak Ave', city: 'Workville', state: 'NY', zipCode: '10001', type: 'work' }
    ]
  };

  constructor() { }

  ngOnInit(): void { }

  addAddress(): void {
    const newAddress: Address = {
      street: '',
      city: '',
      state: '',
      zipCode: '',
      type: 'other' // Default type for new address
    };
    this.person.addresses.push(newAddress);
  }

  removeAddress(index: number): void {
    this.person.addresses.splice(index, 1);
  }

}
