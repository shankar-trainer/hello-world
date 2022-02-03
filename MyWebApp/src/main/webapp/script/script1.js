function form_validate(){
  var id=document.getElementById('id').value
  var name=document.getElementById('name').value
  var pass=document.getElementById('pass').value
  if(id==''){
  alert('id is blank')
   return false;
  }
  else if(pass==''){
  alert('password is blank')
   return false;
  }
 else if(name==''){
  alert('name is blank')
   return false;
  }
   return true;
   
}