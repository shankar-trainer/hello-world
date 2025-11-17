https://dev.to/amailath/secure-your-spring-boot-and-angular-application-with-jwt-authentication-a-comprehensive-guide-3o64

https://github.com/amaialth/MFAApplication

https://github.com/amaialth/mfaserver


Secure Your Spring Boot and Angular Application with JWT Authentication: A Comprehensive Guide
#
angular
#
springboot
#
security
#
jwt
In the world of web development, security is a critical aspect that cannot be overlooked. This blog post will guide you through the process of securing your Spring Boot backend and Angular frontend using JSON Web Tokens (JWT) for authentication. We'll cover the generation and validation of JWT on the server side, as well as implement the necessary features on the Angular side to handle authentication, error interception, and token storage.



Understanding JWT and Its Significance
JSON Web Tokens (JWT) have emerged as a key element in securing modern web applications, offering a compact and efficient way to transmit information between parties. Below is a brief overview of JWT and its pivotal role in contemporary web development:

What is JWT?
JWT is an open standard that defines a self-contained method for securely transmitting information as a JSON object. JWTs are commonly used for authentication, authorization, and secure communication by comprising a header, payload, and signature.

Components of a JWT:
Header: Specifies the token type and signing algorithm.
Payload: Contains claims and additional data.
Signature: Ensures the token's integrity and is created by combining the encoded header, payload, and a secret key.

Components of a JWT

Role of JWT in Modern Web Applications:
Stateless Authentication: JWTs eliminate the need for server-side session storage, allowing stateless authentication in scalable systems.

Authorization: JWTs carry user claims, aiding servers in making access control decisions.

Inter-Service Communication: JWTs facilitate secure communication between microservices, ensuring authenticity and authorization.

Compact and Efficient: The concise format of JWTs makes them ideal for transmitting information efficiently.

Advantages of JWT:
Security: JWTs can be signed and encrypted for integrity and confidentiality.

Decentralized: JWTs are self-contained, reducing the need for constant communication with a central authority.

Cross-Domain Compatibility: JWTs can be easily transmitted across different domains and are widely supported.

Considerations:
Token Expiry: JWTs can have an expiration time for enhanced security.

Sensitive Information: Avoid including highly sensitive information in the payload to minimize security risks.

thus, JWTs serve as a versatile and secure solution for authentication, authorization, and information exchange in modern web applications, contributing to the evolving landscape of web development.

Setting Up Spring Boot for JWT Authentication
Create an application setup with spring security. You can refer to my previous post to set up one.

Implementing JWT Service.
After successful authentication, the application will generate and sign the JWT with claims, expiration, and other parameters. Below is the flow that explains the JWT token generation.

JWT Token Generation

Let's configure the dependencies below for JWT support. This will help us in JWT generation and validation.

<dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>0.11.5</version>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>0.11.5</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>0.11.5</version>
            <scope>runtime</scope>
        </dependency>
As a next step, we will create a service that will generate and validate JWT.

io.jsonwebtoken.Jwts provides a handy builder method to build the JWT.

Let's create a secret key using the HMACSHA256 algorithm. This key will be used to ensure the integrity of JWT.

JWT Generate method
With the builder method let's set the issuer of JWT, Subject, Custom claim "username", and the expiration. Finally, sign the JWT with the secret key.

JWT Validate Method
We will use the JWT parser using the secret key to parse the claims from the JWT.

The code below shows the complete JWT service implementation

@Service
public class JWTServiceImpl implements JWTService {

    private final String key = "jxgEQeXHuPq8VdbyYFNkANdudQ53YUn4";
    private final SecretKey secretKey = Keys.hmacShaKeyFor(key.getBytes(StandardCharsets.UTF_8));

    @Override
    public String generateJwt(String username) throws ParseException {
        Date date= new Date();
        return  Jwts.builder()
                .setIssuer("MFA Server")
                .setSubject("JWT Auth Token")
                .claim("username", username)
                .setIssuedAt(date)
                .setExpiration(new Date(date.getTime() + 60000))
                .signWith(secretKey)
                .compact();
    }

