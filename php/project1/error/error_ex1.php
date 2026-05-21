<?php
$n1 = readline();
$n2 = readline();

try {
    if ($n2 == 0) {
        throw new Exception("division by zero error");
    }
    echo "division is " . $n1 / $n2;
} catch (Exception $e) {
    echo $e->getMessage();
}
