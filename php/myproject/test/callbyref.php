<?php
// header('Content-Type: text/html');
$a=10;

function hello($b){
$b++;
 echo "<p>inside no is $b";
}
hello($a);
echo "<p>outside no is $a";

//=============== by ref 

$a1=20;

function hello1(&$b1){
  $b1++;
 echo "<p>inside no is $b1";
}

hello1($a1);
echo "<p>outside no is $a1";
?>