<?php

$connection=new mysqli('localhost','root','','db4');

// if(mysqli_connect_errno()){
if($connection->connect_error){
    die ("some problem in connection");
}
else {
    // echo " connection successful ";
}

?>