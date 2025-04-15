/*
post
http://localhost:8080/addNewUser
{
  "name":"suresh kumar",
   "email":"suresh@ymail.com",
   "password":"1234",
   "roles":"ROLE_USER"
}
post
http://localhost:8080/generateToken
{
  "username":"suresh kumar",
   "password":"1234"
}
 */

//  password  abcd --https://bcrypt-generator.com/
//insert into users values(1001,'$2a$12$fhHYf2.wQAp.DIRmU3U7mu.UFaANCfBYEMAyTAz7VGhgvFyIqJazi','ram kumar');


┌─────┐
|  jwtAuthFilter (field private com.abc.service.UserService com.abc.filter.JwtAuthFilter.userDetailsService)
↑     ↓
|  userService (field private org.springframework.security.crypto.password.PasswordEncoder com.abc.service.UserService.encoder)
↑     ↓
|  securityConfig (field private com.abc.filter.JwtAuthFilter com.abc.config.SecurityConfig.authFilter)
└─────┘