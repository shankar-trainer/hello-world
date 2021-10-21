function validation() {
	var id1 = document.getElementById('id').value
	var pass1 = document.getElementById('pass').value
	var name1 = document.getElementById('name').value

	if (id1 == "") {
		alert("id is blank")
		return false
	} else if (!id1.match(/[0-9]{10}/)) {
		alert("id is not numeric or not of 10 numbers")
		return false
	} else if (pass1 == "") {
		alert("password is blank")
		return false
	} else if (!pass1.match(/\w{10}/)) {
		alert("password is not of 10 char or it contains special char")
		return false
	}
	else if (name1 == "") {
		alert("name is blank")
		return false
	} 
/*	else if (!name1.match(/([a-z]|[A-Z]+)\s([a-z]|[A-Z]+)/)) {*/

	else if (!name1.match(/([a-z]|[A-Z]+)\s([a-z]|[A-Z]+)/)) {
		alert("name is not  fname lname pattern")
		return false
	}
	else
		return true
}


