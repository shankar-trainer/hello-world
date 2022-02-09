function customer_form_validation()
{
console.log("called");
var id=document.getElementById("id")
var name=document.getElementById("name")
var salary=document.getElementById("salary")

	if(id.value=="")
	{
	alert("id is blank")
	return false;
	}
	else if(name.value=="")
	{
	alert("name is blank")
	return false;
	}
	
	else if(salary.value=="")
	{
	alert("salary is blank")
	return false;
	}
	else if(isNaN(salary.value))
	{
	alert("salary is not a number")
	return false;
	}
	else 
	return true;
}