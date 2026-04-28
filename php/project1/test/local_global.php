<?php
$p=999;
function hello(){
//   print $p;
   global $p;// imports 
   echo $p;
    $x=1000;
}
function hello1(){
   echo $GLOBALS['p']; // directly access
}

// hello();
hello1();

?>