<?php
abstract class Employee
{

    private $id;
    private $name;
    private $salary;
    public function __construct($id, $name, $salary)
    {
        $this->id = $id;
        $this->name = $name;
        $this->salary = $salary;
    }

    function getEmployeeDetails()
    {
        echo "" . $this->id . "\n" . $this->name;
        echo  "\nsalary " . $this->salary;
    }
    abstract function calculateSalary();
    public function getSalary()
    {
        return $this->salary;
    }
}
class Manager extends Employee
{
    private $pf;
    public function __construct($id, $name, $salary, $pf)
    {
        $this->pf = $pf;
        parent::__construct($id, $name, $salary);
    }
    #[Override]
    public function calculateSalary()
    {
        echo "gross salary is " . $this->getSalary() - ($this->getSalary() * $this->pf/100);
    }
}
$m=new Manager(1001,"ANNAD kumar",12000,3);
$m->getEmployeeDetails();
$m->calculateSalary();
?>
