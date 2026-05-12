<?php
// A user-defined error handler function
function myErrorHandler($errno, $errstr, $errfile, $errline) {
    echo "<b>Custom error:</b> [$errno] $errstr<br>";
    echo " Error on line $errline in $errfile<br>";
}

// Set user-defined error handler function
set_error_handler("myErrorHandler");

$test=2;

// Trigger error
if ($test>1) {
    trigger_error("A custom error has been triggered");
}
?>
