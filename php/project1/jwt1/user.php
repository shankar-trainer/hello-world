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
