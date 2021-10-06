import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin/admin';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-admin-details',
  templateUrl: './admin-details.component.html',
  styleUrls: ['./admin-details.component.css']
})
export class AdminDetailsComponent implements OnInit {
  id:number;
  usr:Admin;

  constructor(
    private route:ActivatedRoute,
    private service:AdminService,
    private router:Router) { }

  ngOnInit(): void {
    this.usr = new Admin();
    this.id=this.route.snapshot.params['id'];
 
    this.service.searchAdmin(this.id).subscribe(
      data=> {this.usr=data},
      error=> console.log(error)
    );
  }
  gotoList(){
    this.router.navigate(['admin']);
  }


  goHome(){
    this.router.navigate(['home']);
  }
  goAdmin(){
    this.router.navigate(['admin']);
  }
  goAddAdmin(){
    this.router.navigate(['addAdmin']);
  }
}
