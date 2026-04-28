<?php
class User{
static $name="suresh kumar";
static function myname(){
 return self::$name;
}
}

echo "name  ".User::$name;
echo "\nname is ".User::myname();
?>