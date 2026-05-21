<?php

setcookie('empcookie1', 'arvind kumar');
setcookie('empcookie2', 'suman kumar');
print("all cookies are   ");
print_r($_COOKIE);

echo  "<p>". $_COOKIE['empcookie1'];
echo "<p>".$_COOKIE['empcookie2'];

?>