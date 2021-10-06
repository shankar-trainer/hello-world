import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-home',
  templateUrl: './adminHome.component.html',
  styleUrls: ['./adminHome.component.css']
})
export class AdminHomeComponent implements OnInit {

    constructor(private router:Router){}

    ngOnInit() {
    
    }
    /*viewAll():void
    {
        this.router.navigate(['allFl']);
    }
    view():void
    {
        this.router.navigate(['search']);
    }
    add():void
    {
        this.router.navigate(['addFlight']);
    }
*/
    addScheduledFlight(): void{
        this.router.navigate(['scheduledFlight/add']);
      }
    
      viewScheduledFlight(): void{
        this.router.navigate(['scheduledFlight/show']);
      }
    
      searchScheduledFlight(): void{
          this.router.navigate(['scheduledFlight/search']);
      }
      deleteScheduledFlight():void
      {
          this.router.navigate(['scheduledFlight/delete']);
      }
}