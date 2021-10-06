import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { MyDiagnosticCentre } from './mydiagnosticcentre';
import { MydiagnosticcentreService } from './mydiagnosticcentre.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-mydiagnosticcentre',
  templateUrl: './mydiagnosticcentre.component.html',
  styleUrls: ['./mydiagnosticcentre.component.css']
})
export class MydiagnosticcentreComponent implements OnInit {
  diagnosticCentre:Observable<MyDiagnosticCentre[]>
  constructor(private service: MydiagnosticcentreService, private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }
  reloadData(){
    this.diagnosticCentre=this.service.getDiagnosticCentreList();
  }

  deleteDiagnosticCentre(id: number){
    this.service.removeDiagnosticCentre(id).subscribe(
      data=>{
        console.log(data);
        this.reloadData();
      },
      error=>console.log(error)
    );
  }

  updateDiagnosticCentre(id: number){
    this.router.navigate(['updateDiagnosticCentre',id]);

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
  goAddTest() {
    this.router.navigate(['add']);
  }
}
