import { Component, Input } from '@angular/core';
import { Car } from './car';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  @Input() id: number;
  @Input() name: string;
  @Input() salary: number;
  @Input() location: string;
  @Input() state: string;


  cars:Car[];

  submitted: boolean;

  constructor() {
    this.submitted = false;
    this.id = 66556;
    this.name = 'suresh kumar'
    this.salary = 45000;
    this.location = 'new delhi';
    this.state = 'delhi';

    this.cars=[
       {'carid':98899898,carmodel:'honda city','carcost':1200000},
       {'carid':98899891,carmodel:'jaguar','carcost':3000000},
       {'carid':98899892,carmodel:'maruti swift','carcost':700000},
       {'carid':98899893,carmodel:'vagon r','carcost':900000},
       {'carid':98899894,carmodel:'bolero','carcost':1600000},
       {'carid':98899895,carmodel:'scorpio','carcost':1450000},
       {'carid':98899896,carmodel:'audi','carcost':9000000},
       {'carid':98899897,carmodel:'santro','carcost':680000},
       {'carid':98899898,carmodel:'swift desire','carcost':590000}

    ]
  }

  userInfo() {
    this.submitted = true
  }


}