    @Override
    public Authentication validateJwt(String jwt) {
        JwtParser jwtParser = Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build();
        Claims claims = jwtParser.parseClaimsJws(jwt).getBody();
        String username = (String)claims.getOrDefault("username",null);
        if(Objects.nonNull(username)){
            return new UsernamePasswordAuthenticationToken(username, null, new ArrayList<>());
        }
        return null;
    }
}
Configuring Spring Security for JWT validation.
To validate JWT we will create a custom filter that retrieves the token from incoming requests and sets the authorization token to the security context. Also, We will create an Exception handler that responds with 401 went the user is not authenticated.

JWT Validation Filter
This filter will be configured to execute before the "UsernameAndPasswordAuthenticvationFilter". This filter extends the OncePerRequestFiolter and provides the implantation to doFilter.

We will validate the JWt from the request by extracting the authorization header and using our JWT service to validate and set the authentication token to the security context. Please see the implementation below.

public JwtValidationFilter(JWTService jwtService) {
        this.jwtService = jwtService;
    }


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            //retrieve token
            String jwt = getJWT(request);
            if (Objects.nonNull(jwt)) {
                // Validate the JWT from the Request
                UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) jwtService.validateJwt(jwt);
                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }catch (Exception e){
            log.error("Exception while processing the JWT"+e.getMessage());
        }
        filterChain.doFilter(request, response);
    }

    private String getJWT(HttpServletRequest request){
        String jwt = request.getHeader("authorization");
        if(Objects.nonNull(jwt) && jwt.startsWith("Bearer") &&
        jwt.length()>7){
            return jwt.substring(7);
        }
        return null;
    }
Exception Handler
When there is any exception in the process of authentication we will respond with 401 - Unauthorized error. This is achieved using the Authentication Entry point. Where we will configure the exception handler. Look at the simple implementation below.

@Component
@Slf4j
public class AuthExceptionHandler implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        log.error("Unauthorized {}", authException.getMessage());
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "User is not Authenticated");
    }
}
Managing Cross-Origin Resource Sharing (CORS) to ensure secure communication.
Our angular application is running on a different port than the back end. it is considered a different domain. So we need to advise Spring Security to share data to the Cross Origins.

Let's use the CORS configuration to set allowed Origins, Methods, and headers. As we are expecting authorization and content-type header let's add them. For any URL in the application add this configuration using UrlBasedCorsConfigurationSource object.

 @Bean
    CorsConfigurationSource corsConfigurationSource(){
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        configuration.setAllowedMethods(Arrays.asList("GET","POST"));
        configuration.setAllowedHeaders(Arrays.asList("authorization","content-type"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",configuration);
        return source;
    }
Finally, we add this to the security configuration.

@Bean
    public SecurityFilterChain defaultFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .cors(cors-> cors.configurationSource(corsConfigurationSource()))
                .csrf(csrf-> csrf.disable())
                .exceptionHandling(handle -> handle.authenticationEntryPoint(authExceptionHandler))
                .addFilterBefore(jwtValidationFilter, UsernamePasswordAuthenticationFilter.class)
                .sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth-> auth
                        .requestMatchers("/error**","confirm-email","/register**","/login**","/verifyTotp**").permitAll()
                        .anyRequest().authenticated()
                )
               .build();
    }
Angular Setup for JWT Authentication
Storing JWT in Local Storage
On successful authentication, we will add the JWT to local storage and further, it will be used by the application for backend API calls.

Store JWT

public login(payload: MfaVerificationResponse): void {
    if(payload.tokenValid && !payload.mfaRequired){
      localStorage.clear();
      localStorage.setItem(this.tokenKey, payload.jwt);
    }
  }
Adding JWT to outgoing requests for secure communication with the backend.
HTTP Interceptors from angular allow us to intercept all the requests and responses. We will create two interceptors one to add the authorization token to the request header and another to redirect user to login page if the user is unauthorized.

Interceptor Workflow

Jwt Token Interceptor Implementation

@Injectable({
  providedIn: 'root'
})
export class TokenInterceptor implements HttpInterceptor {

  constructor(private authenticationService: AuthService) { }


  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    if (this.authenticationService.isLoggedIn()) {
      let newRequest = request.clone({
        setHeaders: {
          Authorization: `Bearer ${this.authenticationService.getToken()}`,
        },
      });
      return next.handle(newRequest);
    }
    return next.handle(request);
  }
}
Setting up an error interceptor for better error handling.
Error handler will skip the login page from 401 validation. If the backend responds with 401 for any API call then it is assumed the user should log in again to get access. We can customize this when we have role-level access.

