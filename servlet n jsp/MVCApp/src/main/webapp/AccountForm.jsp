<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="AccountController">
 <div>
  <label>Enter Id</label>
  <input type="number" name="id">
 </div>
 <div>
  <label>Enter Name</label>
  <input type="text" name="name">
 </div>

 <div>
  <label>Enter Balance</label>
  <input type="number" name="balance">
 </div>

 <div>
  <label>Select Account Type </label>
  <div><input type="radio" name="actType" value='saving'> Saving Account</div>
  <div><input type="radio" name="actType" value='current'>Current Account</div>
  <div><input type="radio" name="actType" value='demat'> Demat Account</div>
 </div>

<div>
 <input type='submit'>
 <input type='reset'>
</div>

</form>
</body>
</html>

