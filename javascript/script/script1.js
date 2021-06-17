a = parseInt(prompt('enter a number'))
var fact = 1;
for (var x = 1; x <= a; x++) {
    fact = fact * x;
}
alert('factorial of ' + a + ' is ' + fact)