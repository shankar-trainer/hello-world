<?php 
require_once __DIR__ . '/config.php'; 
 
class Database { 
    private static $pdo = null; 
 
    public static function getConnection() { 
        if (self::$pdo === null) { 
            $dsn = "mysql:host=" . DB_HOST . ";dbname=" . DB_NAME . ";charset=utf8mb4"; 
            $options = [ 
                PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION, 
                PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC, 
                PDO::ATTR_EMULATE_PREPARES => false, 
            ]; 
            try { 
                self::$pdo = new PDO($dsn, DB_USER, DB_PASS, $options); 
            } catch (PDOException $e) { 
                http_response_code(500); 
                echo json_encode(["error" => "Database connection failed: " . $e->getMessage()]); 
                exit; 
            } 
        } 
        return self::$pdo; 
    } 
} 
?>
