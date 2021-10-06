import { Component, OnInit } from '@angular/core';
import { Flight } from 'src/app/Flight';
import { FlightService } from 'src/app/FlightService';
import { Router } from '@angular/router';
import { Form, FormGroupName } from '@angular/forms';

@Component({
  selector: 'app-admin-flight-add',
  templateUrl: './adminAddFlight.component.html',
  styleUrls: ['./adminAddFlight.component.css']
})
export class AdminAddFlightComponent implements OnInit {

    private flights:Flight[];
     result=new Flight();
    /*flightNumber:Number;
    flightModel:String;
    carrierName:String;
    seatCapacity:Number;*/

    constructor(private userService:FlightService,private router:Router){}

    ngOnInit() {
        this.userService.viewAllFlights().subscribe((flights)=>
        {
            console.log(flights);
            this.flights=flights;
        });
    
    }
    add( flightNumber: Number, flightModel:String, carrierName:String, seatCapacity:Number)
    {
        if(flightModel.length<7)
        {
            alert("flight Model should be atleast of 7 characters");
        }
        if(seatCapacity.valueOf()<100){
            alert("seats should be greater than 100");
        }
        else{
        this.result.flightNumber=flightNumber;
        this.result.flightModel=flightModel;
        this.result.carrierName=carrierName;
        this.result.seatCapacity=seatCapacity;
        console.log(this.result);
        this.userService.addFlight(this.result).subscribe(data=>
            {
                console.log(data);
            },(error)=>{
                console.log(error);});
        alert("flight added successfully")
        this.router.navigate(['search']);
            }
    }
}
