<style>
    table,td,th{
        border:solid;
        margin-left: 200pt;
        padding: 30pt;
        background-color: aqua;
    }
    </style>
<?php

// $connection=new mysqli('localhost','root','','db4');
// // if(mysqli_connect_errno()){
// if($connection->connect_error){
//     die ("some problem in connection");
// }
// else {
//     echo " connection successful ";
// }
include("db.php");
$result=$connection->query("select * from employee");

// while($row=$result->fetch_assoc()) {
//  echo "<br>".$row["id"]."  ".$row["name"]."  ".$row["salary"]." ".$row["dob"];
// }
?>

<table>

    <tr><th>id</th><th>name</th><th>salary</th><th>dob</th></tr>
<?php
while($row=$result->fetch_assoc()) {
?>
<tr>
    <td><?=$row["id"]  ?></td>
    <td><?=$row["name"]  ?></td>
    <td><?=$row["salary"]  ?></td>
    <td><?=$row["dob"]  ?></td>
</tr>
<?php }
 ?>
</table>
<?php 
 echo "Total number of rows are ".$result->num_rows."";
 $result->free();
?>