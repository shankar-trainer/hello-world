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
<div class="container w-75 border border-primary p-5 m-5">
<form action="add_record1.php" method="post">
<h2>Add Record</h2>
    <div class="md-3 row">
        <label class="col-6">Enter Id</label>
        <input type="number" name="id" class="form-control col-6">
    </div>
    <div class="md-3 row">
        <label class="col-6">Enter Name</label>
        <input  name="name" class="form-control col-6">
    </div>
    <div class="md-3 row">
        <label class="col-6">Enter Salary</label>
        <input type="number" name="salary" class="form-control col-6">
    </div>
    <div class="md-3 row">
        <label class="col-6">Enter Dob</label>
        <input type="date" name="dob" class="form-control col-6" >
    </div>
    <div>
        <div>
            <button type="submit" class="btn btn-secondary mt-3">submit</button>
            <button type="reset" class="btn btn-secondary mt-3">cancel</button>
        </div>
    </div>

</form>
</div>    

</body>
</html>