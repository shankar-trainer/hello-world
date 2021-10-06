import { Component, OnInit } from '@angular/core';
import { Flight } from 'src/app/Flight';
import { FlightService } from 'src/app/FlightService';
import { Router } from '@angular/router';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-admin-flight-view',
  templateUrl: './adminViewFlight.component.html',
  styleUrls: ['./adminViewFlight.component.css']
})
export class AdminViewFlightComponent implements OnInit {

    private flights:Flight[];
    result:Flight;

    constructor(private userService:FlightService,private router:Router){}

    ngOnInit() {
        this.userService.viewAllFlights().subscribe((flights)=>
        {
            console.log(flights);
            this.flights=flights;
        });

        this.result=this.userService.setFlight;
    }

    update()
    {
        this.userService.setFlight=this.result;
        this.router.navigate(['updateFlight']);
    }
    remove()
    {
        this.userService.deleteFlight(this.result.flightNumber).subscribe();
        this.router.navigate(['search']);
    }
    list()
    {
        this.router.navigate(['allFl']);
    }
}