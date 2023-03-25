/*function add(a, b) {
    return a + b;
}

function mutiply(a, b) {
    return a * b;
}

function add() {
    return 'add';
}
let result = add(10, 20);
console.log(result); // 'add'
*/
/*
The IIFE returns an object that contains the add and multiply methods that reference the add() and multiply() functions. 

*/

const calculator = (function () {
    function add(a, b) {
        return a + b;
    }

    function multiply(a, b) {
        return a * b;
    }
    return {
        add: add,
        multiply: multiply
    }
})();

function add() {
    return 'add';
}


let result = calculator.add(10, 20); // add in app.js
console.log(result); // 30
console.log(add()); // add in the app.js

