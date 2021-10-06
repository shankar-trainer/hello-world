import { Component, OnInit } from '@angular/core';
import { MyDiagnosticCentre } from '../mydiagnosticcentre/mydiagnosticcentre';
import { MydiagnosticcentreService } from '../mydiagnosticcentre/mydiagnosticcentre.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-diagnosticcentre',
  templateUrl: './create-diagnosticcentre.component.html',
  styleUrls: ['./create-diagnosticcentre.component.css']
})
export class CreateDiagnosticcentreComponent implements OnInit {
  diagnosticCentre: MyDiagnosticCentre=new MyDiagnosticCentre();
  submitted=false;
  constructor(private service: MydiagnosticcentreService, private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.submitted=true;
    this.save();
  }
  save(){
    this.service.saveDiagnosticCentre(this.diagnosticCentre).subscribe(
      data=>console.log(data), error=>console.log(error));
      this.diagnosticCentre=new MyDiagnosticCentre();
      this.gotoList();
  }
  gotoList() {
    this.router.navigate(['/mydiagnosticCentre']);
  }
}
