<?php
class Hello{

    public function sayHello(){
     return __CLASS__;

    }

}
$h=new Hello();
print $h->sayHello();
?>