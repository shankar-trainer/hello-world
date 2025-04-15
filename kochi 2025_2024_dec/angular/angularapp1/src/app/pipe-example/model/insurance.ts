export class Insurance {
    id: number;
    name: string;
    year: number;
    startDate: string;
    maturityDate: string;
    premiumAmt: number;
   

    constructor(id: number, name: string, year: number, startDate: string, maturityDate: string, premiumAmt: number
    ) {
      this.id=id;
      this.name=name;
      this.maturityDate=maturityDate;
      this.startDate=startDate;
      this.premiumAmt=premiumAmt;
      this.year=year;
    }
}