import { Component, OnInit, Input } from '@angular/core';
import { AdminService } from '../admin.service';
import { Admin } from '../admin/admin';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-admin',
  templateUrl: './add-admin.component.html',
  styleUrls: ['./add-admin.component.css']
})
export class AddAdminComponent implements OnInit {
  usr: Admin = new Admin();
  submitted = false;

  constructor(private service: AdminService, private router: Router) { }

  ngOnInit(): void {
  }

  newProduct(): void {
    this.submitted = false;
    this.usr = new Admin();
  }
  onSubmit() {
    console.log('on submit called')
    this.submitted = false;
    this.save();
  }

  save() {
    console.log('save called')
    this.service.addAdmin(this.usr).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
    this.usr = new Admin();
    this.gotoList();
  }

  gotoList() {
    this.router.navigate(['admin']);
  }
  goHome() {
    this.router.navigate(['home']);
  }
  goAdmin() {
    this.router.navigate(['admin']);
  }
  goAddAdmin() {
    this.router.navigate(['addAdmin']);
  }
}
