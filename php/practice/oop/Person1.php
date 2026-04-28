<?php

class Person
{
    private int $isbn;
    private string $name;
    private string $email;
    private string $phone;

    public function setIsbn(int $isbn):void {
         $this->isbn=$isbn;
    }

    public function  getIsbn():int {
        return  $this->isbn;
    }
    public function setName($name):void{
        $this->name=$name;
    }
    public function getName():string{
        return  $this->name;
    }
    
}

$p=new Person();
$p->setIsbn(10001);
$p->setName('amit kumar');

echo "person information";
echo "<br> id ".$p->getIsbn();
echo "<br> name ".$p->getName();

?>
