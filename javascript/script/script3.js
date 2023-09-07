function validate(){
    var id=document.getElementById('id').value
    var name=document.getElementById('name').value
    var gender=document.getElementsByName('gender')
    
    var gender_status=false;

    for (const k of gender) {
        if(k.checked){
            gender_status=true;
        }
    }

    console.log('gender is '+gender)
    if(id=="")
     {
        document.getElementById('id_err').innerHTML='id is blank'
        //alert('id is blank')
        document.getElementById('id').style.borderColor='red'
        return false
     }
    else if(name=="")
     {
        document.getElementById('name').style.borderColor='red'
        document.getElementById('name_err').innerHTML='name is blank'
        //alert('name is blank')
        return false
     }
    else if(gender_status==false)
     {
        document.getElementById('gender_err').innerHTML='select the gender'
        //alert('select the gender')
        return false
     }
     else 
     return true 
}