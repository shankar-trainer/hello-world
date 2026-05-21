<?php
$var="we are learning php";
$x=explode(" ",$var);// split the string using separator 

//print_r($x);
echo "<br>length is ".count($x);

foreach($x as $k){
 echo "<br>".$k;
}

$city=array("chennai","madurai","delhi","kolkotta");

$res=implode(" and ",$city);

echo "<br>".$res;

?>