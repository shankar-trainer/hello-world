in db2 mysql 

CREATE TABLE users (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
name VARCHAR(30) NOT NULL,
email VARCHAR(50) NOT NULL,
age INT (3) NOT NULL);



get in postman 
http://localhost:8080/project1/restapp_native/api.php


post

http://localhost:8080/project1/restapp_native/api.php

{
    "name": "ram kumar",
    "email": "ram@gmail.com",
    "age": 28
}
// find with get 

http://localhost:8080/project1/restapp_native/api.php/1

========================================================


The command $input = json_decode(file_get_contents('php://input'), true); is the standard way to read and parse raw JSON data sent in the body of an HTTP request (such as POST or PUT) in PHP. [1, 2, 3, 4]
Breakdown of Components
    • php://input: A read-only stream that allows you to access the raw data from the request body. Unlike the $_POST superglobal, which only parses data from specific content types like application/x-www-form-urlencoded, php://input can read any raw content, including JSON, XML, or plain text.
    • file_get_contents(): A PHP native function that reads the entire content of a file (or in this case, the input stream) into a string.
    • json_decode(..., true): This decodes the JSON string  into a PHP variable.
        ◦ The second parameter true converts the JSON into an associative array.
        ◦ If omitted or set to false, it returns a PHP object. [1, 2, 3, 4, 5, 6, 7]

Why use this instead of $_POST?

You must use this method when receiving JSON data (e.g., from a JavaScript fetch() call or a mobile app) because PHP does not automatically populate $_POST for application/json requests. [1, 2, 3, 4, 5]

php
// 1. Get raw input
$rawInput = file_get_contents('php://input');

// 2. Decode into an associative array
$input = json_decode($rawInput, true);

// 3. Access data safely
if ($input !== null) {
    echo "Username: " . $input['username'];
} else {
    echo "Invalid JSON received.";
}
Use code with caution.
Common Troubleshooting Tips
    • Returns NULL: This often happens if the input is not valid JSON or if the UTF-8 encoding  contains a BOM (Byte Order Mark). Use json_last_error() to find the exact reason.
    • Empty Stream: php://input can only be read once in some PHP versions/configurations; once consumed, subsequent calls may return an empty string.
    • Form Data: This stream is not available if the request uses enctype="multipart/form-data" (typically used for file uploads). [1, 2, 3, 4, 5, 6]
Are you experiencing a specific error like returning NULL or trying to process data from a specific client-side framework?

