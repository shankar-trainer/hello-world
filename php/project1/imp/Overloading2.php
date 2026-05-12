<?php

class Addition
{
    public function __call($name, $arguments)
    {
        $param1 = $arguments[0];
        $param2 = $arguments[0];

        if ($name == "addition") {
            if (count($arguments) == 2) {
                if (is_int($param1) && is_int($param2)) {
                    return $this->addTwo($arguments[0], $arguments[1]);
                }
                if (is_string($param1) && is_string($param2)) {
                    return $this->addTwoString($arguments[0], $arguments[1]);
                }
            }
        }
    }
    private function addTwo($a, $b){
        return $a + $b;
    }
    private function addTwoString($a, $b){
        return $a."   ".$b;
    }
}

$a=new Addition();
echo "<br>".$a->addition(11,22);
echo "<br?>".$a->addition("amit","kumar");

