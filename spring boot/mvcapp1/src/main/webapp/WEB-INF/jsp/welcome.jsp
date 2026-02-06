<html>
<head>
  <style>
     label{
       float:left;
       width:100pt;
     }
     input{
       width:110pt
     }
     form{
       border:solid blue 10pt;
       margin-left:250pt;
       padding:20pt;
       width:40%;
       height:110pt;
       border-radius:20pt;
     }
  </style>
</head>
<body>
<script>
   function validate(){
     var id=document.getElementById("id").value;
     var name=document.getElementById("name").value;
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
</script>
<form action="uaction" onsubmit="return validate()">
    <div>
    <label>Enter Id</label>
    <input name="id" id="id">
    </div>

    <div>
    <label>Enter Name</label>
    <input name="name" id="name">
    </div>

    <div>
    <input type="submit">
    <input type="reset">
    </div>

  </form>

</body>
</html>