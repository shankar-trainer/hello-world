import {Address} from "./address";

// One
class Employee {

  _eid! : number
  _fullname! : string
  _age! : number
  _position! : string
  _salary! : number
  _addresses! : Address[] | null

  constructor(fullname: string | '', age: number | 0  , position: string | '', salary: number | 0, addresses: Address[] | null ) {
    this._fullname = fullname;
    this._age = age;
    this._position = position;
    this._salary = salary;
    this._addresses = addresses;
  }

  get eid(): number {
    return this._eid;
  }

  set eid(value: number) {
    this._eid = value;
  }

  get fullname(): string {
    return this._fullname;
  }

  set fullname(value: string) {
    this._fullname = value;
  }

  get age(): number {
    return this._age;
  }

  set age(value: number) {
    this._age = value;
  }

  get position(): string {
    return this._position;
  }

  set position(value: string) {
    this._position = value;
  }

  get salary(): number {
    return this._salary;
  }

  set salary(value: number) {
    this._salary = value;
  }

  get addresses(): Address[] | null {
    return this._addresses;
  }

  set addresses(value: Address[] | null) {
    this._addresses = value;
  }

}


export {
  Employee
}
