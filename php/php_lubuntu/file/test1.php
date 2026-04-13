<?php
echo __DIR__;

//file_put_contents("hello.txt","hello world");

file_put_contents("hello.txt","\nhello world",FILE_APPEND);


echo "\n".file_get_contents("hello.txt");
echo "\n";

?>
