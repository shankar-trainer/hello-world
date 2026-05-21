<h2>Add Student</h2>
<form method="post">
    Name:
    <input type="text" name="name" required><br><br>

    Email:
    <input type="email" name="email" required><br><br>

    <button type="submit" name="save">Save</button>
</form>
<a href="index.php?action=view">View Students</a>
<?php
if (isset($_SESSION['success'])) {
    echo "<p style='color:green'>" . $_SESSION['success'] . "</p>";
    unset($_SESSION['success']);
}

if (isset($_SESSION['error'])) {
    echo "<p style='color:red'>" . $_SESSION['error'] . "</p>";
    unset($_SESSION['error']);
}
?>