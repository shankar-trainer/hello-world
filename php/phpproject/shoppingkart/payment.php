<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
        <div class="container">

    <?php
    session_start();
    $product1 = '';
    $product2 = '';
    $cost1 = 0;
    $cost2 = 0;
    $total = 0;
    $id = $_SESSION["id"];
    $name = $_SESSION["name"];

    if (isset($_POST["prd1"]) && isset($_POST["prd2"]) && isset($_POST["cost1"]) && isset($_POST["cost2"])) {
        if (!empty($_POST["prd1"]) && !empty($_POST["prd2"]) && !empty($_POST["cost1"]) && !empty($_POST["cost2"])) {
            $product1 = $_POST["prd1"];
            $product2 = $_POST["prd2"];
            $cost1 = $_POST["cost1"];
            $cost2 = $_POST["cost2"];
            $total = $cost1 + $cost2;
        } else if (empty($_POST["prd1"]) || !empty($_POST["prd2"]) || !empty($_POST["cost1"]) || !empty($_POST["cost2"])) {
            echo "<div class='border border-secondary bg-danger text-warning p-5 w-50'>";
            echo "product1 or product2 is empty";
            echo "<br>cost1 or cost2 is empty";
            echo "<br><a href='shopping.php'>go back</a>";
            echo "</div>";
            exit();
        }
    }
    ?>

    <?php
    if (isset($product1) && isset($product2) && isset($cost1) && isset($cost2) && isset($total)) {
        echo "<h3> all details</h3>";
        echo "<table class='table table-striped table-hover table-bordered text-info w-75 table-warning'>";
        echo "<tr><td>id   :</td><td>$id</td></tr>";
        echo "<tr><td>name   :</td><td>$name</td></tr>";
        echo "<tr><td>product1   :</td><td>$product1</td></tr>";
        echo "<tr><td>cost   :</td><td>$cost1</td></tr>";
        echo "<tr><td>product2   :</td><td>$product2</td></tr>";
        echo "<tr><td>cost   :</td><td>$cost2</td></tr>";
        echo "<tr><td>total   :</td><td>$total</td></tr>";
        echo "</table>";
    }
    ?>
</div>

</body>

</html>