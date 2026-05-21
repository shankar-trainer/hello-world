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
