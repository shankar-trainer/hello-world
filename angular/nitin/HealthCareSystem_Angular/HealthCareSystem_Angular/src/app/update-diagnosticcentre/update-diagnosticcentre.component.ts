import { Component, OnInit } from '@angular/core';
import { MyDiagnosticCentre } from '../mydiagnosticcentre/mydiagnosticcentre';
import { ActivatedRoute, Router } from '@angular/router';
import { MydiagnosticcentreService } from '../mydiagnosticcentre/mydiagnosticcentre.service';

@Component({
  selector: 'app-update-diagnosticcentre',
  templateUrl: './update-diagnosticcentre.component.html',
  styleUrls: ['./update-diagnosticcentre.component.css']
})
export class UpdateDiagnosticcentreComponent implements OnInit {
  id: Number;
  diagnosticCentre: MyDiagnosticCentre;
  constructor(private route: ActivatedRoute, private service:MydiagnosticcentreService,private router:Router) { }

  ngOnInit(): void {
    this.diagnosticCentre=new MyDiagnosticCentre();
    this.id=this.route.snapshot.params['id'];

    this.service.searchDiagnosticCentre(this.id).subscribe(
      data=>{
        console.log(data)
        this.diagnosticCentre=data;
      },
      error=>console.log(error)
    );
  }
  updateDiagnosticCentre(){
    this.service.updateDiagnosticCentre(this.diagnosticCentre).subscribe(
      data=>console.log(data),
      error=>console.log(error)
    )
    this.gotoList();
  }

  onSubmit(){
    this.updateDiagnosticCentre()
  }

  gotoList(){
    this.router.navigate(['/mydiagnosticCentre'])
  }
}
