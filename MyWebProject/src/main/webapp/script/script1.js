function validate(){
var id=document.getElementById('id').value
var name=document.getElementById('name').value
var pass=document.getElementById('pass').value

var gender=document.getElementsByName('gender')
var hobby=document.getElementsByName('hobby')

var gender_status=false;
var hobby_status=false;

for(var x=0;x<gender.length;x++){
   if(gender[x].checked){
     gender_status=true;
      break;
   }
}
for(var x=0;x<hobby.length;x++){
   if(hobby[x].checked){
     hobby_status=true;
      break;
   }
}
console.log('hobbies ..'+hobby_status); 
console.log('gender_status ..'+hobby_status); 

  
if(id=="")
  {
  alert("id is blank");
  return false;
  }
else if(isNaN(id))
  {
  alert("id is not a number ");
  return false;
  }
  
else if(name=="")
  {
  alert("name is blank");
  return false;
  }
else if(name.length<5)
  {
  alert("name length must of at least 5 character");
  return false;
  }
 else if (gender_status==false)
  {
  alert("select the gender")
  return false;
  } 
 else if (hobby_status==false)
  {
  alert("select the hobbies")
  return false;
  } 
  
else if(pass=="")
  {
  alert("password is blank");
  return false;
  }
  else 
  return true;
}