import { Component, OnInit } from '@angular/core';
import{ScheduleFlight} from 'src/app/ScheduleFlight';
import {ScheduledFlightService} from 'src/app/ScheduledFlighService';
import { Router } from '@angular/router';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-admin-schedule-flight-view',
  templateUrl: './adminViewScheduleFlight.component.html',
  styleUrls: ['./adminViewScheduleFlight.component.css']
})
export class AdminViewScheduleFlightComponent implements OnInit {

    scheduleFlights: ScheduleFlight[];
   result=new ScheduleFlight();
   id:Number;

    constructor(private userService:ScheduledFlightService,private router:Router){}

    ngOnInit() {
        
        this.userService.viewScheduledFlights().subscribe((scheduleFlights)=>
        {
            console.log(scheduleFlights);
            this.scheduleFlights=scheduleFlights;
        });

        this.result=this.userService.getter();
        console.log("result from search"+JSON.stringify(this.result));
        this.id=this.result.scheduleId;
    }

    update()
    {
        this.userService.setter(this.result);
        this.userService.setId=this.result.scheduleId;
       // console.log(this.userService.setId);
        console.log(this.userService.getter());
        this.router.navigate(['scheduledFlight/update']);
    }
    remove()
    {
        console.log(this.userService.getter());
        this.userService.deleteScheduledFlight(this.userService.getter());
        this.router.navigate(['scheduledFlight/search']);
    }
}