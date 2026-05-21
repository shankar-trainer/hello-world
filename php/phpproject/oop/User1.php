<?php
class User
{
    private $id;
    private $name;
    private $salary;
    public function __construct($id, $name, $salary){
     echo "<br>overloaded constructor";   
            $this->id = $id;
            $this->name = $name;
            $this->salary = $salary;
    }
    public function getUserDetails()
    {
        echo "<p>User details";
        echo "<br>   id " . $this->id;
        echo "<br>   name " . $this->name;
        echo "<br>   salary " . $this->salary;
    }
}
