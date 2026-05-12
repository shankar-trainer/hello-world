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
<div class="container w-50 p-5 m-5 border border-info  bg-warning">
    <form>
    <div class="md-3 row">
        <label class="col-6">enter id</label>
        <input name="id" class="form-control col-6">
    </div>    
    
    <div class="md-3 row mt-2">
        <button type="submit" class="btn btn-primary col-4">send </button>   
        <button type="reset" class="btn btn-primary col-4 ms-2">cancel </button>   
    </div>
    </form>    
</div>    
<?php
if(isset($_GET["id"]) && !empty($_GET["id"]) && !empty($_COOKIE['id']))
{
echo "welcome again with id ".$_COOKIE['id'];
}
else if(isset($_GET["id"]) && !empty($_GET["id"])) {
    setcookie("id",$_GET["id"]);
    echo "greeting user ";
}
    
?>

</body>
</html>
