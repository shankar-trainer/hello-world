postman 

post method  body json 

http://localhost:8080/api/v1/auth/register

{
    "firstName":"mohan",
    "lastName":"kumar",
    "email":"mohan@gmail.com",
    "password":"1234"
}

it will generate token 
copy token 

post method  body json 
http://localhost:8080/api/v1/auth/authenticate
{
  
    "email":"mohan@gmail.com",
    "password":"1234"
}

click send 
it will generate token 
copy token 

get method 
http://localhost:8080/api/v1/demo

Authorization--> Type  Bearer Token --> in token(rhs) -- paste token value
 from either http://localhost:8080//api/v1/auth/authenticate 
 or 
 http://localhost:8080//api/v1/auth/register
  
 click send 
 output 
 Hello from secured endpoint
  
 

