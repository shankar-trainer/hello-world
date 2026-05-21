<?php  

$s="we are learning php";
$ar=explode(" ",$s);//split  string to array
print_r($ar);

foreach ($ar as $val) {
    echo $val ." , ";
}

// implode  join array to string with separator 

$ar1=array(1,2,3,43,55,66);

echo("\nbefore implode");
print_r($ar1);

$ar1_str=implode("-",$ar1);

echo"\nimplode";

print_r($ar1_str);

?>