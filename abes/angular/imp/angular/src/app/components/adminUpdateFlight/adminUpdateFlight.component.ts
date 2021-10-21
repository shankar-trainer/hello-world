import { Component, OnInit } from '@angular/core';
import { Flight } from 'src/app/Flight';
import { FlightService } from 'src/app/FlightService';
import { Router } from '@angular/router';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-admin-flight-update',
  templateUrl: './adminUpdateFlight.component.html',
  styleUrls: ['./adminUpdateFlight.component.css']
})
export class AdminUpdateFlightComponent implements OnInit {

    private flights:Flight[];
     result:Flight;
     modify:Flight;
     flightModel:string;
     carrierModel:string;
    seatCapacity:number;
    private flightModelBool:boolean;

    constructor(private userService:FlightService,private router:Router){}

    ngOnInit() {
        this.userService.viewAllFlights().subscribe((flights)=>
        {
            console.log(flights);
            this.flights=flights;
        });
        this.result=this.userService.setFlight;
    }
    
    processForm()
  {
    let valid:boolean;
    /*if(this.flightModel.length<7)
    {
      alert('flight model be less than 7 digits');
    }*/

    for(let c of this.flights){
  
  if(c.flightModel == this.flightModel){
    console.log("Flight Model Already Taken");
    valid = false;
    this.flightModelBool=false;
    break;
  }
  
  else{
  valid=true;
  }
}
if(valid==true){
    console.log(this.result.flightNumber);
    this.userService.modifyFlight(this.result).subscribe((data)=>
    {
        console.log(data);
       // this.result=data;
    });

    this.userService.setFlight=this.result;
    this.userService.viewAllFlights().subscribe(data=>
        {
            console.log(data);
            this.flights=data;
        })
      console.log(this.flights );
      this.router.navigate(['viewFlight']);
}
else{
  alert("data already taken, try again");
  this.router.navigate(['search']);
}

}
}