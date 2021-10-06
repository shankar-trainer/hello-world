function validate() {
	var id1 = document.getElementById("id").value
	var pass1 = document.getElementById("pass").value
	if (id1 == "") {
		document.getElementById("err_id").innerHTML = "id is blank"
		return false
	} else if (pass1 == "") {
		document.getElementById("err_pass").innerHTML = "password is blank"
		return false
	} else
		return true
}