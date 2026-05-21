<?php
session_start();
$errors = [];

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // 1. Validate Username
    if (empty($_POST["id"])) {
        $errors[] = "id is required.";
        echo"<script>window.alert('id is blank')</script>";
    }

    // 2. Validate Email
    if (empty($_POST["name"])) {
        $errors[] = "name is required.";
    } 
    // elseif (!filter_var($_POST["email"], FILTER_VALIDATE_EMAIL)) {
    //     $errors[] = "Invalid email format.";
    // }

    // 3. Check for errors
    if (!empty($errors)) {
        $_SESSION['errors'] = $errors;
        echo"<script>window.alert('go to form')</script>";
        // header("Location: form.php"); // Redirect back to form
        header("Location: form1.php"); // Redirect back to form
        exit();
    } else {
        // Success: Process data (e.g., save to database)
        echo "Form submitted successfully!";
        echo "<br>id is ". $_POST['id'];
        echo "<br>name is ". $_POST['name'];
    }
}
?>
