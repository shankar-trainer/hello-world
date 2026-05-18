<?php
class User
{
    private static ?User $user=null;
//The ? prefix allows the variable to also hold a null value
    private $id;
    private $name;

    private function __construct($id, $name)
    {
        $this->id = $id;
        $this->name = $name;
    }

    static function getUserInstance($id, $name)
    {
        if (self::$user === null) {
            self::$user = new User($id, $name);
        }
        return self::$user;
    }

    public function getId()
    {
        return $this->id;
    }
    public function getName()
    {
        return $this->name;
    }
}

$s1 = User::getUserInstance(10001, "vimal");
$s2 = User::getUserInstance(10002, "kamal");

echo $s1->getId() . "" . $s2->getName() . "";
echo $s2->getId() . "" . $s2->getName() . "";
