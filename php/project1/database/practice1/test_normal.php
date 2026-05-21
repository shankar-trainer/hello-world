<?php 

$conn=mysqli_connect("localhost","root","","db2");
if(!$conn){
 die("some problem");
}
else 
 echo "connection successful";

$result=mysqli_query($conn,"select * from employee");

if(mysqli_num_rows($result) > 0){
 while($row=mysqli_fetch_assoc($result)){
    echo "<br>".$row["id"]."   ".$row["name"];
 }
}
else {
    echo "no record found";
}





?>