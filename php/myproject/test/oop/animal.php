<?php
class Animal{
    public  $name;
    public function __construct($name) {
        $this->name=$name;
    }
    public function get_name() {
        return  $this->name;
    }
}

// $animal=new Animal('cow');
// echo "animal name is ".$animal->get_name();
?>
