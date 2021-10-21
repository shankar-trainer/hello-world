import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AdminService } from '../admin.service';
import { Admin } from '../admin';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  admin: Observable<Admin[]>;


  admin_data: string[];
  constructor(private service: AdminService, private router: Router) {
    this.admin = service.getAdminList();
  }

  ngOnInit(): void {
    this.reloadData();
  }
  reloadData() {
    console.log('reload Data called!!')
    this.admin = this.service.getAdminList();
  }
  deleteAdmin(id: number) {
    this.service.deleteAdmin(id)
    .subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error)
    );
  }

  updateAdmin(id: number) {
    this.router.navigate(['update', id]);
  }
  detailsAdmin(id: number) {
    this.router.navigate(['details', id]);
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
  goCustomer(){
    this.router.navigate(['customer']);
  }
  goAddCustomer(){
    this.router.navigate(['addCustomer']);
  }
}
