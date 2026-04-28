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
<h2>Student List</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Action</th>

    </tr>

    <?php while ($row = $students->fetch_assoc()) { ?>
        <tr>
            <td><?= $row['id'] ?></td>
            <td><?= $row['name'] ?></td>
            <td><?= $row['email'] ?></td>
            <td>
                <a href="index.php?action=edit&id=<?= $row['id'] ?>">Edit</a> |
                <a href="index.php?action=delete&id=<?= $row['id'] ?>"
                    onclick="return confirm('Are you sure?')">Delete</a>
            </td>

        <?php } ?>


</table>

<a href="index.php">Add New Student</a>