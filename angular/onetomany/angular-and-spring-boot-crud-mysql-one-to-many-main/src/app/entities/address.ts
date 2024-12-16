// Many
class Address {

  _aid!:number
  _country!:string
  _city!:string
  _details!:string

  constructor(country: string, city: string, details: string) {
    this._country = country;
    this._city = city;
    this._details = details;
  }

  get aid(): number {
    return this._aid;
  }

  set aid(value: number) {
    this._aid = value;
  }

  get country(): string {
    return this._country;
  }
  set country(value: string) {
    this._country = value;
  }

  get city(): string {
    return this._city;
  }

  set city(value: string) {
    this._city = value;
  }

  get details(): string {
    return this._details;
  }

  set details(value: string) {
    this._details = value;
  }

}

export {
  Address
}
