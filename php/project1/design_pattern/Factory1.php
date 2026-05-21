<?php
 class Factory{
   public function creatething(){
    return new Things();
   }

 }

 class Things{
    public function hello(){
        echo "hello world ";
    }
 }
$factory = new Factory();
$thing= $factory->creatething();
$thing->hello();


?> 