<?php
class UserProfile {
    // Array to store dynamic data
    private array $data = [];

    // Magic SET method
    public function __set(string $name, $value): void {
        echo "Setting '$name' to '$value'\n";
        $this->data[$name] = $value;
    }

    // Magic GET method
    public function __get(string $name) {
        echo "Getting '$name': ";
        if (array_key_exists($name, $this->data)) {
            return $this->data[$name];
        }
        return "Property not found.";
    }
}

// Usage
$user = new UserProfile();

// Triggers __set() because 'username' does not exist in the class
$user->username = "JohnDoe"; 

// Triggers __get() because 'username' is non-existent
echo $user->username; 
?>
