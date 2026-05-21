<?php
class CustomerService {
    // Magic method triggered when calling an undefined method 'getCustomer'
    public function __call($name, $arguments) {
        if ($name === 'getCustomer') {
            $param = $arguments[0];

            // Overload logic: check if the input is an ID or a Name
            if (is_int($param)) {
                return $this->getById($param);
            } elseif (is_string($param)) {
                return $this->getByName($param);
            }
        }
    }

    private function getById($id) {
        return "Fetching customer record for ID: " . $id;
    }

    private function getByName($name) {
        return "Searching for customer record by Name: " . $name;
    }
}

// Usage
$service = new CustomerService();

// Simulates overloading by calling the same method with different types
echo $service->getCustomer(101);        // Output: Fetching customer record for ID: 101
echo "\n";
echo $service->getCustomer("John Doe"); // Output: Searching for customer record by Name: John Doe
?>