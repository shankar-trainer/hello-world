<?php 

require('User.php');

$user=new User();
$user->create();

require('Product.php');

$product=new Product();
$product->delete();


?>
