var name = prompt('enter name', 'amit kumar');
//  var name=prompt('enter name');
var age = prompt('enter age');

alert("student data \nname is " + name + "\nage is " + age);
if (confirm("continue")) {
    alert("i m exiting ")
}
else {
    alert("i will not exit")
}

var sum=0;
for (var a=1;a<=10;a++) {
sum=sum+a;
}

document.write(`sum is ${sum}`);