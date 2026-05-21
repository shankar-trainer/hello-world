<?php

$s = file_get_contents("hello.txt");

// echo $s;

$ar1 = explode("\n", $s);

foreach ($ar1 as $k) {
    echo $k . "<br>";
}

?>
