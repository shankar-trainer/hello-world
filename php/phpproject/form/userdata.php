  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

<?php 
session_start();

$id1=$_SESSION['id'];
$name1=$_SESSION['name'];

// echo "id is ".$id1;
// echo "<br>name is ".$name1;

?>
<div class='container border border-success p-5 m-5 bg-info w-25'>
  <div>id is <?=$id1 ?>  </div>
  <div>name is <?=$name1 ?>  </div>
</div>    