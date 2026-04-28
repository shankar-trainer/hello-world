<?php
//if(file_exists('error1.php')){
    // $file=fopen('error1.php','r');
    $file=fopen('error11.php','r');
    // $c=fread($file, 100);
    if($file){
        $c=fread($file, filesize('error1.php'));
        print($c);
    }
//}
else {
    die('file not present');
}

echo 'program ends ';
?>