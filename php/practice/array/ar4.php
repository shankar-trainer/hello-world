<?php

$ar1=[11,22,3,1,4,5,9,0];
print_r($ar1);
for($x=0;$x<count($ar1);$x++)
  print($ar1[$x].",  ");
print('sorted ');

sort($ar1);

print_r($ar1);

print(' reverse sorted ');
 
rsort($ar1);

print('reverse sort');
print_r($ar1);

$properties=array("id"=>10001, "name"=>"rav kumar","age"=>20);
foreach($properties as $key=>$value){
  echo $key.'   '.$value."\n";
}

?>
