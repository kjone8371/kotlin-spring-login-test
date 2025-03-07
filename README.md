# Spring Kotlin JWT Authentication System

This is a simple yet secure JWT-based authentication system built with Spring Boot and Kotlin. It demonstrates how to handle user authentication and authorization using JSON Web Tokens (JWT). The system is designed to manage access tokens, refresh tokens, and user session management efficiently.

## Features

- **JWT Authentication**: Generates and validates both access and refresh tokens.
- **Token Expiration**: Automatic token expiration handling with the option to refresh the access token.
- **Secure API Endpoints**: Secures routes with token-based authentication, ensuring authorized access.
- **Custom Exception Handling**: Catches and handles authentication and authorization errors gracefully.

## Architecture

The application is built with the following core components:

1. **Authentication**: Handles JWT token generation, validation, and user authentication. 
    - `JwtAuthFilter`: A filter that checks for JWT tokens in requests and validates them.
    - `JwtTokenManager`: Responsible for generating access and refresh tokens.
    - `JwtProvider`: Custom authentication provider that authenticates users based on JWT.

2. **Member Management**: Manages user-related logic, such as registration and user details retrieval.
    - `MemberHolder`: Holds the currently authenticated member.
    - `CreateMemberRequestDto`: DTO used to register a new member.

3. **Security**: Enforces security rules and validates tokens on protected routes.
    - `JwtProperties`: Configurations related to JWT tokens, such as expiration time and secret key.
    - `SecurityContext`: Context for managing the security context of the application.

4. **Global Exception Handling**: Provides custom exception handling for the application.
    - `AuthExceptionDetails`: Enum to define various authentication errors, such as expired tokens or invalid credentials.

## Setup

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/your-username/spring-kotlin-jwt-authentication.git
