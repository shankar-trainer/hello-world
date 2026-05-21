<?php

$handle=fopen("hello.txt","r");

echo fgets($handle);

while(!feof($handle)){

    $line=fgets($handle);
    echo "<br>".$line;
}
fclose($handle);
?>