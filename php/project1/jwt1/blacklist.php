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
