<h2>Edit Student</h2>

<form method="post" action="index.php?action=update">

    <input type="hidden" name="id" value="<?= $student['id'] ?>">

    Name:
    <input type="text" name="name"
           value="<?= $student['name'] ?>" required><br><br>

    Email:
    <input type="email" name="email"
           value="<?= $student['email'] ?>" required><br><br>

    <button type="submit" name="update">Update</button>

</form>

<a href="index.php?action=view">Back</a>
