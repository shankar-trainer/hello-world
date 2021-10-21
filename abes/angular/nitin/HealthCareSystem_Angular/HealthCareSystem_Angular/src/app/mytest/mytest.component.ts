import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { MyTest } from './mytest';
import { MytestService } from './mytest.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-mytest',
  templateUrl: './mytest.component.html',
  styleUrls: ['./mytest.component.css']
})
export class MytestComponent implements OnInit {
  test:Observable<MyTest[]>
  constructor(private service: MytestService, private router: Router) {
    //this.test=this.service.getProductList();
   }

  ngOnInit(): void {
    this.reloadData();
  }
  reloadData(){
    this.test=this.service.getTestList();
  }

  deleteTest(id: number){
    this.service.removeTest(id).subscribe(
      data=>{
        console.log(data);
        this.reloadData();
      },
      error=>console.log(error)
    );
  }

  updateTest(id: number){
    this.router.navigate(['updateTest',id]);

  }
  goAddTest() {
    this.router.navigate(['addtest']);
  }
  goAppointments(){
    this.router.navigate(['myappointment']);
  }
}
