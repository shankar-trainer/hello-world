<?php
include("User1.php");
$user1=new User(10001,"kamal kumar","ram@gmail.com");

echo "user information ";
echo  "id is ".$user1->getId();
echo  "<br>name is ".$user1->getName();
echo  "<br>salary is ".$user1->getEmail();

?>