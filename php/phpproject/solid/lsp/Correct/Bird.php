<?php
class Bird
{
    public function eat()
    {
        echo "bird eats";
    }
}

interface flyingBird
{
    public function fly();
}

class Parrot extends Bird implements flyingBird
{
    #[Override]
    public function fly()
    {
        echo "<br>Parrot can fly";
    }
}
class Penguin  extends Bird {
    
}
$parrot=new Parrot();
echo "parrot behaviour";
$parrot->fly();
$parrot->eat();

echo "<p>penguin behaviour";

$penguin=new Penguin();
$penguin->eat();
