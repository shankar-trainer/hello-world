http://localhost:8080/addNewUser
post
{
"name":"amit kumar",
"password":"abcd",
"roles":"ROLE_USER"
}

http://localhost:8080/generateToken
post
{
"username":"amit kumar",
"password":"abcd"
}
copy generated token

http://localhost:8080/welcome
get
add it in bearer token



