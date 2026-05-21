<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">


<div class="container">

<?php
// $id=htmlspecialchars($_GET["id"]);
// $name=htmlspecialchars($_GET["name"]);
$id=($_GET["id"]);
$name=($_GET["name"]);

print "id is $id";
print "<p>name is $name";

?>

<div class="bg-info text-light p-5 w-75">
  <p>id is <?=$id ?></p>
  <p>name is <?=$name ?></p>
</div>

</div>