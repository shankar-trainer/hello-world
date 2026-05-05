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
