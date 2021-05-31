var person = {
    fname: 'mohan',
    lname: "kumar",
    info: function () {
        return "hello world";
    }
};
var MyPerson = /** @class */ (function () {
    function MyPerson(fname, lname, age) {
        this.fname = 'suresh';
        this.lname = 'sarkar';
        this.age = 20;
    }
    MyPerson.prototype.info = function () {
        return "hello world...";
    };
    return MyPerson;
}());
var myp = new MyPerson('ram', 'kumar', 30);
myp.info();
console.log(myp.info());
console.log('myperson fname ' + myp.fname);
console.log('my person lname ' + myp.lname);
console.log(person.fname);
console.log(person.lname);
console.log(person.info());
