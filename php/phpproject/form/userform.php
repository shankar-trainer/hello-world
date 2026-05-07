<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<?php
session_start();


$id_err1 = '';
$name_err1 = '';

if (isset($_SESSION['id_err'])) {
    if (!empty($_SESSION['id_err'])) {
        $id_err1 = $_SESSION['id_err'];
    }
}
if (isset($_SESSION['name_err'])) {
    if (!empty($_SESSION['name_err'])) {
        $name_err1 = $_SESSION['name_err'];
    }
}

?>

<body>
    <form action="userprocess.php" class="container border border-primary p-5 m-5 w-50 bg-success text-light"
        method="post">
        <div class="form-group row">
            <label class="col-6">Enter Id</label>
            <input name="id" class="form-control class=" col-6">
            <?= $id_err1 ?>
        </div>
        <div class="form-group row">
            <label class="col-6">Enter Name</label>
            <input name="name" class="form-control col-6">
            <?= $name_err1 ?>
        </div>
        <div class="form-group row mt-2">
            <button type="submit" class="col-4 btn btn-primary ">submit</button>
            <button type="reset" class="col-4 btn btn-primary ms-2">reset</button>
        </div>
    </form>
</body>

</html>