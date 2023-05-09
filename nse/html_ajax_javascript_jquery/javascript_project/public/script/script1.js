function validate() {
  console.log('called')
  var id = document.getElementById('id').value
  var name = document.getElementById('name').value
  var age = document.getElementById('age').value
  var gender = document.getElementsByName('gender')
  var hobby = document.getElementsByName('hobby')
  var city = document.getElementById('city').value
  var email = document.getElementById('email').value

  var pos=email.indexOf('@')

  var status_gender = false;
  var status_hobbies = false;
  var status_city = false;

  //document.form.getElementById('submit').disabled=true      
  for (const key in gender) {
    if (gender[key].checked)
      status_gender = true
  }
  for (const key in hobby) {
    if (hobby[key].checked)
      status_hobbies = true
  }


  if (id == '' || id <= 0) {
    alert('id  is blank or zero')
    document.getElementById('id').style.borderColor = 'red'
    return false
  }
  else if (isNaN(id)) {
    alert('id  is not a number')
    document.getElementById('id').style.borderColor = 'red'
    return false
  }
  else if (name == '' || name.length <= 0) {
    document.getElementById('id').style.borderColor = 'black'
    alert('name  is blank ')
    return false
  }

  else if (name.length <= 10) {
    alert('name must of more than 10 character ')
    return false
  }

  else if (email=='') {
    alert('email is blank')
    return false
  }
  else if (email.length <= 10) {
    alert('email must of more than 10 character ')
    return false
  }

  else if (!email.endsWith('.com')) {
    alert('email must ends with .com ')
    return false
  }
  else if(pos<=0){
    alert('invalid email does not have @ sign ')
    return false
   }

 else if (age == '' || age <= 0) {
    alert('age  is blank or zero')
    return false
  }
  else if (isNaN(age)) {
    alert('age  is not a number')
    return false
  }
  else if (!status_gender) {
    alert('select the gender')
    return false
  }
  else if (!status_hobbies) {
    alert('select the hobbies')
    return false
  }
  else if (city == '') {
    alert('select the city')
    return false
  }

  else {
    //  document.form.getElementById('submit').disabled=false
    alert('validated')

    return true
  }
}
window.onbeforeunload = function () {
  return "";
}


