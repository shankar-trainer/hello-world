import { Component, OnInit } from '@angular/core';
import {ScheduleFlight} from 'src/app/ScheduleFlight';
import { ScheduledFlightService } from 'src/app/ScheduledFlighService';
import { Router } from '@angular/router';
import { error } from '@angular/compiler/src/util';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
//import { DatePipe } from '@angular/common';
import { FlightService } from 'src/app/FlightService';
import { Flight } from 'src/app/Flight';
import { Schedule } from 'src/app/Schedule';
import { Form, FormGroupName } from '@angular/forms';

@Component({
  selector: 'app-admin-flight-add',
  templateUrl: './adminScheduledFlight.component.html',
  styleUrls: ['./adminScheduledFlight.component.css']
})
export class AdminAddScheduledFlightComponent implements OnInit {
    result=new ScheduleFlight();
    result1=new Flight();
    schedule=new Schedule();
    noError:boolean=true;
    noError1:boolean=true;
    flightForm:FormGroup;
    scheduledFlight: ScheduleFlight;

    flightNumber:Number;
    scheduleId:number;
    departure:Date;
    arrival:Date;

    constructor(private sFService:ScheduledFlightService,private fService:FlightService,private router:Router,private fb: FormBuilder){}

    ngOnInit() {
       /* this.flightForm = this.fb.group({
            email: ['', [Validators.required, Validators.email]],
            mobileNo: ['', [Validators.required, Validators.pattern("[0-9]*"), Validators.minLength(10), Validators.maxLength(10)]],
            username: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(10)]],
            password: ['', [Validators.required, Validators.minLength(8), Validators.maxLength(20)]]
      
          });*/
    }
   /* add(fNumber:Number,fModel:String,cName:String,sCap:Number,srcAir:String,destAir:String,departure:Date,arrival:Date){
        this.result.flight.flightNumber=fNumber
        this.result.flight.flightModel=fModel;
        this.result.flight.carrierName=cName;
        this.result.flight.seatCapacity=sCap;
        this.result.schedule.scheduleId=7;
        this.result.availableSeats=500;
        this.result.schedule.sourceAirport.airportCode=srcAir;
        this.result.schedule.destinationAirport.airportCode=destAir;
        this.result.schedule.departureTime=departure;
        this.result.schedule.arrival=arrival;
        this.sFService.addscheduledFlight(this.result); 
        alert("Schedule Flight added");

       
    }
*/

/*add(flightNumber:Number,scheduleId:number)
{
        /*this.result.flight.flightNumber=this.flightNumber;
        this.result.flight.flightModel=this.FlightModel;
        this.result.flight.carrierName=this.CarrierName;
        this.result.flight.seatCapacity=this.SeatCapacity;
        this.result.schedule.scheduleId=7;
        this.result.availableSeats=500;
        this.result.schedule.sourceAirport.airportCode=this.srcAirport;
        this.result.schedule.destinationAirport.airportCode=this.destAirport;


        this.fService.viewFlight(flightNumber).subscribe(data=>
          {
              console.log(data);
              this.result1=data;
          },(error)=>{
             this.noError=false ;
            });

        this.sFService.getSchedule(scheduleId).subscribe(data=>
          {
            console.log(data);
            this.schedule=data;
          },(error)=>{
            this.noError1=false;
          })

        //let dateConvert1 = this.datepipe.transform(dept,"dd-MM-yyyy");
        //let dateConvert2 = this.datepipe.transform(arrival,"dd-MM-yyyy");
    console.log(flightNumber+" "+scheduleId+" ");
    console.log(this.result);
    this.result.flight.flightNumber=flightNumber;
    this.result.flight.flightModel=this.result1.flightModel;
    this.result.flight.carrierName=this.result1.carrierName;
    this.result.flight.seatCapacity=this.result1.seatCapacity;
    this.result.schedule.scheduleId=scheduleId;
    this.result.schedule.sourceAirport=this.schedule.sourceAirport;
    this.result.schedule.destinationAirport=this.schedule.destinationAirport;
    this.result.schedule.departureTime=this.schedule.departureTime;
    this.result.schedule.arrival=this.schedule.arrival;
    console.log(this.result);

    /*this.sFService.addscheduledFlight(this.result).subscribe((scheduledFlight)=>{
        this.scheduledFlight = scheduledFlight;
       // console.log(this.scheduledFlightList);
    this.router.navigate(['/searchFlight']);*/

        /*this.sFService.addscheduledFlight(this.result).subscribe(data=>{
          console.log(data);
            },(error)=>{
                console.log(error);});
        alert("Schedule Flight added");
        this.router.navigate(['scheduledFlight/search']);
}*/

processForm()
{

  console.log(this.flightNumber,this.scheduleId,this.departure,this.arrival);
  this.fService.viewFlight(this.flightNumber).subscribe(data=>
    {
        console.log(data);
        this.result1=data;
    },(error)=>{
       this.noError=false ;
      });

  this.sFService.getSchedule(this.scheduleId).subscribe(data=>
    {
      console.log(data);
      this.schedule=data;
    },(error)=>{
      this.noError1=false;
    });

    console.log(this.result1);
    console.log(this.schedule);

    this.result.flight.flightNumber=this.flightNumber;
    this.result.flight.flightModel=this.result1.flightModel;
    this.result.flight.carrierName=this.result1.carrierName;
    this.result.flight.seatCapacity=this.result1.seatCapacity;
    this.result.schedule.scheduleId=this.scheduleId;
    this.result.schedule.sourceAirport=this.schedule.sourceAirport;
    this.result.schedule.destinationAirport=this.schedule.destinationAirport;
    this.result.schedule.departureTime=this.schedule.departureTime;
    this.result.schedule.arrival=this.schedule.arrival;

    console.log(this.result);
}
}