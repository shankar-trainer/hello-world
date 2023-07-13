function validate() {
	var id = document.getElementById('id').value;
	var name = document.getElementById('name').value;
	var password = document.getElementById('password').value;

	if (id == "") {
		alert('id is blank')
		return false;
	}

	else if (password == "") {
		alert('password is blank')
		return false;
	}
	else if (name == "") {
		alert('name is blank')
		return false;
	}
	else {
		return true;
	}

}
