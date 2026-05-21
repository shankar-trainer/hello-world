<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width='device-width', initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>

<body>
    <div class="container">
    <form action="shopping.php" class="container border border-primary p-5 m-5 w-50 bg-warning" style="border-radius: 30pt;" method="post">
        <div class="md-3 row">
            <label class="col-6">enter id  </label>
            <input class="col-6" name="id" class="form-control" >
        </div>

        <div class="md-3 row">
            <label class="col-6">enter name  </label>
            <input class="col-6" name="name" class="form-control">
        </div>
        <div class="md-3">
            <button type="submit" class="btn btn-success">login</button>
            <button type="reset" class="btn btn-success">cancel</button>
        </div>
    </form>
    </div>
</body>
</html>