import { Component } from '@angular/core';
import { Address } from './address';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-employee',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {
   id:number;
   name:string;
   salary:number;
   address:Address[];

   constructor(){
    this.id=98989898;
    this.name='ram kumar';
    this.salary=56000;
    this.address=[
      {'addr_id':100001, 'addr_location':'alpha','addr_city':'gr noida'},
      {'addr_id':100003, 'addr_location':'beta','addr_city':'gr noida'},
      {'addr_id':100002, 'addr_location':'ganesh nagar','addr_city':'new delhi'},
      {'addr_id':1000010, 'addr_location':'pandav nagar','addr_city':'new delhi'},
      {'addr_id':100007, 'addr_location':'barsane','addr_city':'mathura'}
    ]
   }
   

}
