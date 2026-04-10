<?php

class Car
{

    // Properties
    public $brand;

    public $color;

    // Constructor method (runs automatically when object is created)
    public function __construct($brand, $color)
    {
        $this->brand = $brand;
        $this->color = $color;
    }

    // Method to display information
    public function displayDetails()
    {
        return "This car is a " . $this->color . " " . $this->brand . ".";
    }
}

// Instantiate (create) a new object from the class
$myCar = new Car("Toyota", "red");

// Accessing the method
echo $myCar->displayDetails();
// Output: This car is a red Toyota.
?>
