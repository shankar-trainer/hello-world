import { Component, OnInit } from '@angular/core';
import {ScheduleFlight} from 'src/app/ScheduleFlight';
import { ScheduledFlightService } from 'src/app/ScheduledFlighService';
import { Router } from '@angular/router';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-admin-schedule-flight-search',
  templateUrl: './adminSearchScheduleFlight.component.html',
  styleUrls: ['./adminSearchScheduledFlight.component.css']
})
export class AdminSearchScheduleFlightComponent implements OnInit {
    private flights:ScheduleFlight[];
    private result:ScheduleFlight;
    noError:Boolean = true;

    constructor(private sFService:ScheduledFlightService,private router:Router){}

    ngOnInit() {
        this.sFService.viewScheduledFlights().subscribe((flights)=>
        {
            console.log(flights);
            this.flights=flights;
        },(error)=>{
            console.log(error);
          }); 

    }
    searchFlight(FlightNumber: Number)
    {
        this.sFService.viewScheduledFlight(FlightNumber).subscribe(data=>
            {
                console.log(data);
                this.result=data;
            },(error)=>{
                this.noError=false ;
               });
            if(this.result)
            {
                this.sFService.setter(this.result);
                this.router.navigate(['scheduledFlight/show']);
            }
    }
}