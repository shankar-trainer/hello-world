<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Document</title>
</head>
<body>
<form action="LoginController" method="post">
    <div>
        <label>enter id</label>
        <input name="id">
    </div>

    <div>
        <label>enter password</label>
        <input name="pass" type="password">
    </div>

    <div>
        <label>select user type</label>
        <p>
        <input name="type" type="radio" value="normal-user">Normal User
        <input name="type" type="radio" value="special-user">Special User
        <p></p>
    </div>

    <input type="submit">
    <input type="reset">

</form>


</body>
</html>