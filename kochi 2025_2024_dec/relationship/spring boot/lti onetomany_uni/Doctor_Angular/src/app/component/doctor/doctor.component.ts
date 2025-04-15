import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Observable } from 'rxjs';
import { Doctor } from '../../model/doctor';
import { DoctorServiceService } from '../../service/doctor-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-doctor',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './doctor.component.html',
  styleUrl: './doctor.component.css'
})
export class DoctorComponent  implements OnInit{

  doctorlist:Doctor[];
  //doctorlist:Observable<Doctor[]>;
  
  constructor(private service:DoctorServiceService,private router:Router){
    this.doctorlist=[];
    //this.doctorlist= service.getAllDoctor();
     }

     
  ngOnInit(): void {
    this.service.getAllDoctor().subscribe(s=>{
      this.doctorlist=s
      console.log(JSON.stringify(this.doctorlist))
      console.log(this.doctorlist)
    })
    
   }


}
