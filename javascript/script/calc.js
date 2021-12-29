function addition(){
    var x=document.calcform.n1.value
    var y=document.calcform.n2.value
    console.log("no1 is "+x)
    console.log("no2 is "+y)

      if(x=="")
      alert("no1 is blank")
     
     else  if(isNaN(x))
      alert("no1 is invalid no ")
     
      else if(y=="")
      alert("no2 is blank")
     
      else  if(isNaN(y))
      alert("no2 is invalid no ")
      else{
    var a=parseFloat(x)
    var b=parseFloat(y)
    document.calcform.n3.value=a+b
  }
}
  function  subtraction(){
    var x=document.calcform.n1.value
    var y=document.calcform.n2.value

      if(x=="")
      alert("no1 is blank")
     
     else  if(isNaN(x))
      alert("no1 is invalid no ")
     
      else if(y=="")
      alert("no2 is blank")
     
      else  if(isNaN(y))
      alert("no2 is invalid no ")
      else{
    var a=parseFloat(x)
    var b=parseFloat(y)
    document.calcform.n4.value=a-b
      }
  }