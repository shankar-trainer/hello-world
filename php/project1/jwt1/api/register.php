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
