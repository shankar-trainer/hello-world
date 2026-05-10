<?php

// Enable mysqli to throw exceptions
mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);


$conn = new mysqli("localhost", "root", "", "db2");
if ($conn->connect_error) {
    die("some problem" . $conn->connect_error);
} else {
    echo "connection successful";
}

$id=10004;
$name= "surendra kunar";
try{
$statement=$conn->prepare("insert into employee values (?,?)");
$statement->bind_param("ss",$id,$name);
$result=$statement->execute();
if ($result> 0) {
    echo "record added";
}
}
catch(mysqli_sql_exception $e){
    // echo "". $e->getMessage() ."";
    if($e->getCode()== 1062){
    echo "<p>record already exists";
    }
    else {
        throw $e;
    }

}
?>