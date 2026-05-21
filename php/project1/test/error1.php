<?php

$x=readline('enter number    ');
echo "\nnumber is   ".$x;

$x=$x+100;

echo "\nnow number is   ".$x;

if($x%2==0){
    die('finish of program');
}
else {
    echo "\n$x  no is odd number ";
}
echo "\nprogram stops";
?>
