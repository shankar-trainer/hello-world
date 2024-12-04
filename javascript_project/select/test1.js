function getAllFood(){
    age=document.getElementById("age").value;
    name=document.getElementById("name").value;
    gender=document.getElementById("gender").value;
    food=document.getElementsByName("food");

    //console.log("foods .."+food[0].value);
    //console.log("foods index .."+food[0].selectedIndex);
     
    for (const element of food[0]) {
        //console.log("hi .."+element.value)
       // console.log("hi .."+element.selectedIndex)
    }

    food1=document.getElementById('food1')
    //alert(food1.selectedIndex)
    //alert(food1[selectedIndex])
    //alert(food1)

   //console.log(food1)
   //console.log("selected index "+food1.selectedIndex)
   //console.log("length "+food1.length)
   //console.log(food1[0].value)
   //console.log("selected index value "+food1[food1.selectedIndex].value)

   for (const element of food1) {
     //console.log(element)
     //console.log(element.value)
     if(element.selected)
        console.log(element.value)
    }
    //console.log(food1.options[food1.selectedIndex].value)
}