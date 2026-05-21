<?php
session_start();

// Check if data exists in session
if (!isset($_SESSION['user_data'])) {
    header("Location: form.php"); // Redirect back if accessed directly
    exit();
}

$user = $_SESSION['user_data'];

// Optional: Clear session data after displaying so it doesn't show again on refresh
unset($_SESSION['user_data']);
?>

<h1>Form Submitted Successfully!</h1>
<p><strong>Name:</strong> <?php echo $user['name']; ?></p>
<p><strong>Email:</strong> <?php echo $user['email']; ?></p>
<a href="form.php">Back to Form</a>
