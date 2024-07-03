function validate(){

    var id=document.getElementById('id').value
    var name=document.getElementById('name').value

    if(id=="")
    {
        alert("id is blank")
        return false
    }
    else if(name=="")
    {
        alert("name is blank")
        return false
    }
    else {
        return true
    }
}
