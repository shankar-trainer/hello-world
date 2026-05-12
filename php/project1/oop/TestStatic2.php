<?php

require('Static2.php');

$user = new User();
$user->setId(10001);
$user->setName('ram kumar');
$user->setSalary(20000);
User::setCountry('india');

echo "user information";
echo "<br>id  is " . $user->getId();
echo "<br>name  is " . $user->getName();
echo "<br>salary is " . $user->getSalary();
echo "<br>Country is " . User::getCountry();
