import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthServiceService } from '../../service/auth-service.service';
import { ProfileComponent } from '../profile/profile.component';
import { UserComponent } from '../user/user.component';

@Component({
  selector: 'app-adm',
  standalone: true,
  imports: [
    ProfileComponent,
    UserComponent
  ],
  templateUrl: './adm.component.html',
  styleUrl: './adm.component.css'
})
export class AdmComponent {
  constructor(private _router: Router, private _service: AuthServiceService) {
  }

  gerente(){
    this._router.navigate(['/gerente']);
  }

  adm() {
    this._router.navigate(['/admin']);
  }

  profile(){
    this._router.navigate(['/profile']);
  }

  logout(){
    this._service.logout();
  }
}
