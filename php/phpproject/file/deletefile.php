<?php
if(unlink("welcome.txt")){
echo "deleted the file";
}else {
    echo "file not present";
}
?>