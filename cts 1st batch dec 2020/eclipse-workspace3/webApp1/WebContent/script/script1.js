function validate() {

	var utype = document.getElementsByName('userType')

	var ustatus = false;
	
	for (var i = 0; i < utype.length; i++) {
		if (utype[i].checked) {
			ustatus = true;
			break;
		}
	}


	if (document.getElementById('id').value == "") {
		alert("id is blank")
		return false;
	} else if (document.getElementById('password').value == "") {
		alert("password is blank")
		return false;
	}

	else if (document.getElementById('repassword').value == "") {
		alert("repassword is blank")
		return false;
	} else if (document.getElementById('repassword').value != document
			.getElementById('password').value) {
		alert("password not matching ")
		return false;
	} else if (document.getElementById('name').value == "") {
		alert("name is blank")
		return false;
	} else if (!ustatus) {
		alert("select the user Type")
		return false;
	}

	else
		return true;

}