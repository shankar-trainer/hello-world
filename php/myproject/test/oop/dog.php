<?php
require 'animal.php';
class Dog extends  Animal{

    public function run() {
        return  $this->name." is running";
    }
    
}
$dog=new Dog('roxy dog');
echo ($dog->run());
?>