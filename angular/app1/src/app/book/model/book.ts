export class BookModel {
     isbn: number=0;
     bname: string='';
     cost: number=0;

    constructor(isbn: number, bname: string, cost: number) {
        this.isbn = isbn;
        this.bname = bname;
        this.cost = cost;
    }
}
