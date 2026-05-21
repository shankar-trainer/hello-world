<?php
// Initialize variables and error messages
$nameErr = $emailErr = "";
$name = $email = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Basic validation
    if (empty($_POST["name"])) {
        $nameErr = "Name is required";
    } else {
        $name = htmlspecialchars($_POST["name"]); // Sanitization
    }

    if (empty($_POST["email"])) {
        $emailErr = "Email is required";
    } else {
        $email = htmlspecialchars($_POST["email"]); // Sanitization
        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $emailErr = "Invalid email format";
        }
    }
}
?>

<!-- <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>"> -->
<!-- <form method="post" action="<?=$_SERVER["PHP_SELF"] ?>"> -->
<!-- <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST"> -->

<form method="post">

  Name: <input type="text" name="name" value="<?php echo $name;?>">
  <span style="color:red">* <?php echo $nameErr;?></span><br><br>
  
  E-mail: <input type="text" name="email" value="<?php echo $email;?>">
  <span style="color:red">* <?php echo $emailErr;?></span><br><br>
  
  <input type="submit" name="submit" value="Submit">
</form>
