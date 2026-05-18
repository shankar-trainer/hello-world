<?php
class Test1{
    public function hello(){
        echo "hello to php";
    }
}

class Test2 extends Test1{

    
    public function hello(){
        echo "greeting to php";
    }
}

$t2=new Test2() ;
$t2->hello();
?>