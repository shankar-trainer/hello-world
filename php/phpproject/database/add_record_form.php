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
<form action="add_record1.php" method="post" class="container mt-4">
    <h2>Add Record</h2>
    
    <!-- Changed md-3 to mb-3 -->
    <div class="mb-3 row align-items-center">
        <div class="col-6">
            <label class="form-label mb-0">Enter Id</label>
        </div>
        <div class="col-6">
            <input type="number" name="id" class="form-control">
        </div>
    </div>

    <div class="mb-3 row align-items-center">
        <div class="col-6">
            <label class="form-label mb-0">Enter Name</label>
        </div>
        <div class="col-6">
            <input name="name" class="form-control">
        </div>
    </div>

    <div class="mb-3 row align-items-center">
        <div class="col-6">
            <label class="form-label mb-0">Enter Salary</label>
        </div>
        <div class="col-6">
            <input type="number" name="salary" class="form-control">
        </div>
    </div>

    <div class="mb-3 row align-items-center">
        <div class="col-6">
            <label class="form-label mb-0">Enter Dob</label>
        </div>
        <div class="col-6">
            <input type="date" name="dob" class="form-control">
        </div>
    </div>

    <div class="row">
        <div class="col-12 text-end">
            <button type="submit" class="btn btn-primary mt-3">Submit</button>
            <button type="reset" class="btn btn-secondary mt-3">Cancel</button>
        </div>
    </div>
</form>
</div>    

</body>
</html>