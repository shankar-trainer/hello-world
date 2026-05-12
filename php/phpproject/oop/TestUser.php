<?php 
// include("User.php");
include("User1.php");
// $user1=new User();
// $user2=new User();
// $user3=new User();

$user1=new User(10001,'hari kumar',20000);
$user2=new User(10009,'amit kumar',450000);
$user3=new User(100078,'vimal kumar',56000);

$user1->getUserDetails();
$user2->getUserDetails();
$user3->getUserDetails();

?>