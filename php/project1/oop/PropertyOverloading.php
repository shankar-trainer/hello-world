<?php
class Animal
{
    public $name = "dog";
    protected $type;
    public function __construct($name)
    {
        $this->name = $name;
    }
    public function greet()
    {
        return "Hello    " . $this->name;
    }

}
echo $_SERVER["PHP_SELF"];
?>