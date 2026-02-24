in jwt service add key from
https://jwtsecretkeygenerator.com/


in postman

http://localhost:5555/api/auth/register
post

{
"username":"ram",
"password":"ram",
"role":"ADMIN"
}


http://localhost:5555/api/auth/login
post
{
"username":"ram",
"password":"ram"
}
it will generate jwt key copy it


http://localhost:5555/api/user/hello
http://localhost:5555/api/admin/hello

get

add jwt token in authorization bearer token

RUN
above both works



