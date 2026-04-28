<?php

class Students{

    private $name;
    private $age;

    public function __construct($name, $age){
     $this->name=$name;
     $this->age=$age;
    }
    public function getname(){
        return $this->name;
    }
    public function getAge(){
    return $this->age;
    }
}
$stud=new Students('amit kumar',22);
echo "student details ";
echo "<br>\tname is ".$stud->getname();
echo "<br>\tage is ".$stud->getage();

?>