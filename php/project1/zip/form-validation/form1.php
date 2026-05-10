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
<?php
session_start(); // Starts the session to access stored errors
$id_error="";
$name_error="";
?>
    <div class="container  border border-primary p-5 mt-3 ml-3 w-75">
     <?php if (isset($_SESSION['errors'])): ?>
        <div style="color: red;">
            <ul>
            <?php foreach ($_SESSION['errors'] as $error): ?>
                    <li><?php echo htmlspecialchars($error); ?></li>
                <?php endforeach; ?>
            </ul>
        </div>
        <?php unset($_SESSION['errors']); // Clear errors after displaying ?>
    <?php endif; ?>
   

     <form action="process1.php" method="post">
        <div class="row">
            <div class="col-3">
              <label>enter id </label>
            </div>
            
            <div class="col-9">
              <input name="id"> </input>
            </div>
            <label><?=$id_error ?></label>

        </div>
        
        <div class="row mt-1">
            <div class="col-3">
              <label>enter name </label>
            </div>
            
            <div class="col-9">
              <input name="name"> </input>
            </div>
            <label><?=$name_error ?></label>

        </div>
       
        <div class="row mt-1">
            <div class="col-4">
                <button type="submit" class="btn btn-info">submit</button>
            </div>
            
            <div class="col-4">
                <button type="reset" class="btn btn-info">cancel</button>
            </div>
        </div>
     </form>
    </div>
</body>
</html>