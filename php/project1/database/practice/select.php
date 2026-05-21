<?php
include("db.php");

$result=$conn->query("select * from employee");

if($result->num_rows>0){
while($row=$result->fetch_assoc()){
    echo "\n".$row["id"]."  ".$row["name"];
}
}

?>