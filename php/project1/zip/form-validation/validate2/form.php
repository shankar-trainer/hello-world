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
     else {
        $_SESSION["errors"]=$errors;
        header("Location: index.php");
              
    }
}
?>
