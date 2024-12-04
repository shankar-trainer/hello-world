var a = 100
var b = "100"
var c = 100

alert(a == b)
alert(a === b)// strict data type check 
alert(a === c)

var count = 1;
while (count <= 10) {
    document.write("<br>" + count);
    count++;
}

var x = parseInt(prompt("enter no for the table "))

document.write("<div style='border:solid; margin-left:200pt;color:blue;width:40%'>")
for (let index = 1; index <= 10; index++) {
    document.write("<div>" + index + " * " + x + " = " + (x * index) + "</div>")
}
document.write("</div>")
