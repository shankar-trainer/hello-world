<?php

class User
{
    private $id;
    private $name;
    private $salary;
    private static $country;

    public static function setCountry($country1){
        return self::$country;
    }

    public static function getCountry(){
        return self::$country;
    }

    public function getId()
    {
        return $this->id;
    }

    public function setId($id)
    {
        $this->id = $id;
        return $this;
    }

    public function getName()
    {
        return $this->name;
    }

    public function setName($name)
    {
        $this->name = $name;
        return $this;
    }

    public function getSalary()
    {
        return $this->salary;
    }

    public function setSalary($salary)
    {
        $this->salary = $salary;
        return $this;
    }
}

?>