var emp_name = 'mohan kumar';
var product = ["location", "chennai"];
console.log('name is ' + emp_name);
console.log("name is " + emp_name);
console.log('product information');
console.log(product[0] + "   " + product[1]);
var country = "india";
console.log('country is ' + country);
var emp_data = [
    { eid: 10001, ename: 'ram kumar' },
    { eid: 10002, ename: 'aman kumar' },
    { eid: 10003, ename: 'suresh kumar' },
    { eid: 10004, ename: 'anil kumar' }
];
for (var x = 0; x < 4; x++) {
    {
        console.log(emp_data[x]);
    }
}
for (var x = 0; x < 4; x++) {
    console.log(emp_data[x].eid + "  " + emp_data[x].ename);
}
