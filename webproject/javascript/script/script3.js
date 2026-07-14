function validate() {
    var id = document.getElementById('id').value
    var name = document.getElementById('name').value
    var qualification = document.getElementsByName('qualification')

    var status_qualification=false

    for (let index = 0; index < status_qualification.length; index++) {
        if(status_qualification[index].checked)
        {
            status_qualification=true;
            break;
        }
    }

    if (id == "") {
        // document.getElementById('err_id').innerHTML = 'id is blank'
        var id_err=document.getElementById('err_id')        
        id_err.style.color='red'
        id_err.innerHTML = 'id is blank'
        return false
    }
    else if (isNaN(id)) {
        document.getElementById('err_id').innerHTML = 'id is not a number'
        return false
    }
    else  if (name == "") {
        document.getElementById('err_name').innerHTML = 'name is blank'
        
        document.getElementById('err_id').innerHTML = ''
        
        return false
    }
    else if(status_qualification==false){
        document.getElementById('err_qualification').innerHTML = 'select the qualification'
        return false;
    }
    else {
        return true;
    }
  
}