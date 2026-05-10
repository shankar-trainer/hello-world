<?php 

$conn=new mysqli("localhost","root","","db2");
if($conn->connect_error){
 die("some problem");
}
else 
 echo "connection successful";

$result=$conn->query("select * from employee");

if($result->num_rows > 0){
 while($row=$result->fetch_assoc()){
    echo "<br>".$row["id"]."".$row["name"];
 }

}
else {
    echo "no record found";
}





?>