function employee_validate() {

    var id = document.getElementById("id").value
    var name = document.getElementById("name").value
    var age = document.getElementById("age").value
    var dob = document.getElementById("dob").value
    var email = document.getElementById("email").value
    var time = document.getElementById("time").value

    var gender = document.getElementsByName("gender")
    var hobby = document.getElementsByName("hobby")
   
    var gstatus=false
    for(var x=0;x<gender.length;x++){
        if(gender[x].checked){
          gstatus=true;
        }
    }
    var hstatus=false
    for(var x=0;x<hobby.length;x++){
        if(hobby[x].checked){
          hstatus=true;
        }
    }

    if (id == '') {
        //alert('id is blank')
        document.getElementById('id_err').innerHTML='id is blank'
        document.getElementById('id').style.border = "2px solid red"
        return false
    }

    else if (name == '') {
        //alert('name is blank')
        document.getElementById('id_err').innerHTML=''
        document.getElementById('name_err').innerHTML='name is blank'
        document.getElementById('id').style.border = "1px solid black";
        document.getElementById('name').style.border = "2px solid red"
        return false
    }
    else if (name.length<5 || name.length>10) {
        document.getElementById('name_err').innerHTML='name length must of 5 - 10 chars'
        //alert('name length must of 5 - 10 chars')
         document.getElementById('name').style.border = "2px solid red"
        return false
    }
    else if (age == '') {
        //alert('age is blank')
        document.getElementById('name_err').innerHTML=''
        document.getElementById('age_err').innerHTML='age is blank'
        document.getElementById('name').style.border = "1px solid black"
        document.getElementById('age').style.border = "2px solid red";
        return false
    }
    else if (dob == '') {
        //alert('dob is blank')
        document.getElementById('age_err').innerHTML=''
        document.getElementById('date_err').innerHTML='dob is blank'
        document.getElementById('age').style.border = "1px solid black"
        document.getElementById('dob').style.border = "2px solid red";
        return false
    }

    else if (time == '') {
        //alert('login time is blank')
        document.getElementById('time').style.border = "2px solid red"
        document.getElementById('date_err').style.border = "1px solid black";
        document.getElementById('time_err').innerHTML='login time is blank'
        document.getElementById('date_err').innerHTML=''
        return false
    }
    
    else if (email == '') {
        //alert('email is blank')
        document.getElementById('time_err').innerHTML=''
        document.getElementById('time').style.border = "1px solid black"
        document.getElementById('email').style.border = "2px solid red";
        document.getElementById('email_err').innerHTML='email is blank'
        return false
    }
    else if (!email.endsWith(".com")) {
        //alert('invalid email\nmust ends with .com')
        document.getElementById('email_err').innerHTML='invalid email must ends with .com'
        document.getElementById('email').style.border = "2px solid red";
        return false
    }
    
    else if (gstatus==false) {
        //alert('select the gender')
        document.getElementById('email_err').innerHTML=''
        document.getElementById('gender_err').innerHTML='select the gender'
        document.getElementById('email').style.border = "1px solid black";
        document.getElementById('gender1').style.border = "2px solid red";
        return false
    }
    else if (hstatus==false) {
        //alert('select the hobbies')
        
        document.getElementById('gender_err').innerHTML=''
        document.getElementById('hobby_err').innerHTML='select the hobbies'
        document.getElementById('gender1').style.border = "1px solid black";
        document.getElementById('hobby_err').style.border = "2px solid red";
        return false
    }
    else {
        return true
    }


}