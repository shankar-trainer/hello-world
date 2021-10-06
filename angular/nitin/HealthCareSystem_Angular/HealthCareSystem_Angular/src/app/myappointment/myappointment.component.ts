import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { MyAppointment } from './myappointment';
import { MyappointmentService } from './myappointment.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-myappointment',
  templateUrl: './myappointment.component.html',
  styleUrls: ['./myappointment.component.css']
})
export class MyappointmentComponent implements OnInit {
  appointment:Observable<MyAppointment[]>
  constructor(private service: MyappointmentService, private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }
  reloadData(){
    this.appointment=this.service.getAppointmentList();
  }
  deleteAppointment(id: number){
    this.service.removeAppointment(id).subscribe(
      data=>{
        console.log(data);
        this.reloadData();
      },
      error=>console.log(error)
    );
  }

  updateAppointment(id: number){
    this.router.navigate(['updateAppointment',id]);

  }

  goHome(){
    this.router.navigate(['home']);
  }
  goCustomer(){
    this.router.navigate(['customer']);
  }
  goAddCustomer(){
    this.router.navigate(['addCustomer']);
  }
  goAddAppointment(){
    this.router.navigate(['addappointment']);
  }
  gotoList() {
    this.router.navigate(['/customer']);
  }
}
