http://localhost:8080/addNewUser
post

{
"name":"amit kumar",
"password":"abcd",
"roles": "ROLE_USER"
}

generate key

http://localhost:8080/generateToken
post
{
"username":"amit kumar",
"password":"abcd"
}

copy the jwt token

http://localhost:8080/welcome
get method

Authorization tab->Auth type Bearer Token-->Token paste
run

jwtservice secret generated from https://jwtsecretkeygenerator.com/
