  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">


<div class='container border border-success p-5 m-5 bg-info w-25'>

<?php
$name1=$_COOKIE['emp1'];
echo "user1 ".$name1;

if(isset($_COOKIE['emp2']) && !empty($_COOKIE['emp2'])){
   $name2=$_COOKIE['emp2'];
echo "<br>user2 ".$name2;
}

$name3=$_COOKIE['emp3'];

echo "<br>user3 ".$name3;

?>
</div>