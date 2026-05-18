<?php 
abstract class Base {
    // Abstract method: no body {}
    abstract protected function calculatePrice($item);

    // Concrete method: has a body
    public function printStatus() {
        echo "Processing...";
    }
}

class Invoice extends Base {
    // Child MUST implement the abstract method
    public function calculatePrice($item) {
        return $item * 1.2;
    }
}

