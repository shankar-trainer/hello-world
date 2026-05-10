<?php
session_start(); // Mandatory to use $_SESSION

$errors = [];
$name = $email = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // 1. Basic Validation
    if (empty($_POST["name"])) {
        $errors[] = "Name is required";
    } else {
        $name = htmlspecialchars($_POST["name"]); // Sanitize input
    }

    if (empty($_POST["email"]) || !filter_var($_POST["email"], FILTER_VALIDATE_EMAIL)) {
        $errors[] = "A valid email is required";
    } else {
        $email = htmlspecialchars($_POST["email"]);
    }

    // 2. If no errors, save to session and redirect
    if (empty($errors)) {
        $_SESSION['user_data'] = [
            'name' => $name,
            'email' => $email
        ];
        header("Location: success.php");
        exit(); // Always use exit after a redirect
    }
    // else {
    // foreach ($errors as $err) {
    //     echo "<br>".$err;
    // }        
    //}
}
?>

<form method="post" action="form.php">
    Name: <input type="text" name="name" value="<?php echo $name; ?>">
     <?php if(!empty($errors[0])) echo $errors[0] ?>
    <br>
    Email: <input type="text" name="email" value="<?php echo $email; ?>">
    <?php if(!empty($errors[1])) echo $errors[1] ?>
    <!-- <?=$errors[1] ?> -->
    <br>
    <button type="submit">Submit</button>
</form>

