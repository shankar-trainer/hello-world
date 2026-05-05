Register User:
post 
http://localhost:8080/project1/jwt1/api/register.php

{
    "name":"ram kumar",
    "email":"ram@gmail.com",
    "password":"abcdef"
    
}
Login User:
post 
http://localhost:8080/project1/jwt1/api/login.php


it will generate tokens 
copy tokens 

Get User Profile:
Get 

http://localhost:8080/project1/jwt1/api/profile.php

add toekns in bearer token 

=================
https://www.codexworld.com/rest-api-with-jwt-authentication-using-php/

Test API Endpoints
You can use tools like Postman or cURL to test the API endpoints you have created. Here are some example requests:

Register User:

`POST /api/register.php` - JSON: `{ "name":"...", "email":"...", "password":"..." }`

Login User:

`POST /api/login.php` - JSON: `{ "email":"...", "password":"..." }` -> returns `{ "token":"...", "expires_in":3600 }`

Get User Profile:

`GET /api/profile.php` - Authorization: `Bearer <token>` -> returns logged-in user details
Update User Profile:

`PUT /api/update.php` - Authorization: `Bearer <token>`, JSON: `{ "name":"...", "email":"..." }` -> update account
Change Password:

`PUT /api/change_password.php` - Authorization: `Bearer <token>`, JSON: `{ "current_password":"...", "new_password":"..." }`
Logout User:

`POST /api/logout.php` - Authorization: `Bearer <token>` -> invalidates token (blacklist)
With these endpoints implemented, you now have a functional RESTful API that supports user registration, authentication, profile management, password updates, and logout functionality using JWT for secure access control.

🛡️ Security Best Practices

