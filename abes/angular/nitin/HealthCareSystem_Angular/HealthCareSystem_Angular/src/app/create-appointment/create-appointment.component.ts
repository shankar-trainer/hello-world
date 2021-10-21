import { Component, OnInit } from '@angular/core';
import { MyAppointment } from '../myappointment/myappointment';
import { MyappointmentService } from '../myappointment/myappointment.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-appointment',
  templateUrl: './create-appointment.component.html',
  styleUrls: ['./create-appointment.component.css']
})
export class CreateAppointmentComponent implements OnInit {
  appointment: MyAppointment=new MyAppointment();
  submitted=false;
  constructor(private service: MyappointmentService, private router: Router) { }

  ngOnInit(): void {
  }
  onSubmit(){
    this.submitted=true;
    this.save();
  }
  save(){
    this.service.saveAppointment(this.appointment).subscribe(
      data=>console.log(data), error=>console.log(error));
      this.appointment=new MyAppointment();
      this.gotoList();
  }
  gotoList() {
    this.router.navigate(['/myappointment']);
  }
}
