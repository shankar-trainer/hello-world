<?php
class Person
{
    private $data = [];


    public function __set($name, $value)
    {
        $this->data[$name] = $value;
    }

    public function __get($name)
    {
        return $this->data[$name];
    }
}

$p=new Person();
$p->id=10001;
$p->name='amit kumar';
$p->salary=90000;
$p->email='ram@gmail.com';

echo 'person data';
echo '<br> id : '.$p->id; 
echo '<br> name : '.$p->name; 
echo '<br> salary : '.$p->salary; 
echo '<br> email : '.$p->email; 