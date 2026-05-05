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
