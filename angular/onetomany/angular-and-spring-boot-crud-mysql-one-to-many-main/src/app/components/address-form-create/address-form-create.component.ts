import {Component, NgZone} from '@angular/core';
import {Address} from "../../entities/address";
import {HttpService} from "../service/http.service";
import {Router} from "@angular/router";
@Component({
  selector: 'app-address-form-create',
  templateUrl: './address-form-create.component.html',
  styleUrls: ['./address-form-create.component.css']
})
export class AddressFormCreateComponent {
  private readonly _title = 'Create new address'
  private address : Address
  private httpService : HttpService
  // for redirect to path /lists
  private ngZone : NgZone
  private router : Router
  constructor(httpService : HttpService , ngZone : NgZone , router : Router) {
    this.address = new Address('','','');
    this.httpService = httpService;
    this.router = router
    this.ngZone = ngZone
  }
  get title(): string {
    return this._title;
  }
  public createAddress(formAddress : any) {
    this.address.country = formAddress.country
    this.address.city = formAddress.city
    this.address.details = formAddress.details
    // let eid = formAddress.eid
    if (formAddress.confirm) {
      this.httpService.createAddress(this.address,formAddress.eid).subscribe(
        (response : any) => {
          if (response.data == true) {
            // console.log("created")
            this.ngZone.run(() => {this.router.navigateByUrl('address/list')})
          }
        })
    }
  }


}
