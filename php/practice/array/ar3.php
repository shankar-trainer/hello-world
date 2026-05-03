
<?php

$ar1=array('delhi','patna','ranchi','chennai');

echo "\n array_search  ".array_search('delhi',$ar1);

echo "\n in_array  ".in_array('patna',$ar1);

echo "\n in_array  ".in_array('patna66',$ar1);

var_dump(in_array('patna',$ar1));

if(in_array('patna',$ar1))
  print("found ");
else 
 print("not found");  
  


?>
