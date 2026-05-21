<!DOCTYPE html>
<html>
<head>
    <title>PHP Two-Page Validation</title>
</head>
<body>
    <h2>User Registration</h2>
    <!-- Points to the processing file -->
    <form action="process.php" method="POST">
        <!-- Name: <input type="text" name="name" required><br><br> -->
        Name: <input type="text" name="name"><br><br>
        <!-- Email: <input type="email" name="email" required><br><br> -->
        Email: <input type="email" name="email"><br><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
