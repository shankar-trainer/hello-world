<?php 
// Database configuration 
define('DB_HOST', 'localhost'); 
define('DB_NAME', 'db3'); 
define('DB_USER', 'root'); 
define('DB_PASS', 'mysql'); 
 
// JWT secret - change to a long random string in production 
define('JWT_SECRET', 'replace_this_with_a_long_random_secret'); 
// Token lifetime in seconds 
define('JWT_TTL', 3600); 
 
// Optional issuer/audience 
define('JWT_ISS', 'my-php-api'); 
define('JWT_AUD', 'my-php-api-users'); 
 
// Set default timezone 
date_default_timezone_set('UTC'); 
?>
