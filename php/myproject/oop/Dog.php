<?php
require('PropertyOverloading.php');

class Dog extends Animal{
    // protected $type=__CLASS__;
    protected $type=__CLASS__;
     
    //The PHP __get() magic method is utilized for reading data from 
    //inaccessible (private or protected) or non-existent properties. 
    public function __get($property){
        if(property_exists($this,$property)){
            return $this->$property;
        }
        else 
        return $property."does not exist";
    }

   public  function run(){
    return $this->name."   likes to run";
   }
}

$dog=new Dog("scooby");
echo "<br>type :   ".$dog->type;
echo "<br>greet :   ".$dog->greet();
echo  "<br>run :   ".$dog->run();
?>