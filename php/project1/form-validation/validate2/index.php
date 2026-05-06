<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php 
session_start(); // Mandatory to use $_SESSION
if(isset($_SESSION["errors"]) && !empty( $_SESSION["errors"])) {
$errors=$_SESSION["errors"];
}
?>

<form method="post" action="form.php">
    Name: <input type="text" name="name" >
     <?php if(!empty($errors[0])) echo $errors[0] ?>
    <br>
    Email: <input type="text" name="email">
    <?php if(!empty($errors[1])) echo $errors[1] ?>
    <!-- <?=$errors[1] ?> -->
    <br>
    <button type="submit">Submit</button>
</form>
</body>
</html>

<!-- This PHP snippet is used to automatically fill an HTML input field with the value stored in the $email variable. 

It is commonly seen in "Edit Profile" forms or when a user needs to correct a form that had validation errors. 

Email: <input type="text" name="email" value="<?php echo $email; ?>"><br> -->
