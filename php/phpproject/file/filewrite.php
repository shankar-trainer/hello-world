<?php 

$handle=fopen("welcome.txt","a");
fwrite($handle,"\nthis is chennai");
fwrite($handle,"\nchennai is in tamilnadu");
echo "content writtent to the file ";
fclose($handle);

?>