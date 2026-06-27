function calculator(a, b, operationCallback) {
	console.log("no1 is "+a);
	console.log("no2 is "+b);
	console.log("addition is "+operationCallback(a,b));
}

function add(x, y) {
  return x + y;
}

calculator(5, 3, add);