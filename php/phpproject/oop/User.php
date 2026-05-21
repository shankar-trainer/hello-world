<?php
class User
{
    private $id;
    private $name;
    private $salary;
    public function __construct()
    {
        echo "<br> default constructor called";
        $this->id = 10001;
        $this->name = 'hari parsad';
        $this->salary = 670000;
    }

    public function getUserDetails()
    {
        echo "<p>User details";
        echo "<br>   id " . $this->id;
        echo "<br>   name " . $this->name;
        echo "<br>   salary " . $this->salary;
    }
}
