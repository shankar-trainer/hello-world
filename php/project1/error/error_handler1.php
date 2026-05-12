<?php

// 1. Define the custom error handler function
function myErrorHandler($errno, $errstr, $errfile, $errline) {
    echo "<b>[Custom Error]</b> ID: $errno | Message: $errstr<br>";
    echo "Location: $errfile on line $errline<br>";
    
    // Return true to skip PHP's internal error handler
    return true; 
}

// 2. Set the custom handler
set_error_handler("myErrorHandler");

// 3. The Division Test
try {
    $numerator = 10;
    $denominator = 0;

    // In PHP 7+, this throws a DivisionByZeroError Exception
    if ($denominator === 0) {
        // We manually trigger an error to show set_error_handler in action
        trigger_error("Attempted division by zero!", E_USER_WARNING);
        
        // Or let PHP throw the exception naturally
        $result = $numerator / $denominator;
    }

} catch (DivisionByZeroError $e) {
    echo "<b>[Caught Exception]</b> " . $e->getMessage() . "<br>";
}

echo "The script continues to run...";
?>