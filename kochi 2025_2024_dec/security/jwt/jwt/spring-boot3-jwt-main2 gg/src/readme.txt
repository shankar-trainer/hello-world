postman 
post method  body json 

http://localhost:8080/auth/addNewUser

{
  "name":"suresh kumar",
   "email":"suresh@ymail.com",
   "password":"1234",
   "roles":"ROLE_USER"
}


post method   body json 
http://localhost:8080/auth/generateToken

{
  "username":"suresh kumar",
   "password":"1234"
}
it will generate token

copy token 

http://localhost:8080/auth/user/userProfile

