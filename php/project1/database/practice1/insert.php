<?php

$conn = new mysqli("localhost", "root", "", "db2");
if ($conn->connect_error) {
    die("some problem" . $conn->connect_error);
} else {
    echo "connection successful";
}
$id=10004;
$name= "surendra kunar";
$statement=$conn->prepare("insert into employee values (?,?)");
$statement->bind_param("ss",$id,$name);
$result=$statement->execute();
if ($result> 0) {
    echo "record added";
}
?>