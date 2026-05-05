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
