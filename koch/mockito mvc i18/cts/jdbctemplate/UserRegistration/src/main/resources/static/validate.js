function validate1(){
   var id=document.getElementById('id').value
   var pass=document.getElementById('pass').value
   
   if(id=="")
     {
     alert("id is blank")
     return false
     }
   else if(pass=="")
     {
     alert("password  is blank")
     return false
     }
   else{
     return true
     }
}



function validate(){
   var id=document.getElementById('id').value
   var fname=document.getElementById('fname').value
   var lname=document.getElementById('lname').value
   
   if(id=="")
     {
     alert("id is blank")
     return false
     }
 else   if(fname=="")
     {
     alert("first name  is blank")
     return false
     }
   else if(lname=="")
     {
     alert("last name is blank")
     return false
     }
     else{
     return true
     }
}
