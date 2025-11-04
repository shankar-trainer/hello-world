https://github.com/MatheusRobertoSousa/Techcity-API-Angular/tree/main
https://raghuvardhankaranam.medium.com/implementing-jwt-authentication-using-angular-52bc82096b56

Implementing JWT Authentication using Angular
Raghuvardhan Karanam

Follow
6 min read
·
Aug 14, 2023
108


4



Hello, In this blog, we’re diving into the world of web security. We will discuss what JWT Authentication is and how to implement it in Angular.

But first, let’s discuss what is Authentication. When you log into a website, it needs to know it’s really you (that’s authentication) and what you’re allowed to do (that’s authorization). For example, you wouldn’t want just anyone to access your online banking or shopping accounts, right? That’s where JWT comes into the picture.

What is JWT and Why is it a Big Deal?
JWT stands for JSON Web Tokens. Think of these as tiny information packets that help a website know who you are and what you’re allowed to do. These tokens are created when you log in and then sent back and forth between your computer and the website. This helps the website remember your login session.

One big advantage of JWTs is that they’re self-contained. This means all the user data the website needs is packed right into the token. Plus, JWTs are super compact, which helps keep things fast and efficient.

The Building Blocks of JWT: Header, Payload, Signature
JWTs are made up of three parts: a header, a payload, and a signature. Here’s what each part does:

1. Header: This part tells us what kind of token we’re dealing with (which is JWT) and the algorithm used for creating the signature.

2. Payload: This is where the user data is stored. It’s also where you’ll find details about when the token was issued and when it will expire.

3. Signature: Think of the signature as a safety seal. It’s created by taking the encoded header, the encoded payload, and a secret key, then running them through a special algorithm. The resulting signature helps confirm that the token hasn’t been tampered with.

These three parts work together to create a JWT, which is a vital tool in ensuring user data stays secure and website interactions remain smooth.

How JWT Authentication Flow Works
Let’s look at how JWT actually works in practice step by step:

1. Login: You enter your username and password on the website. If the details are correct, the server generates a JWT and sends it back to you.

2. Store and Send: Your browser then stores this token (often in a place called local storage). Every time you visit a new page on the site or request a protected resource, your browser automatically sends the JWT along in the headers of the HTTP request.

3. Verify and Allow: The server gets this request, and the JWT with it. It checks the JWT’s signature to make sure it’s legit and hasn’t been messed with. If everything checks out, the server provides the resources you asked for.

In short, JWT helps websites remember who’s logged in and keeps your session active as you move around the site.

A flowchart showing the step by step process of JWT Authentication
Implementing JWT in Angular using Interceptors
What are Interceptors?
In Angular, Interceptors are like having checkpoints where changes can be made, like adding headers to a request or logging responses from a server. In our case, we’ll use an interceptor to automatically add our JWT to every request that needs it.

Getting the Tools: Installing Necessary Packages
To start working with JWTs in Angular, we’ll need to install a couple of packages. These are some extra tools that Angular needs to handle JWTs. They’re called `@auth0/angular-jwt` and `@angular/common/http`. We can get these using a tool called npm (Node Package Manager) by typing the following in our project directory:

npm install @auth0/angular-jwt @angular/common/http
Creating and Storing a JWT
Creating a JWT usually happens on the server side when a user logs in. After validating the user’s credentials, the server will generate a JWT and send it back. On the client side (in our Angular app), we’ll receive this JWT and need to store it somewhere, usually in local storage. When you receive the response from the server after the user logins, you need to store it in the local storage as shown below:

localStorage.setItem(‘access_token’, JSON.stringify(response.access_token));
This line of code stores the JWT (`response.access_token`) in local storage under the name ‘access_token’.

Making an Interceptor: Injecting the JWT into HTTP Requests
Next, we’ll create an interceptor. Its job is to take the JWT we stored and add it to the header of any HTTP requests that need it. Here’s a simple example:

@Injectable()
export class JwtInterceptor implements HttpInterceptor 
{
  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> 
  {
    let token = localStorage.getItem(‘access_token’);
    if (token) {
      request = request.clone({
        setHeaders: {
          Authorization: `Bearer ${token}`
        }
      });
    }
    return next.handle(request);
  }
 }
