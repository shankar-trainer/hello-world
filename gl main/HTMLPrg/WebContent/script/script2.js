var name = prompt("enter name")
var roll = prompt("enter roll")
var marks1 = parseFloat(prompt("enter marks1"))
var marks2 = parseFloat(prompt("enter marks2"))

var total = marks1 + marks2
var avg = total / 2;

alert("name is " + name + "\nroll is " + roll + "\nmarks1 " + marks1
		+ "\nmarks2" + marks2)

var grade = "";

if (avg >= 75 && avg <= 100)
	grade = "distinction"
else if (avg >= 60)
	grade = "first"
else if (avg >= 50)
	grade = "second"
else if (avg >= 35)
	grade = "third"
else
	grade = "fail"

alert("total is " + total + "\naverage is " + avg+"\ngrade is "+grade)
