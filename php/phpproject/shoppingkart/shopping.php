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
$id = 0;
$name = '';
if (isset($_POST["id"]) && isset($_POST["name"])) {
    if (!empty($_POST["id"]) && !empty($_POST["name"])) {
        $id = $_POST["id"];
        $name = $_POST["name"];
    }
}
?>
<body>
    <div class="container">
        <form action="payment.php" class="container border border-primary p-5 m-5 w-50 bg-warning" style="border-radius: 30pt;" method="post">

            <?php
            if (isset($id) && isset($name)) {
                if (!empty($id) && !empty($name)) {
                    echo "welcome user <b>" . $name . "</b>";
                    echo "<br>id is  <b><i>" . $id . "</b></i>";
                    session_start();
                    $_SESSION["id"] = $id;
                    $_SESSION["name"] = $name;
                } else if (empty($id) || empty($name)) {
                    echo "id or name is empty";
                    echo "<p><a href='index.php'>login</a>";
                }
            }

            ?>

            <h2>Purchase Product</h2>

            <div class="md-3 row mt-3">
                <label class="col-6">product1 name </label>
                <input class="col-6" name="prd1" class="form-control">
            </div>

            <div class="md-3 row mt-2">
                <label class="col-6">product2 name </label>
                <input class="col-6" name="prd2" class="form-control">
            </div>

            <div class="md-3 row mt-3">
                <label class="col-6">product1 cost </label>
                <input class="col-6" name="cost1" class="form-control" type="number">
            </div>

            <div class="md-3 row mt-2">
                <label class="col-6">product2 cost </label>
                <input class="col-6" name="cost2" class="form-control" type="number">
            </div>

            <div class="md-3 mt-2">
                <button type="submit" class="btn btn-success">purchase</button>
                <button type="cancel" class="btn btn-success">cancel</button>
            </div>
        </form>
    </div>
</body>

</html>