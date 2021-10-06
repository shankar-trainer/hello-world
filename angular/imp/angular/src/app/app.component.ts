import { Component } from '@angular/core';
import {Flight} from './Flight';
import { FlightService } from './FlightService';

@Component({
    selector: 'app',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})

export class AppComponent {
    title = 'Flight Mgmt';
    
    constructor(public userService: FlightService) { }

  ngOninit()
  {
  }
}