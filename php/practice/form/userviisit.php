<?php
if (isset($_GET["id"]) && isset($_GET["name"])) {

    if (empty($_GET["id"])) {
        echo "id is empty";
        exit;
    } else if (empty($_GET["name"])) {
        echo "name is empty";
        exit;
    } 
    else if(isset($_COOKIE['id']) && isset($_COOKIE['name'])){
    echo "greeting again ".$_COOKIE["name"];
    }

    else {
        setcookie("id", $_GET["id"]);
        setcookie("name", $_GET["name"]);
        echo "wecome user ".$_COOKIE["name"];
    }
}
?>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
    <div class="container">

        <form action="<?php echo $_SERVER['PHP_SELF'] ?>" class="w-50 p-5 ms-5 mt-5 border border-primary">

            <div class="row">
                <label class="col"> enter id </label>
                <input name="id" class="col">
            </div>

            <div class="row">
                <label class="col"> enter name </label>
                <input name="name" class="col">
            </div>


            <div class="row mt-2">
                <button type="submit" class="col btn btn-primary">submit</button>
                <button type="reset" class="col btn btn-primary ms-2 ">cancel</button>
            </div>


        </form>
    </div>

</body>

</html>
<!-- 
Instead of ml-* (Margin Left), use ms-* (Margin Start).Instead of mr-* (Margin Right), use me-* (Margin End). -->