<?php
require_once __DIR__ . "/../config/Database.php";

class Student extends Database
{

    public function insert($name, $email)
    {
        $stmt = $this->conn->prepare(
            "INSERT INTO students (name, email) VALUES (?, ?)"
        );
        $stmt->bind_param("ss", $name, $email);
        return $stmt->execute();
    }

    public function getAll()
    {
        return $this->conn->query("SELECT * FROM students");
    }

    public function delete($id)
    {
        $stmt = $this->conn->prepare(
            "DELETE FROM students WHERE id = ?"
        );
        $stmt->bind_param("i", $id);
        return $stmt->execute();
    }
    public function getById($id)
    {
        $stmt = $this->conn->prepare(
            "SELECT * FROM students WHERE id = ?"
        );
        $stmt->bind_param("i", $id);
        $stmt->execute();
        return $stmt->get_result()->fetch_assoc();
    }

    public function update($id, $name, $email)
    {
        $stmt = $this->conn->prepare(
            "UPDATE students SET name = ?, email = ? WHERE id = ?"
        );
        $stmt->bind_param("ssi", $name, $email, $id);
        return $stmt->execute();
    }
}
