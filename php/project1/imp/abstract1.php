<?php
abstract  class Person
{
    private $id;
    private $name;

    public function __construct($id, $name)
    {
        $this->id = $id;
        $this->name = $name;
    }
    public function getPerson()
    {
        echo "" . $this->id . "<br>" . $this->name . "<br>";
    }
}

class Employee extends Person
{
    private $salary;
    #[Override]
    public function __construct($id, $name, $salary)
    {
        $this->salary = $salary;
        parent::__construct($id, $name);
    }
    public function getPerson()
    {
        parent::getPerson();
        echo "salary is " . $this->salary;
    }
   
}
 $emp=new Employee(1001,'ram kumar',20000);
    $emp->getPerson();
