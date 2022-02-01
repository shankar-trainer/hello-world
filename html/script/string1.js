var name = "ram kumar"
alert(name)
alert(name.toUpperCase())

var email = new String("lpu_ramkumar@gmail.com")

alert("email "+email+" length "+email.length)

if (email.endsWith(".com")) {
	if (email.startsWith("lpu")) {
		if (email.indexOf("@", 5) >= 5) {
			alert("valid email")
		}
		else
			alert("invalid email does not contain @ sign")
	}
	else
	alert("invalid email does not starts with lpu")
}
else
	alert("invalid email does not ends with .com")
