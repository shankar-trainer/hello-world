import { Component, OnInit } from '@angular/core';
import { MyAppointment } from '../myappointment/myappointment';
import { ActivatedRoute, Router } from '@angular/router';
import { MyappointmentService } from '../myappointment/myappointment.service';

@Component({
  selector: 'app-update-appointment',
  templateUrl: './update-appointment.component.html',
  styleUrls: ['./update-appointment.component.css']
})
export class UpdateAppointmentComponent implements OnInit {
  id: Number;
  appointment: MyAppointment;
  constructor(private route: ActivatedRoute, private service:MyappointmentService,private router:Router) { }

  ngOnInit(): void {
    this.appointment=new MyAppointment();
    this.id=this.route.snapshot.params['id'];

    this.service.searchAppointment(this.id).subscribe(
      data=>{
        console.log(data)
        this.appointment=data;
      },
      error=>console.log(error)
    );
  }
  updateAppointment(){
    this.service.updateAppointment(this.appointment).subscribe(
      data=>console.log(data),
      error=>console.log(error)
    )
    this.gotoList();
  }

  onSubmit(){
    this.updateAppointment()
  }

  gotoList(){
    this.router.navigate(['/customer'])
  }
  goHome(){
    this.router.navigate(['customer']);
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
  goAppointments(){
    this.router.navigate(['myappointment']);
  }
}
