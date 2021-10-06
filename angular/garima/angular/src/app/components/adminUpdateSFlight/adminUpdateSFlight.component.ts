import { Component, OnInit } from '@angular/core';
import{ScheduleFlight} from 'src/app/ScheduleFlight';
import{ScheduledFlightService} from 'src/app/ScheduledFlighService';
import { Router } from '@angular/router';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-admin-sflight-update',
  templateUrl: './adminUpdateSFlight.component.html',
  styleUrls: ['./adminUpdateSFlight.component.css']
})
export class AdminUpdateSFlightComponent implements OnInit {

    private flights:ScheduleFlight[];
     result:ScheduleFlight=new ScheduleFlight();
     //flno:Number=this.result.flight.flightNumber;

    private flightModelBool:boolean;
    render:boolean;
    flightNumber:Number=12234;
    flightModel:String;
    carrierName:String;
    seatCapacity:number;
    SairportName:String;
    DairportName:String;

    constructor(private userService:ScheduledFlightService,private router:Router){}

    ngOnInit() {
       // console.log("flight no is "+this.flno);
       // this.result=new ScheduleFlight();
        /*this.userService.viewScheduledFlights().subscribe((flights)=>
        {
            console.log(flights);
            this.flights=flights;
            
        //.log(this.result.flight.flightNumber);
        });

        this.result=this.userService.setFlight;
        console.log("sf Service",this.userService.setFlight);
        /*this.result={
            scheduleId: this.userService.setFlight.scheduleId,
        flight:{
            flightNumber:this.userService.setFlight.flight.flightNumber,
            carrierName:this.userService.setFlight.flight.carrierName,
            flightModel:this.userService.setFlight.flight.flightModel,
            seatCapacity:this.userService.setFlight.flight.seatCapacity
        },
        availableSeats:this.userService.setFlight.availableSeats,
        schedule:{
            scheduleId:this.userService.setFlight.schedule.scheduleId,
            sourceAirport:{
                airportCode:this.userService.setFlight.schedule.sourceAirport.airportCode,
                airportName:this.userService.setFlight.schedule.sourceAirport.airportName,
                airportLocation:this.userService.setFlight.schedule.sourceAirport.airportLocation
            },
            destinationAirport:{
                airportCode:this.userService.setFlight.schedule.destinationAirport.airportCode,
                airportName:this.userService.setFlight.schedule.destinationAirport.airportName,
                airportLocation:this.userService.setFlight.schedule.destinationAirport.airportLocation
            },
            arrival:this.userService.setFlight.schedule.arrival,
            departureTime:this.userService.setFlight.schedule.departureTime
        }
        
    }
    this.flightModel=this.result.flight.flightModel;
    console.log("component",this.result);*/

    console.log("available seats are  "+this.result.availableSeats);
    console.log(" schedule id  "+this.result.scheduleId);
   

    this.result=this.userService.getter();
    console.log("...available seats are  "+this.result.availableSeats);
    console.log(" ..  schedule id  "+this.result.scheduleId);
   
    console.log("update page..."+this.result);
        


    console.log("update page"+JSON.stringify(this.result));

this.flightNumber=this.result.scheduleId;
console.log("now flight number is "+this.flightNumber);
console.log("now flight number is ..."+JSON.stringify(this.result.scheduleId));


    
    if(this.result!=null)
    {
        this.render=true;
    }

    }

    
    processForm()
  {
      console.log(this.flightNumber+""+this.flightModel+""+this.carrierName+""+this.seatCapacity+""+this.SairportName+""+this.DairportName);
    let valid:boolean;
    /*if(this.flightModel.length<7)
    {
      alert('flight model be less than 7 digits');
    }

    for(let c of this.flights){
  
  if(c.flight.flightModel == this.flightModel){
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
    console.log(this.result.flight.flightNumber);
    this.userService.modifyScheduledFlight(this.result).subscribe((data)=>
    {
        console.log(data);
       // this.result=data;
    });

    this.userService.setter(this.result);
    this.userService.viewScheduledFlights().subscribe(data=>
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

}*/
}
}