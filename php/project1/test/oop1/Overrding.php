<?php 

class Test1{
    public function test1(){
        echo __CLASS__." <br>";
    }
}

class Test2 extends Test1{
    public function test1(){
    echo __CLASS__."<br>";
    }
}

$t=new Test2();
$t->test1();

?>