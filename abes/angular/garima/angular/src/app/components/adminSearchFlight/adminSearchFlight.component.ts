import { Component, OnInit } from '@angular/core';
import { Flight } from 'src/app/Flight';
import { FlightService } from 'src/app/FlightService';
import { Router } from '@angular/router';
import { error } from '@angular/compiler/src/util';
import{FormGroup,FormControl,FormBuilder,Validators} from '@angular/forms';

@Component({
  selector: 'app-admin-flight-search',
  templateUrl: './adminSearchFlight.component.html',
  styleUrls: ['./adminSearchFlight.component.css']
})
export class AdminSearchFlightComponent implements OnInit {

    private flights:Flight[];
    private result:Flight;
    private searchText:Number;
    noError:Boolean = true;

    constructor(private userService:FlightService,private router:Router,private formBuilder:FormBuilder){}

    ngOnInit() {
        this.userService.viewAllFlights().subscribe((flights)=>
        {
            console.log(flights);
            this.flights=flights;
        },(error)=>{
            console.log(error);
          });    
    
    }


    searchFlight(fNumber:Number)
    {
        this.userService.viewFlight(fNumber).subscribe(data=>
            {
                console.log(data);
                this.result=data;
            },(error)=>{
               this.noError=false ;
              });    
          
            if(this.result)
            {
                this.userService.setFlight=this.result;
                this.router.navigate(['viewFlight']);
            }
            /*else{
                alert("given flight number does not exist");
                this.router.navigate(['search']);
            }*/


    }
}