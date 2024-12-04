var x=10;
console.log("first   x is "+x)
{
    console.log("inside block    x is "+x)
    x=30;
    console.log("inside block    x is "+x)
}
console.log("outside  block    x is "+x)


var name="amit kumar";
{
    let name="sumit kumar"
    console.log("inside block name is "+name)
}
console.log("outside block name is "+name)
const country="india"
country="nepal"; // error 