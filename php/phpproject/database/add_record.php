<?php

include("db.php");
mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);
try{
$stmt= $connection->prepare("insert into employee value(?,?,?,?)");
$stmt->bind_param("ssss", $id,$name,$salary,$dob);
$id=2;
$name='virendra kumar';
$salary=10000;
$dob='2000-10-10';

if($stmt->execute()){
    echo "<br>record added";
}
else{
 echo "some problem";
}
}
catch(mysqli_sql_exception $e){
    // echo "". $e->getMessage() ."".$e->getCode();
    if($e->getCode() == "1062"){
    echo "<br>duplicate id error ";
    }
}
?>