import { Component, OnInit, Input } from '@angular/core';
import { AdminService } from '../admin.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Admin } from '../admin';
import { Router } from '@angular/router';


@Component({
  selector: 'app-add-admin',
  templateUrl: './add-admin.component.html',
  styleUrls: ['./add-admin.component.css']
})
export class AddAdminComponent implements OnInit {
  usr:Admin=new Admin();
  
  submitted=false;

  constructor(private service:AdminService,private router:Router) { }

  ngOnInit(): void {
  }
   
  newProduct():void{
    this.submitted=false;
    this.usr=new Admin();
  }
  onSubmit(){
    console.log('on submit called')
    this.submitted=true;
    this.save();
  }

  save(){
    console.log('save called'+this.usr.adminName+this.usr.adminPassword)
    this.service.addAdmin(this.usr).subscribe(
      data=>console.log('data is '+data),
      error=>console.log('error is '+error)
      );
      this.usr=new Admin();
      this.gotoList();
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