@Injectable({
  providedIn: 'root'
})
export class ErrorInterceptor implements HttpInterceptor {

  constructor(private authenticationService: AuthService) { }


  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {

    return next.handle(request).pipe(catchError(error=>{
      if(error.status == 401 && !this.isLoginPage(request)){
        this.authenticationService.logout();
      }
      const errMsg = error.error.message || error.statusText;
      return throwError(()=> errMsg);
    }));
  }

  private isLoginPage(request: HttpRequest<any>){
    return request.url.includes("/login") || request.url.includes("/verifyTotp");
  }
}

Along the logout, we will clear the token from local storage and navigate the user to login page.

  public logout() {
    localStorage.removeItem(this.tokenKey);
    this.router.navigate(['/login']);
  }
Now let's call a protected URL on the Home page load.

export class HomeComponent implements OnInit {
  message: string="";
  constructor(private homeService: HomeService) { }

  ngOnInit(): void {
    this.homeService.getProtectedString().subscribe(s=> this.message =s);
  }

}
Home HTML

<div class="container-fluid">
<div class="card">
    <div class="card-header">
        <h1>Welcome!!</h1>
    </div>
    <div class="card-body">
        <h2>{{message}}</h2>
    </div>
</div>
</div>
Let's execute the code and check it out.
After successful login, you can see the bearer token is added to the header and we have received the response.

UI Home Page
200 OK from backend

We have successfully secured the Spring boot and Angular application using JWT. Great for reading till the end. Check out the GitHub repository & do comment if have any questions, I am happy to answer all.

Backend code


=======================

https://medium.com/@arunaselvam23/angular-jwt-authentication-with-spring-boot-backend-41bd9950e51


Angular JWT Authentication with Spring Boot Backend
Aruna Selvam
Aruna Selvam

Follow
6 min read
·
Jul 24, 2023
87


2



Introduction:

JWT (JSON Web Tokens) is a popular method for implementing authentication and authorization in web applications. In this blog post, we will explore how to integrate JWT authentication in an Angular application with a Spring Boot backend. JWT authentication offers a secure and efficient way to handle user authentication and protect sensitive routes from unauthorized access.

Implementing JWT-based Authentication from Angular Frontend to Spring Boot Backend

User Authentication Request:

The user accesses the Angular frontend and navigates to the login page.

The user enters their login credentials (e.g., username and password) in the login form.

When the user clicks the “Submit” button, Angular captures the login credentials from the form.

Sending Authentication Request to Backend:

Angular constructs an HTTP POST request containing the user’s login credentials (in the request body) and sends it to the Spring Boot backend.

The HTTP POST request is typically sent to an endpoint specifically designed for user authentication, such as /login or /authenticate.

Backend Authentication:

The Spring Boot backend receives the HTTP POST request with the user’s login credentials.

The backend performs the necessary authentication checks, such as verifying the username and password against the stored user credentials in the database or an authentication service.

If the user is successfully authenticated, the backend generates a JSON Web Token (JWT) representing the user’s identity and adds it to the response.

Sending JWT Token to Frontend:

The backend responds to the Angular frontend’s authentication request with an HTTP response.

The JWT token is included in the response body or in an HTTP header (commonly in the Authorization header) for security purposes.

The response may also contain additional user information or permissions needed for the frontend to manage the user’s session.

Storing JWT Token in Frontend:

Angular extracts the JWT token from the HTTP response.

The frontend typically stores the JWT token in either the browser’s local storage or a cookie.

Storing the token allows the frontend to maintain the user’s authenticated state across subsequent requests without requiring the user to log in repeatedly.

Subsequent Requests with JWT Token:

For subsequent requests to protected routes or resources on the backend, the Angular frontend includes the JWT token in the HTTP headers of the request.

The token is typically sent in the Authorization header with the value “Bearer {token}” where {token} is the actual JWT token.

Backend Token Validation:

The Spring Boot backend receives incoming requests from the Angular frontend.

For protected routes, the backend first extracts the JWT token from the Authorization header of the request.

