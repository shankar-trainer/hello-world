<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
      label{
         float:left;
         width:110pt;
      }
      input{
         width:100pt;
      }
      form{
        width:40%;
        margin-left:250pt;
        padding:10pt;
        background-color:lightyellow;
        border:solid 10pt blue;
        border-radius:20pt;
        height:130pt;
      }
    </style>
</head>
<body>
<form action="userAction">
<h1>User Form</h1>
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
    <button type='submit'>Send</button>
    <button type='reset'>Cancel</button>
    </div>

</form>

</body>
</html>