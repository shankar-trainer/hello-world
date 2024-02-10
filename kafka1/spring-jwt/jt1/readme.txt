open postman

step 1 method post localhost:9192/authenticate

inside body --json add { "userName":"shankar", "password":"password" }

press send

copy output and take to jwt.io

step 2

in postman add a new tab with get method url localhost:9192/ Inside Headers add

Key Value Content-Type application/json Authorization Bearer paste generated value from localhost:9192/authenticate post method

Click on send Result Welcome to jwt

spring-security-jwt-example

angular 16.2.0
spring boot 2.2.2.RELEASE

run angular

