in mysql
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

https://github.com/bezkoder/angular-17-jwt-auth
https://github.com/bezkoder/spring-boot-spring-security-jwt-authentication


http://localhost:8080/api/auth/signup
post
{
"username":"amit kumar",
"email":"amit@gmail.com",
 "role":["user_role"],
"password":"abcdefg"
}
or without role
{
"username":"sumit kumar",
"email":"sumit@gmail.com",
"password":"abcdefg"
}


http://localhost:8080/api/auth/signin
post

{
"username":"amit kumar",
"password":"abcdefg"
}


http://localhost:8080/api/test/user
get
{
"username":"amit kumar",
"password":"abcdefg"
}
add the above generated jwt bearer password

http://localhost:4200/login



