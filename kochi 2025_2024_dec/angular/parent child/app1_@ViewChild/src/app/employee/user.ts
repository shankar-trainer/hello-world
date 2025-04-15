export class User {
   firstName: string;
   lastName: string;

  constructor(public fname: string, public lname: string) {
    this.firstName = fname;
    this.lastName = lname;
  }

  // set firstName(value: string) {
  //   this.firstName = "suresh";
  // }
  //
  // set lastName(value: string) {
  //   this.lastName = "kumar";
  // }
  //
  // get firstName():string {
  //   return this.firstName;
  // }
  //
  // get lastName():string {
  //   return this.lastName;
  // }
  //

}
