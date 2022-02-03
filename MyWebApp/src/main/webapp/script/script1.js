function form_validate(){
  var id=document.getElementById('id').value
  var name=document.getElementById('name').value
  var pass=document.getElementById('pass').value
  var skill=document.getElementsByName('skill')
  var gender=document.getElementsByName('gender');
  
  var gender_status=false;
  var skill_status=false;
 
    for(g of gender)
    {
     if(g.checked)
     {
     gender_status=true;
     break;
     } 
    }
 
    for(g of skill)
    {
     if(g.checked)
     {
     skill_status=true;
     break;
     } 
    }
 
 
 
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
  
 else if(gender_status==false){
  alert('select the gender')
   return false;
  }
  
 else if(skill_status==false){
  alert('select the skill set')
   return false;
  }
  
  
   return true;
   
}