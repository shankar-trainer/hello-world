<html>
<head>
<style>
  form{
    border:solid blue;
    padding:30px;
    width:30%;
    margin-left:300pt;
    margin-top:40pt;
  }
  label{
   width:100pt;
   float:left;
  }
  input{
   width:110pt;
   margin-bottom:5pt;
  }
  input[type='submit']{
     width:90pt;
     margin-right:10pt;
  }
  input[type='reset']{
     width:90pt;
  }

</style>
</head>
<body>
<form action="userAction">
<h1>User Page</h1>
 <div>
 <label>Enter Id</label>
 <input name="id">
 </div>

 <div>
 <label>Enter Name</label>
 <input name="name">
 </div>

 <div>
 <label>Enter Salary</label>
 <input name="salary">
 </div>

 <div>
 <input type="submit">
 <input type="reset">
 </div>

</form>

</body>
</html>