<?php

class Person {
    // Instance properties
    public int $id;
    public string $name;
    public float $salary;

    // Static property (shared across all instances)
    public static string $country = "Unknown";

    /**
     * Constructor to initialize a new Person
     */
    public function __construct(int $id, string $name, float $salary) {
        $this->id = $id;
        $this->name = $name;
        $this->salary = $salary;
    }

    /**
     * Static method to update the country for everyone
     */
    public static function setCountry(string $newCountry): void {
        self::$country = $newCountry;
    }

    /**
     * Display person details
     */
    public function displayDetails(): void {
        echo "ID: {$this->id} | Name: {$this->name} | Salary: {$this->salary} | Country: " . self::$country . PHP_EOL;
    }
}

// --- Example Usage ---

// Set the static property before creating instances
Person::setCountry("Canada");

$p1 = new Person(101, "Alice", 75000.50);
$p2 = new Person(102, "Bob", 82000.00);

$p1->displayDetails();
$p2->displayDetails();

// Changing the static property affects all instances
Person::setCountry("Germany");

echo "\nAfter updating country:\n";
$p1->displayDetails();
$p2->displayDetails();