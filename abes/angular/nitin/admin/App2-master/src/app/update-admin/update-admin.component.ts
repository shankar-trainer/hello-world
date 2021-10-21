import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-admin',
  templateUrl: './update-admin.component.html',
  styleUrls: ['./update-admin.component.css']
})
export class UpdateAdminComponent implements OnInit {
  id: number
  usr: Admin

  constructor(
    private route: ActivatedRoute,
    private service: AdminService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.usr = new Admin();
    this.id = this.route.snapshot.params['id'];

    this.service.searchAdmin(this.id).subscribe(
      data => {
        this.usr = data
      },
      error =>
        console.log(error)
    );
  }
  updateAdmin(){
    this.service.updateAdmin(this.usr).subscribe(
      data=> console.log(data),
      error=>console.log(error)
    )
    this.gotoList();
  }
  onSubmit(){
    this.updateAdmin()
  }
  gotoList(){
    this.router.navigate(['/admin'])
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
