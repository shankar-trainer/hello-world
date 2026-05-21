<?php

$x = 100;
// $y = 0;
$y = 40;
try {
    if ($y == 0) {
        throw new Exception("divided by zero error");
    }

    $z = $x / $y;
    echo "division is " . $z;
} catch (Exception $e) {
    echo "" . $e->getMessage() . "";
}

echo "<br>program ends ";