CREATE TABLE `users` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(191) NOT NULL,
  `email` VARCHAR(191) NOT NULL UNIQUE,
  `password_hash` VARCHAR(255) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `jwt_blacklist` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `jti` VARCHAR(64) NOT NULL,
  `expires_at` DATETIME NOT NULL,
  `created_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  INDEX (`jti`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

===================================

https://www.codexworld.com/rest-api-with-jwt-authentication-using-php/
https://www.youtube.com/watch?v=hrzzal77Ruk

REST API with JWT Authentication using PHP
By: CodexWorld | In: PHP | Last Updated: Nov 15, 2025
Share

Implementing secure authentication in REST APIs is a must for modern applications. One of the most widely used methods is JWT (JSON Web Token), which allows stateless, scalable authentication without storing sessions on the server.

In this tutorial, you’ll learn how to build a complete REST API with JWT Authentication using Core PHP (without any framework). We’ll cover:

API structure
Database design
User registration API
Login API with JWT generation
Token verification middleware
Protected API endpoints
Token blacklist / logout system
Testing using Postman
What is JWT and Why Use It?
JWT (JSON Web Token) is a compact, URL-safe token used to secure API endpoints.
After the user logs in, the server returns a signed JWT token, and the client must send this token in every request.

A JWT contains three parts:

Header – algorithm and token type
Payload – user data (id, email, roles, etc.)
Signature – verifies integrity
Example:

xxxxx.yyyyy.zzzzz
👉 Using JWT avoids storing sessions, making the API fully stateless and scalable.

🚀 Let’s get started building the Complete REST API with JWT Authentication in PHP!

📁 Folder Structure
Before getting started to build a Complete PHP REST API with MySQL, PDO, JWT Authentication, take a look at the file structure for this project:

rest_api_with_jwt_authentication_in_php/
├── api/
│   ├── _init.php
│   ├── login.php
│   ├── register.php
│   ├── user.php
│   ├── update.php
│   ├── change_password.php
│   └── logout.php
│
├── config.php
├── db.php
├── jwt.php
├── user.php
└── blacklist.php
Step 1: Create Database and Tables
Create a MySQL database (e.g., rest_api_jwt) and then run the following SQL to create the necessary tables: users and jwt_blacklist.

CREATE TABLE `users` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(191) NOT NULL,
  `email` VARCHAR(191) NOT NULL UNIQUE,
  `password_hash` VARCHAR(255) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `jwt_blacklist` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `jti` VARCHAR(64) NOT NULL,
  `expires_at` DATETIME NOT NULL,
  `created_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  INDEX (`jti`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
Step 2: Database and JWT Configuration
Create a config.php file in the root directory to store database and JWT configuration settings.

<?php 
// Database configuration 
define('DB_HOST', 'localhost'); 
define('DB_NAME', 'rest_api_jwt'); 
define('DB_USER', 'root'); 
define('DB_PASS', 'root_pass'); 
 
// JWT secret - change to a long random string in production 
define('JWT_SECRET', 'replace_this_with_a_long_random_secret'); 
// Token lifetime in seconds 
define('JWT_TTL', 3600); 
 
// Optional issuer/audience 
define('JWT_ISS', 'my-php-api'); 
define('JWT_AUD', 'my-php-api-users'); 
 
// Set default timezone 
date_default_timezone_set('UTC'); 
?>
Step 3: Database Connection
Create a db.php file to handle the database connection using PDO.

<?php 
require_once __DIR__ . '/config.php'; 
 
class Database { 
    private static $pdo = null; 
 
    public static function getConnection() { 
        if (self::$pdo === null) { 
            $dsn = "mysql:host=" . DB_HOST . ";dbname=" . DB_NAME . ";charset=utf8mb4"; 
            $options = [ 
                PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION, 
                PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC, 
                PDO::ATTR_EMULATE_PREPARES => false, 
            ]; 
            try { 
                self::$pdo = new PDO($dsn, DB_USER, DB_PASS, $options); 
            } catch (PDOException $e) { 
                http_response_code(500); 
                echo json_encode(["error" => "Database connection failed: " . $e->getMessage()]); 
                exit; 
            } 
        } 
        return self::$pdo; 
    } 
} 
?>
Step 4: JWT Helper Functions
Create a jwt.php file to handle JWT creation and verification using PHP.

We will use PHP’s OpenSSL to generate and verify JWT tokens:

Function to base64UrlEncode data
Function to base64UrlDecode data
Function to encode JWT token
Function to decode JWT token
Function to generate JWT token for user authentication
<?php 
require_once __DIR__ . '/config.php'; 
 
function base64url_encode($data) { 
    return rtrim(strtr(base64_encode($data), '+/', '-_'), '='); 
} 
 
function base64url_decode($data) { 
    $remainder = strlen($data) % 4; 
    if ($remainder) { 
        $padlen = 4 - $remainder; 
        $data .= str_repeat('=', $padlen); 
    } 
    return base64_decode(strtr($data, '-_', '+/')); 
} 
 
function jwt_encode(array $payload, $secret = JWT_SECRET) { 
    $header = ['alg' => 'HS256', 'typ' => 'JWT']; 
    $header_encoded = base64url_encode(json_encode($header)); 
    $payload_encoded = base64url_encode(json_encode($payload)); 
    $signature = hash_hmac('sha256', "$header_encoded.$payload_encoded", $secret, true); 
    $signature_encoded = base64url_encode($signature); 
    return "$header_encoded.$payload_encoded.$signature_encoded"; 
} 
 
function jwt_decode($token, $secret = JWT_SECRET) { 
    $parts = explode('.', $token); 
    if (count($parts) !== 3) { 
        return null; 
    } 
    list($header_b64, $payload_b64, $sig_b64) = $parts; 
    $header = json_decode(base64url_decode($header_b64), true); 
    $payload = json_decode(base64url_decode($payload_b64), true); 
    $sig = base64url_decode($sig_b64); 
 
    if (!$header || !$payload) return null; 
 
    $signed = hash_hmac('sha256', "$header_b64.$payload_b64", $secret, true); 
    if (!hash_equals($signed, $sig)) { 
        return null; 
    } 
 
    // check exp 
    if (isset($payload['exp']) && time() > $payload['exp']) { 
        return null; 
    } 
 
    return $payload; 
} 
 
function create_jwt_for_user($userId) { 
    $now = time(); 
    $jti = bin2hex(random_bytes(16)); 
    $payload = [ 
        'iat' => $now, 
        'nbf' => $now, 
        'exp' => $now + JWT_TTL, 
        'iss' => JWT_ISS, 
        'aud' => JWT_AUD, 
        'sub' => $userId, 
        'jti' => $jti 
    ]; 
    return ['token' => jwt_encode($payload), 'payload' => $payload]; 
} 
?>
Step 5: JWT Blacklist Management
Create a blacklist.php file to manage blacklisted JWTs. This JWTBlacklist class will interact with the database to add and check blacklisted JWTs.

<?php 
require_once __DIR__ . '/db.php'; 
 
class JWTBlacklist { 
    private $db; 
 
    public function __construct() { 
        $this->db = Database::getConnection(); 
    } 
 
    public function add($jti, $expiresAt) { 
        $sql = "INSERT INTO jwt_blacklist (jti, expires_at, created_at) VALUES (:jti, :expires_at, NOW())"; 
        $stmt = $this->db->prepare($sql); 
        $params = [ 
            'jti' => trim((string)$jti), 
            'expires_at' => date('Y-m-d H:i:s', (int)$expiresAt) 
        ]; 
        return $stmt->execute($params); 
    } 
 
    public function isBlacklisted($jti) { 
        $jti = trim((string)$jti); 
        if ($jti === '') return false; 
        $sql = "SELECT id FROM jwt_blacklist WHERE jti = :jti AND expires_at > NOW() LIMIT 1"; 
        $stmt = $this->db->prepare($sql); 
        $stmt->execute(['jti' => $jti]); 
        return (bool) $stmt->fetch(); 
    } 
 
    // optional: cleanup expired entries 
    public function cleanup() { 
        $sql = "DELETE FROM jwt_blacklist WHERE expires_at <= NOW()"; 
        $this->db->exec($sql); 
    } 
} 
?>
Step 6: Database Handler for User Management
Create a user.php file to handle database interactions related to user management. This UserModel class will provide methods to create new users and retrieve user information.

<?php 
require_once __DIR__ . '/db.php'; 
 
class UserModel { 
    private $db; 
 
    public function __construct() { 
        $this->db = Database::getConnection(); 
    } 
 
    public function create($name, $email, $password) { 
        $hash = password_hash($password, PASSWORD_DEFAULT); 
        $sql = "INSERT INTO users (name, email, password_hash, created_at, updated_at) VALUES (:name, :email, :hash, NOW(), NOW())"; 
        $stmt = $this->db->prepare($sql); 
        $stmt->execute([':name' => $name, ':email' => $email, ':hash' => $hash]); 
        return $this->getById($this->db->lastInsertId()); 
    } 
 
    public function getByEmail($email) { 
        $sql = "SELECT id, name, email, password_hash, created_at, updated_at FROM users WHERE email = :email"; 
        $stmt = $this->db->prepare($sql); 
        $stmt->execute([':email' => $email]); 
        return $stmt->fetch(); 
    } 
 
    public function getById($id) { 
        $sql = "SELECT id, name, email, created_at, updated_at FROM users WHERE id = :id"; 
        $stmt = $this->db->prepare($sql); 
        $stmt->execute([':id' => $id]); 
        return $stmt->fetch(); 
    } 
 
    public function update($id, $name, $email) { 
        $sql = "UPDATE users SET name = :name, email = :email, updated_at = NOW() WHERE id = :id"; 
        $stmt = $this->db->prepare($sql); 
        $stmt->execute([':name' => $name, ':email' => $email, ':id' => $id]); 
        return $this->getById($id); 
    } 
 
    public function changePassword($id, $newPassword) { 
        $hash = password_hash($newPassword, PASSWORD_DEFAULT); 
        $sql = "UPDATE users SET password_hash = :hash, updated_at = NOW() WHERE id = :id"; 
        $stmt = $this->db->prepare($sql); 
        $stmt->execute([':hash' => $hash, ':id' => $id]); 
        return $this->getById($id); 
    } 
} 
?>
Step 7: API Initializer with CORS and Helper Functions
Create a api/_init.php file to define Basic CORS and JSON headers for API responses.

Some helper functions are also included for:

Send JSON responses
Get JSON data from requests
Extract JWT from authorization header
Get bearer token from authorization header
Validate authorization header and bearer token
Basic input validation functions (email, password, name)
<?php 
// Shared initializer for API endpoints 
require_once __DIR__ . '/../config.php'; 
require_once __DIR__ . '/../db.php'; 
require_once __DIR__ . '/../jwt.php'; 
require_once __DIR__ . '/../blacklist.php'; 
require_once __DIR__ . '/../user.php'; 
 
// Basic CORS and JSON headers (adjust allowed origin in production) 
header('Content-Type: application/json; charset=utf-8'); 
header('Access-Control-Allow-Origin: *'); 
header('Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS'); 
header('Access-Control-Allow-Headers: Content-Type, Authorization'); 
 
if ($_SERVER['REQUEST_METHOD'] === 'OPTIONS') { 
    http_response_code(200); 
    exit; 
} 
 
function send_json($data, $status = 200) { 
    http_response_code($status); 
    echo json_encode($data); 
    exit; 
} 
 
function get_json_input() { 
    $raw = file_get_contents('php://input'); 
    if (!$raw) return []; 
    $data = json_decode($raw, true); 
    if (json_last_error() !== JSON_ERROR_NONE) { 
        send_json(['error' => 'Invalid JSON'], 400); 
    } 
    return $data; 
} 
 
function get_authorization_header() { 
    // Try common server vars 
    if (!empty($_SERVER['HTTP_AUTHORIZATION'])) { 
        return trim($_SERVER['HTTP_AUTHORIZATION']); 
    } 
    if (!empty($_SERVER['REDIRECT_HTTP_AUTHORIZATION'])) { 
        return trim($_SERVER['REDIRECT_HTTP_AUTHORIZATION']); 
    } 
    // Fallback to apache_request_headers if available 
    if (function_exists('apache_request_headers')) { 
        $headers = apache_request_headers(); 
        if (!empty($headers['Authorization'])) return trim($headers['Authorization']); 
        if (!empty($headers['authorization'])) return trim($headers['authorization']); 
    } 
    return null; 
} 
 
function get_bearer_token() { 
    $auth = get_authorization_header(); 
    if (!$auth) return null; 
    if (preg_match('/Bearer\s+(.*)$/i', $auth, $matches)) { 
        return $matches[1]; 
    } 
    return null; 
} 
 
function require_auth() { 
    $token = get_bearer_token(); 
    if (!$token) { 
        send_json(['error' => 'Authorization header missing'], 401); 
    } 
    $payload = jwt_decode($token); 
    if (!$payload) { 
        send_json(['error' => 'Invalid or expired token'], 401); 
    } 
    $blacklist = new JWTBlacklist(); 
    if ($blacklist->isBlacklisted($payload['jti'] ?? '')) { 
        send_json(['error' => 'Token revoked'], 401); 
    } 
    return $payload; 
} 
 
// Basic validators 
function validate_email($email) { 
    return filter_var($email, FILTER_VALIDATE_EMAIL) !== false; 
} 
 
function validate_password($password) { 
    return is_string($password) && strlen($password) >= 6; 
} 
 
function validate_name($name) { 
    return is_string($name) && strlen(trim($name)) >= 2; 
} 
?>
Step 8: User Registration Endpoint
Create a api/register.php file to handle user registration requests. This endpoint will accept user details, validate them, hash the password, and store the new user in the database.

Include the API initializer
Get JSON input from the request
Validate the name, email, and password
Check if the email is already registered
Create a new user and store it in the database
Return a success message upon successful registration
<?php 
require_once __DIR__ . '/_init.php'; 
 
$input = get_json_input(); 
$name = trim($input['name'] ?? ''); 
$email = trim($input['email'] ?? ''); 
$password = $input['password'] ?? ''; 
 
if (!validate_name($name) || !validate_email($email) || !validate_password($password)) { 
    send_json(['error' => 'Invalid input: name, valid email and password (min 6 chars) required'], 422); 
} 
 
$userModel = new UserModel(); 
if ($userModel->getByEmail($email)) { 
    send_json(['error' => 'Email already in use'], 409); 
} 
 
try { 
    $user = $userModel->create($name, $email, $password); 
    send_json(['user' => $user], 201); 
} catch (Exception $e) { 
    send_json(['error' => 'Registration failed', 'details' => $e->getMessage()], 500); 
} 
?>
Step 9: User Login Endpoint
Create a api/login.php file to handle user login requests. This endpoint will verify user credentials and return a JWT upon successful authentication.

Include the API initializer
Get JSON input from the request
Validate the email and password
Check if the user exists and verify the password
Generate and return a JWT for authenticated sessions
<?php 
require_once __DIR__ . '/_init.php'; 
 
$input = get_json_input(); 
$email = trim($input['email'] ?? ''); 
$password = $input['password'] ?? ''; 
 
if (!validate_email($email) || !validate_password($password)) { 
    send_json(['error' => 'Email and password are required (password min 6 chars)'], 422); 
} 
 
$userModel = new UserModel(); 
$user = $userModel->getByEmail($email); 
if (!$user || !password_verify($password, $user['password_hash'])) { 
    send_json(['error' => 'Invalid credentials'], 401); 
} 
 
$jwt = create_jwt_for_user($user['id']); 
send_json(['token' => $jwt['token'], 'expires_in' => JWT_TTL]); 
?>
Step 10: Protected Endpoint – User Profile
Create a api/profile.php file to provide a protected endpoint that returns the authenticated user’s profile information. This endpoint will require a valid JWT for access.

Include the API initializer
Authenticate the request using the JWT
Retrieve and return the user’s profile information
<?php 
// include initialization file 
require_once __DIR__ . '/_init.php'; 
 
// authenticate request 
$payload = require_auth(); 
$userModel = new UserModel(); 
$user = $userModel->getById($payload['sub']); 
if (!$user) { 
    send_json(['error' => 'User not found'], 404); 
} 
 
// return user profile 
send_json(['user' => $user]); 
?>
Step 11: Protected Endpoint – Update User Profile
Create a api/update.php file to provide a protected endpoint that allows users to update their profile information. This endpoint will require a valid JWT for access.

Include the API initializer
Authenticate the request using the JWT
Get JSON input from the request
Validate and update the user’s profile information
Return the updated user profile
<?php 
// include initialization file 
require_once __DIR__ . '/_init.php'; 
 
// authenticate request 
$payload = require_auth(); 
$input = get_json_input(); 
$name = trim($input['name'] ?? ''); 
$email = trim($input['email'] ?? ''); 
 
// validate inputs 
if (!validate_name($name) || !validate_email($email)) { 
    send_json(['error' => 'Name and valid email required'], 422); 
} 
 
$userModel = new UserModel(); 
// Prevent updating to an email already used by another account 
$existing = $userModel->getByEmail($email); 
if ($existing && $existing['id'] != $payload['sub']) { 
    send_json(['error' => 'Email already in use by another account'], 409); 
} 
 
// update user profile 
try { 
    $user = $userModel->update($payload['sub'], $name, $email); 
    send_json(['user' => $user]); 
} catch (Exception $e) { 
    send_json(['error' => 'Update failed', 'details' => $e->getMessage()], 500); 
} 
?>
Step 12: Protected Endpoint – Update Password
Create a api/change_password.php file to provide a protected endpoint that allows users to update their password. This endpoint will require a valid JWT for access.

Include the API initializer
Authenticate the request using the JWT
Get JSON input from the request
Validate the current and new passwords
Verify the current password and update to the new password
Return a success message upon successful password change
<?php 
// include initialization file 
require_once __DIR__ . '/_init.php'; 
 
// authenticate request 
$payload = require_auth(); 
$input = get_json_input(); 
$current = $input['current_password'] ?? ''; 
$new = $input['new_password'] ?? ''; 
if (!$current || !validate_password($new)) { 
    send_json(['error' => 'Current password and new password (min 6 chars) are required'], 422); 
} 
 
// verify current password 
$db = Database::getConnection(); 
$stmt = $db->prepare('SELECT password_hash FROM users WHERE id = :id'); 
$stmt->execute([':id' => $payload['sub']]); 
$row = $stmt->fetch(); 
if (!$row || !password_verify($current, $row['password_hash'])) { 
    send_json(['error' => 'Current password is incorrect'], 401); 
} 
 
// update password 
$userModel = new UserModel(); 
try { 
    $user = $userModel->changePassword($payload['sub'], $new); 
    send_json(['user' => $user]); 
} catch (Exception $e) { 
    send_json(['error' => 'Password change failed', 'details' => $e->getMessage()], 500); 
} 
?>
Step 13: Logout Endpoint
Create a api/logout.php file to handle user logout requests. This endpoint will invalidate the JWT on the client side.

Include the API initializer
Authenticate the request using the JWT
Extract the token’s JTI (JWT ID) and expiration time
Add the token’s JTI to the blacklist to invalidate it
Return a success message indicating logout
<?php 
// include initialization file 
require_once __DIR__ . '/_init.php'; 
 
// authenticate request 
$payload = require_auth(); 
$blacklist = new JWTBlacklist(); 
$jti = $payload['jti'] ?? null; 
$exp = $payload['exp'] ?? time(); 
if (!$jti) { 
    send_json(['error' => 'Token missing jti'], 400); 
} 
 
// add token to blacklist 
try { 
    $blacklist->add($jti, $exp); 
    send_json(['message' => 'Logged out']); 
} catch (Exception $e) { 
    send_json(['error' => 'Logout failed', 'details' => $e->getMessage()], 500); 
} 
?>
Test API Endpoints
You can use tools like Postman or cURL to test the API endpoints you have created. Here are some example requests:

Register User:

`POST /api/register.php` - JSON: `{ "name":"...", "email":"...", "password":"..." }`
Login User:

`POST /api/login.php` - JSON: `{ "email":"...", "password":"..." }` -> returns `{ "token":"...", "expires_in":3600 }`
Get User Profile:

`GET /api/profile.php` - Authorization: `Bearer <token>` -> returns logged-in user details
Update User Profile:

`PUT /api/update.php` - Authorization: `Bearer <token>`, JSON: `{ "name":"...", "email":"..." }` -> update account
Change Password:

`PUT /api/change_password.php` - Authorization: `Bearer <token>`, JSON: `{ "current_password":"...", "new_password":"..." }`
Logout User:

`POST /api/logout.php` - Authorization: `Bearer <token>` -> invalidates token (blacklist)
With these endpoints implemented, you now have a functional RESTful API that supports user registration, authentication, profile management, password updates, and logout functionality using JWT for secure access control.

🛡️ Security Best Practices
To harden your API:
✔ Always use HTTPS
✔ Keep JWT secret key private
✔ Use short token expiration
✔ Validate inputs to avoid SQL injection
✔ Implement throttling / rate-limiting
✔ Refresh tokens (optional improvement)

Conclusion
You have successfully built a RESTful API in PHP with JWT-based authentication. This API allows users to register, log in, manage their profiles, change passwords, and log out securely. You can further enhance this API by adding more features or integrating it with a frontend application.

With this PHP script, you have a fully working, framework-independent REST API with JWT Authentication, including:
✔ User registration
✔ Secure login
✔ JWT generation & validation
✔ Middleware for protected routes
✔ Logout via token blacklist

This API structure is scalable and production-ready with minor enhancements like refresh tokens and HTTPS. Happy coding! 🚀
