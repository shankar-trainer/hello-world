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
