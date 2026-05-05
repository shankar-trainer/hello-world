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
