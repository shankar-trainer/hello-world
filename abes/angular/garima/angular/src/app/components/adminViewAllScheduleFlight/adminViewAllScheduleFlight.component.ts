import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ScheduledFlightService } from 'src/app/ScheduledFlighService'
import { ScheduleFlight } from 'src/app/ScheduleFlight';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-admin-view-all-scheduled-flights',
  templateUrl: './adminViewAllScheduleFlight.component.html',
  styleUrls: ['./adminViewAllScheduleFlight.component.css']
})
export class AdminViewAllScheduledFlightsComponent implements OnInit {

  public confirmClicked: boolean = false;
  public cancelClicked: boolean = false;
   scheduleFlights: ScheduleFlight[];

  constructor(private router: Router, private service: ScheduledFlightService) { }

  ngOnInit(): void {
    this.service.viewScheduledFlights().subscribe((scheduleFlights)=>
        {
            console.log(scheduleFlights);
            this.scheduleFlights=scheduleFlights;
        });
  }

  update():void{}
  remove():void{}


}