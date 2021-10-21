class Product {
    id: number;
    name: string;
    location: string;

    constructor(id: number, name: string, location: string) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    show() {
        console.log('product information');
        console.log('\tid is ' + this.id);
        console.log('\tname is ' + this.name);
        console.log('\tlocation is ' + this.location);
    }
}

class BookProduct extends Product {
    cost: number;
    isbn: number;
    author: string;
    constructor
(id: number, name: string, location: string,cost1: number,isbn1: number,author1: string) {
    super(id,name,location);
    this.cost=cost1;
    this.isbn=isbn1;
    this.author=author1;     
}
show(){
    console.log("Book Product information");
    super.show();
    console.log("\tcost "+this.cost);
    console.log("\tauthor "+this.author);
    console.log("\tisbn "+this.isbn);
}
}

var prd1 = new Product(10001, 'college', 'abes college');
prd1.show();

var book1=new BookProduct
(1900,'typescript beginning','new delhi',567.55,6676766,'p kumar');
book1.show();
