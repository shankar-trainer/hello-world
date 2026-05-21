CREATE TABLE users (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
name VARCHAR(30) NOT NULL,
email VARCHAR(50) NOT NULL);
)

post 

http://localhost:8080/project1/rest_pdo/api.php

{
    "name": "shyam kumar",
    "email": "shyam@gmail.com"
}

{
    "name": "mohan kumar",
    "email": "mohan@gmail.com"
}

http://localhost:8080/project1/rest_pdo/api.php/

http://localhost:8080/project1/rest_pdo/api.php/2