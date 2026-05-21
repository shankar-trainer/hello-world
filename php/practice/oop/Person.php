<?php
class Person
{

    private $isbn;

    private $name;

    private $email;

    private $phone;

    public function setIsbn($isbn)
    {
        // $this->$isbn=$isbn;
        $this->isbn = $isbn;
    }

    public function getIsbn()
    {
        return $this->isbn;
    }

    public function setName($name)
    {
        $this->name = $name;
    }

    public function getName()
    {
        return $this->name;
    }
}

$p = new Person();
$p->setIsbn(10001);
$p->setName('amit kumar');

echo "person information";
echo "<br> id " . $p->getIsbn();
echo "<br> name " . $p->getName();

?>
