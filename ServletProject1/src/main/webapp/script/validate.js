var validate = function() {
	var id = document.getElementById('id').value;
	var name = document.getElementById('name').value;
	if (id <= 0) {
		alert('invalid id\nid is -ve or zero');
		return false;
	}

	else if (isNaN(id)) {
		alert('id is not a number ');
		return false;
	}

	else if (name == "") {
		alert('name is blank ');
		return false;
	}
	else if (name.length < 5 || name.length > 15) {
		alert('name length must of 5 - 15 chars ');
		return false;
	}
	else
		return true;
}