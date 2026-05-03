<?php

$ar=array(1,2,3,4,5,6);
print_r ($ar);
print("using for loop\n");

for($x=0;$x<count($ar);$x++){
  print($ar[$x].",");
}

print("\n using foreach  loop \n");
foreach($ar as $a){
echo $a."  ,";
}

print("\n Associative array  \n");
$properties=array("id"=>10001,"name"=>"ram kumar","age"=>20);

print_r($properties);
print("\n using foreach  loop \n");

foreach($properties as $key=>$value){
  echo $key.'   '.$value.",  ";
}

echo "\nsorting asort ";
asort($properties);
print_r($properties);

echo "\nsorting arsort ";
arsort($properties);
print_r($properties);

echo "\nsorting ksort ";
ksort($properties);
print_r($properties);

echo "\narray_keys ";
$k=array_keys($properties);
print_r($k);

echo "\narray_keys ";
$v=array_values($properties);
print_r($v);
?>



