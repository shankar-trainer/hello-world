<?php 
// error_reporting(E_ALL);
error_reporting(E_ERROR);
$string="";
try{
explode($string);
}
catch(ArgumentCountError $e){
echo "error is ".$e->getMessage();
}
?>


