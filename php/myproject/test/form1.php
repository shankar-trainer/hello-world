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
    <form class="border border-primary p-5 mt-5 ml-5 w-75 bg-info" method="get" action="form1result.php">
        <div class="row">
            <div class="col-4">
              enter id 
            </div>
            <div class="col-8">
               <input name="id">
            </div>
        </div>
        <div class="row mt-1">
            <div class="col-4">
              enter name
            </div>
            <div class="col-8">
               <input name="name">
            </div>
        </div>
        <div class="row mt-2">
              <div class="col-4">
                <button class="btn btn-primary">submit</button>
              </div>
              <div class="col-4">
                <button class="btn btn-primary">reset</button>
              </div>

        </div>
    </form>
    </div>
</body>
</html>