# OAuth 2.0 Login Demo

A minimal Spring Boot web application demonstrating OAuth 2.0 authentication using Google.

## Features

* Sign in with Google using OAuth 2.0
* Secure authentication flow powered by Spring Security
* Display authenticated user's profile information:

    * Name
    * Email
    * Profile Picture
* Sign out functionality
* Server-rendered UI using Thymeleaf

## Tech Stack

* Java 21
* Spring Boot 3
* Spring Security OAuth2 Client
* Thymeleaf
* Maven

## Application Flow

1. User lands on the home page.
2. User clicks **Sign in with Google**.
3. Google authenticates the user via OAuth 2.0.
4. After successful authentication, the user is redirected to the profile page.
5. The application displays the user's name, email, and profile picture retrieved from Google.
6. User can securely sign out and return to the home page.

## Running the Application

### Prerequisites

* Java 21+
* Maven
* Google OAuth 2.0 Client Credentials

### Environment Variables

Set the following environment variables:

CLIENT_ID=<your-google-client-id>

CLIENT_SECRET=<your-google-client-secret>

### Run

mvn spring-boot:run

Open:

http://localhost:8080

## Security Notes

* OAuth credentials are loaded from environment variables and are not stored in source control.
* Authentication is handled by Spring Security OAuth2 Client.
* Protected routes require successful authentication.
