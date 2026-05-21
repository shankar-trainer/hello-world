<?php

function hello(){
    echo "<br>welcome to php";
}
function fullname($fn,$ln){
 echo "<p>full name is ".$fn." ".$ln;
}

hello();
hello();
fullname('ram','kumar');
fullname('deepak','kumar');

?>