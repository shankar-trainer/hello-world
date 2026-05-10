<?php
include("db.php");
$id=9001;
$name="amit kumar";

//  $statement=$conn->query("insert into employee values(10008,'suresh kumar')");
 $statement=$conn->prepare("insert into employee values(?,?)");

//  $statement->bind_param("s",$id);
//  $statement->bind_param("s",$name);
 $statement->bind_param("ss",$id,$name);
$statement->execute();

echo "record added";
 
?>