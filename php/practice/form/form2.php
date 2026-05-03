<?php
//echo "name is ".$_GET['name'];
//echo "<br>age is ".$_GET['age'];

if(empty($_GET['name']))
  echo "name is empty ";
else
echo "name is ".$_GET['name'];

 if(empty($_GET['age']))
  echo "age  is empty ";
else
echo "<br>age is ".$_GET['age'];

?>
//http://localhost:8080/practice/form/form2.php?name=ram%20kumar&age=10
