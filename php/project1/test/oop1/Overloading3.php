<?php  
class Calculator{
public function __call($name, $arguments) {
        if ($name === 'add') {
            switch (count($arguments)) {
                case 2:
                    return $this->addTwo($arguments[0], $arguments[1]);
                case 3:
                    return $this->addThree($arguments[0], $arguments[1], $arguments[2]);
            }
        }
    }

    private function addTwo($a, $b) {
        return $a + $b;
    }

    private function addThree($a, $b, $c) {
        return $a + $b + $c;
    }
}

$calc = new Calculator();
echo $calc->add(10, 20);      // Outputs 30
echo "\n".$calc->add(10, 20, 30);  // Outputs 60
?>
