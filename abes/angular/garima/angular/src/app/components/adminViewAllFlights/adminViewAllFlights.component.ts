import { Component, OnInit } from '@angular/core';
import { Flight } from 'src/app/Flight';
import { FlightService } from 'src/app/FlightService';
import { Router } from '@angular/router';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-admin-all-flight-view',
  templateUrl: './adminViewAllFlights.component.html',
  styleUrls: ['./adminViewAllFlights.component.css']
})
export class AdminViewAllFlightComponent implements OnInit {

     flights:Flight[];
   result:Flight;
     flightNumber:Number;
    constructor(private fService:FlightService,private router:Router){}

    ngOnInit() {
        this.fService.viewAllFlights().subscribe((flights)=>
        {
            console.log(flights);
            this.flights=flights;
        });
    }
    /*removeFlight(flightNumber: Number)
  {
    this.fService.deleteFlight(flightNumber);
    alert("deleted");
    this.router.navigate(['allFl']);
  }
  flightDetails(flightNumber:Number)
  {
    this.fService.viewFlight(this.flightNumber).subscribe((data)=>
    {
        console.log(data);
        this.result=data;
    });
    this.fService.setFlight=this.result;
    this.router.navigate(['viewFlight']);
  }
  modifyFlight(flightNumber: Number)
  {
    this.fService.viewFlight(this.flightNumber).subscribe((data)=>
    {
        console.log(data);
        this.result=data;
    });
    this.fService.setFlight=this.result;
    this.router.navigate(['updateFlight']);
  }*/
}