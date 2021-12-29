function validate() {
    var id = document.empform.empid.value
    var name = document.empform.empname.value
    var gender = document.empform.gender
    var gender_status = false;
    var gender_selected

    var position = document.empform.position
    var position_status = false;
    var position_selected =new Array(5);
   
    var city = document.empform.city
    var city_status=false;
    var city_selected =new Array(6);
 
   var k=0;
    for(let x=0;x<city.length;x++){
        if (city[x].selected) {
         city_status=true;
         city_selected[k++]=city[x].value   
        }    
    }
    console.log("city length "+city.length)
    console.log("city  selected "+city.selected)

  for(let x=0;x<gender.length;x++){
    if (gender[x].checked) {
        gender_status = true;
        gender_selected = gender[x].value
        break;
    }
  }
  var y=0;
  for(let x=0;x<position.length;x++){
      console.log("position "+position[x].value)
    if (position[x].checked) {
        position_status = true;
        position_selected[y++]=position[x].value
        //break;
    }
  }

    if (id <= 0)
        alert("id cannot <=0 ")

    else if (isNaN(id))
        alert("invalid id ")
    else if (name == "")
        alert("name is empty ")
    else if (name.length < 5)
        alert("name length  cannot be less than 5 chars  ")
    else if (gender_status == false)
        alert("select the  gender")
    else if (position_status == false)
        alert("select the  position")
    else if (city_status == false)
        alert("select the  city")

    else {
        alert("id is " + id + "\nname is " + name + "\n\ngender is " + gender_selected)
        alert("you have applied for "+position_selected)
        alert("you have selected following  cities  "+city_selected)
    }
}