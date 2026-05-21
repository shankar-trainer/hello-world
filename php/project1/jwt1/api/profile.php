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