This interceptor checks if we have a token in local storage. If we do, it adds that token to the HTTP request’s ‘Authorization’ header.

Registering the HTTP Interceptor in the AppModule
Next, we will register this interceptor in the app module so that the token will be added to all outgoing HTTP requests:

import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { MyInterceptor } from './path-to-your-interceptor-file';

@NgModule({
  imports: [HttpClientModule],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: MyInterceptor,
      multi: true
    }
  ]
})
export class AppModule { }
Staying Fresh: Handling Token Expiration and Refresh
JWTs often have an expiration time for security reasons. But what happens when a token expires? Usually, the server will return a 401 Unauthorized status. When we get that, we can ask the server to give us a new JWT (this is called “refreshing” the token).

Get Raghuvardhan Karanam’s stories in your inbox
Join Medium for free to get updates from this writer.

Subscribe
Handling this refresh depends a lot on how your server is set up. But the key point is to remember that JWTs can expire, and you’ll need a strategy in place to either refresh the token or prompt the user to log in again.

Security Considerations with JWT and Angular
Potential Vulnerabilities
While JWT and Angular can provide a secure framework for authentication, they’re not without potential security concerns.

1. Token Theft: If a JWT is stolen, someone else could use it to impersonate the user. This could be done through cross-site scripting (XSS) attacks where malicious scripts are injected into trusted websites.

2. Weak Secret Key: JWTs depend on a secret key for signing. If this key is not strong enough or gets compromised, it could allow an attacker to create their own valid tokens.

3. Token Storage: JWTs are often stored in local storage, which is vulnerable to XSS attacks. An attacker could potentially retrieve the token from local storage and use it.

Best Practices for Secure Use of JWT
Despite these potential vulnerabilities, there are ways to use JWT securely:

1. Use HTTPS: Always use HTTPS for transferring JWTs between client and server. This encrypts the communication, making it harder for attackers to steal tokens.

2. Strong Secret Key: Use a strong and unique secret key for signing JWTs. Never disclose this key.

3. Token Expiration: Keep the expiration time of JWTs as short as possible. This reduces the window of time an attacker could use a stolen token.

4. Store Tokens Securely: Consider alternatives to local storage for token storage, like HTTP-only cookies. These cannot be accessed by JavaScript, which can prevent XSS attacks.

5. Handle Expiration: Always check the expiration of JWTs and handle expired tokens appropriately. Refresh tokens when necessary but do so securely.

By being aware of these potential vulnerabilities and following best practices, you can ensure a more secure implementation of JWT in Angular.

Conclusion
We started with a basic understanding of JWT — what it is, its structure, and how it functions. We then delved into the role of JWT in the authentication mechanism. Our journey continued with a practical guide to implementing JWT in Angular using Interceptors

JWT plays an indispensable role in creating secure and efficient web applications. It simplifies the authentication and authorization process, improves the user experience, and facilitates seamless navigation between different services — all with high regard for security.

With all this knowledge in your toolkit, it’s now your turn to implement JWT in your Angular applications. Take it one step at a time, don’t be afraid to make mistakes, and keep exploring. Happy coding!

JavaScript
Angular
Authentication
Jwt
Software Development
108


4


Written by Raghuvardhan Karanam
145 followers
·
25 following
Full Stack developer. Angular | .Net | https://raghukaranam.com/


Follow
Responses (4)
Write a response

What are your thoughts?

Cancel
Respond
Smitbhavshar

Feb 28


In Angular 19 we define interceptor like this:
import { HttpInterceptorFn } from '@angular/common/http';
import { inject } from '@angular/core';
export const jwtInterceptor: HttpInterceptorFn = (req, next) => {
const localStorageService =…more
2

Reply

Juan Manuel Luna Blanco

Dec 30, 2023


Y en la nueva versión v17 de angular, que el interceptor sería así
import { HttpInterceptorFn } from '@angular/common/http'
import { JWT_NAME } from '../../../core/const/app.const'
export const JwtInterceptor: HttpInterceptorFn = (req, next) => {
const token = localStorage.getItem(JWT_NAME)
if (token) {
req = req.clone({
setHeaders: {
Authorization: `Bearer ${token}`,
},
})
}
return next(req)
}
¿Cómo configuramos el app.config.ts?
Gtacias de antemano
