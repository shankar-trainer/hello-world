var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Product = /** @class */ (function () {
    function Product(id, name, location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    Product.prototype.show = function () {
        console.log('product information');
        console.log('\tid is ' + this.id);
        console.log('\tname is ' + this.name);
        console.log('\tlocation is ' + this.location);
    };
    return Product;
}());
var BookProduct = /** @class */ (function (_super) {
    __extends(BookProduct, _super);
    function BookProduct(id, name, location, cost1, isbn1, author1) {
        var _this = _super.call(this, id, name, location) || this;
        _this.cost = cost1;
        _this.isbn = isbn1;
        _this.author = author1;
        return _this;
    }
    BookProduct.prototype.show = function () {
        console.log("Book Product information");
        _super.prototype.show.call(this);
        console.log("\tcost " + this.cost);
        console.log("\tauthor " + this.author);
        console.log("\tisbn " + this.isbn);
    };
    return BookProduct;
}(Product));
var prd1 = new Product(10001, 'college', 'abes college');
prd1.show();
var book1 = new BookProduct(1900, 'typescript beginning', 'new delhi', 567.55, 6676766, 'p kumar');
book1.show();
