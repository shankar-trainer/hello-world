import {Component, OnInit} from '@angular/core';
// import {demo} from "../../demo/for-demo";
import {HttpService} from "../service/http.service";
import {Address} from "../../entities/address";
@Component({
  selector: 'app-address-list',
  templateUrl: './address-list.component.html',
  styleUrls: ['./address-list.component.css']
})
export class AddressListComponent implements OnInit {

  private httpService : HttpService
  private addresses : Array<Address>
  constructor(httpService: HttpService) {
    this.addresses = new Array<Address>()
    this.httpService = httpService;
  }
  ngOnInit() {
      this.httpService.readsAddresses().subscribe(
        (response : Address[]) => {
          this.addresses = response
          console.log(this.addresses) // undefined
          // console.log(this.addresses[0]._city) // work because setter method works online 21
        })
    }
    getAddresses() :Address[]  {
      return this.addresses
  }

  delete (aid : number, index : number) : void {
    if (window.confirm('Are you sure for cleaning address id ' + aid + ' ?')) { // if true
      this.httpService.deleteAddress(aid).subscribe(
        (response: any) => {
          console.log(response)
          // splice() method changes the content of an array,
          // and syntax
          // array.splice(index, howMany, [element1][, ..., elementN]);
          // index − Index at which to start changing the array.
          // howMany - An integer indicating the number of old array elements to remove. If howMany is 0, no elements are removed.
          if (response.data == false) {
            window.confirm('Can not delete. because address id ' + aid + ' have had some address')
          } else {
            this.addresses.splice(index, 1)
          }
        })
    }
  }

}
