function validate(){
	 var id=document.getElementById("id")
	 var name=document.getElementById("name")
	 var age=document.getElementById("age")
	 
	 if(id.value==""){
		  //alert("id is blank")
		  document.getElementById("id_err").innerHTML="id is blank"
	      return false;
	 }
	 else if(name.value==""){
		  //alert("name is blank")
	      document.getElementById("name_err").innerHTML="name is blank"
		  return false;
	 }
	 else if(name.value.length<=10){
		  //alert("invalid name it must of at least 10 chars")
	      document.getElementById("name_err").innerHTML="invalid name must of  10 chars"
		  return false;
	 }
	 else if(age.value==""){
		  //alert("age is blank")
		  document.getElementById("age_err").innerHTML="age"
		  
	      return false;
	 }
	 else
		 return true 
}