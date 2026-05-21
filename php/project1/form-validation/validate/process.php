<?php
// Function to clean user input for security
function test_input($data) {
  $data = trim($data);            // Remove extra whitespace
  $data = stripslashes($data);    // Remove backslashes
  $data = htmlspecialchars($data);// Convert to HTML entities to prevent XSS
  return $data;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $errors = [];

    // 1. Validate Name
    if (empty($_POST["name"])) {
        $errors[] = "Name is required.";
    } else {
        $name = test_input($_POST["name"]);
        // Only allow letters and spaces
        if (!preg_match("/^[a-zA-Z-' ]*$/", $name)) {
            $errors[] = "Only letters and white space allowed in name.";
        }
    }

    // 2. Validate Email
    if (empty($_POST["email"])) {
        $errors[] = "Email is required.";
    } else {
        $email = test_input($_POST["email"]);
        // Check if email format is valid
        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $errors[] = "Invalid email format.";
        }
    }

    // Handle Results
    if (!empty($errors)) {
        echo "<h3>Errors found:</h3><ul>";
        foreach ($errors as $error) {
            echo "<li>" . $error . "</li>";
        }
        echo "</ul>";
        echo '<a href="index.php">Go back and try again</a>';
    } else {
        echo "<h2>Success!</h2>";
        echo "Welcome, " . htmlspecialchars($name) . "! Your email is " . htmlspecialchars($email);
        // You could also redirect to a success page here using header("Location: success.php");
    }
} else {
    // Redirect if someone tries to access this page directly
    header("Location: index.php");
    exit();
}
?>
