function factorial(a) {
		var fact = 1;
		if (a == 0 || a == 1)
			fact = 1;
		else {
for (var int = 1; int <= a; int++) {
				fact = fact * int;
			}
		}
		return fact;
	}
	
	