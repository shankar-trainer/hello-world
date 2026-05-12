<?php

class Person
{
    private $id;
    private $name;
    private $email;

    public function getId()
    {
        return $this->id;
    }

    public function setId($id)
    {
        if(!is_numeric($id)){
           throw new Exception("id must be numeric");
        }
        else if($id <= 0){
           throw new Exception("id can not be -ve or zero ");
        }
        $this->id = $id;
    }

    public function getName()
    {
        return $this->name;
    }

    public function setName($name)
    {
        if(!is_string($name)){
            throw new Exception("name must be string ");
        }
        else if(strlen($name) <5 || strlen($name) > 15){
         throw new Exception("nume must of 5 - 15 chars");
        }
        $this->name = $name;
    }

    public function getEmail()
    {
        return $this->email;
    }

    public function setEmail($email)
    {
        $this->email = $email;
    }
}
try{
$p = new Person();
$p->setId(10001);
$p->setName('ram');
$p->setEmail('suman@gmail.com');

echo "Person values are ";
echo "<br>   id :  " . $p->getId() . "";
echo "<br>   name :  " . $p->getName() . "";
echo "<br>   email :  " . $p->getEmail() . "";
}catch(Exception $e){
    echo "". $e->getMessage() ."";
}