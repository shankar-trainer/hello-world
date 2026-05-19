function validate() {
    var id = document.getElementById('id').value
    var name = document.getElementById('name').value
    var age = document.getElementById('age').value
    var gender = document.getElementsByName('gender')
    
    var hobbies = document.getElementsByName('hb')
    var g_status=false;
    var h_status=false;

    for (i in gender) {
       if(gender[i].checked)
             g_status=true;
    }
    for (i in hobbies) {
       if(hobbies[i].checked)
             h_status=true;
    }
    
    
    if (isNaN(id)) {
       // alert("id must be numeric ")
       document.getElementById('err_id').innerHTML='id must be numeric'
    }
    else if (id <= 0) {
        //alert("invalid id")
      //  document.getElementById('err_id').innerHTML='<font color="red" size="10">invalid id</font>'
        document.getElementById('err_id').innerText='<font color="red" size="10">invalid id</font>'
        return false
    }
    else if (name == "") {
        alert("name is blank")
        return false
    }
    else if (isNaN(age)) {
        alert("age must be numeric ")
    }
    else if (age <= 0) {
        alert("invalid age")
        return false
    }
    else if (g_status == false) {
        alert('select the gender')
        return false;
    }
    else if (h_status == false) {
        alert('select the hobby')
        return false;
    }
    else {
        return true
    }
}