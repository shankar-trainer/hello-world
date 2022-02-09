function form_validate() {
	var id=document.getElementById("id").value;
	var name=document.getElementById("name").value;
	var pass=document.getElementById("pass").value;
	var language=document.getElementsByName("language");
	var status=false;
	
	for(let x of language){
		 if(x.selected){
			status=true;
		 break;
		}
		
	}

	if (id == "") {
		alert("id is blank")
		return false;
	}

	else if(name == "") {
		alert("name is blank")
		return false;
	}

	else if(pass == "") {
		alert("password is blank")
		return false;
	}
	else if(status ==false) {
		alert("select one language")
		return false;
	}
	else
		return true;

}