The backend then verifies the authenticity and validity of the JWT token using the secret key or public key, depending on the token’s signature type.

Handling Valid or Invalid Token:

If the token is valid and not expired, the backend allows the requested operation to proceed. The user is considered authenticated.

Get Aruna Selvam’s stories in your inbox
Join Medium for free to get updates from this writer.

Enter your email
Subscribe
If the token is invalid (e.g., expired, tampered, or not signed properly), the backend returns an error response or redirects the user to a login page.

The frontend may handle such responses by displaying an appropriate message to the user or redirecting them to log in again.

Steps to follow in Frontend (Angular) for Authentication and Authorization:

Install Dependencies:

To get started, we need to install the necessary dependencies for JWT authentication in Angular. We’ll use the @auth0/angular-jwt library for this purpose. To install it, run the following command:

npm install @auth0/angular-jwt

First, generate a new Angular service for the AuthService using the Angular CLI:

ng generate service auth/auth

AuthService Implementation:

The AuthService is a crucial component responsible for handling user authentication and keeping track of the logged-in status. It should provide methods for login, logout, and checking the authentication status. The login() method will send the user’s credentials to the Spring Boot backend for authentication. Upon successful login, the backend will respond with a JWT token, which we’ll store in the browser’s local storage or session storage for subsequent requests.

Press enter or click to view image in full size

This AuthService provides methods for logging in and logging out. It uses BehaviorSubject to keep track of the authentication status and the logged-in user. When the login() method is called and the login is successful, it sets the loggedIn status to true, stores the token in the localstorage, and navigates to the home page. If there is an error during login, it sets the loggedIn status to false and navigates back to the login page. The logout() method sets the loggedIn status to false, removes the token from localStorage, and navigates to the login page.

LoginComponent with a login form:

The LoginComponent will serve as the entry point for user authentication. It should contain a login form with fields for the username and password. Upon form submission, the LoginComponent will call the login() method from the AuthService to initiate the authentication process.

Press enter or click to view image in full size

login.html
Press enter or click to view image in full size

login.component.ts
This LoginComponent uses Angular Reactive Forms to create the login form with username and password fields. When the user clicks the “Login” button, the onSubmit() method is called, and it checks if the form is valid. If valid, it retrieves the values of the username and password fields and calls the login() method from the AuthService, passing the login credentials as an object.

AuthGuard for Route Protection:

To protect certain routes that require authentication, we’ll use the AuthGuard. The AuthGuard will implement the CanActivate interface to check if the user is logged in. If the user is authenticated, the route can be accessed; otherwise, the AuthGuard will redirect the user to the login page.

Press enter or click to view image in full size

auth.guard.ts
In this AuthGuard, we use the CanActivate interface, which allows us to implement the canActivate() method. Inside this method, we check whether the user is logged in by calling the isLoggedIn() method from the AuthService. If the user is logged in, canActivate() returns true, and the route can be accessed. If the user is not logged in, canActivate() returns false, and the router navigates to the login page.

HTTP Interceptor for JWT Token Injection:

To automatically include the JWT token in the headers of each HTTP request, we’ll create an HTTP Interceptor. The Interceptor will intercept outgoing HTTP requests and add the Authorization header with the JWT token obtained from the AuthService.

Press enter or click to view image in full size

auth.interceptor.ts
we implement the HttpInterceptor interface, which allows us to intercept HTTP requests and responses. The intercept() method is called for each outgoing HTTP request. Inside the intercept() method, we get the JWT token from the AuthService using the getAuthToken() method. Then, we clone the request and add the Authorization header with the JWT token using request.clone().

App-Module

In the AppModule, we have to do the following :

Defined the routes for the LoginComponent and the HomeComponent. The AuthGuard is applied to protect the HomeComponent route, ensuring that only authenticated users can access it.

Provided the AuthService, AuthGuard, and AuthInterceptor as providers to make them available throughout the application.

Press enter or click to view image in full size

app.module.ts
Conclusion:

Implementing JWT authentication in Angular with a Spring Boot backend is a powerful way to secure your web application and control access to protected routes. By following the steps outlined in this blog post, you can easily integrate JWT authentication into your Angular application, providing a seamless and secure user experience.



