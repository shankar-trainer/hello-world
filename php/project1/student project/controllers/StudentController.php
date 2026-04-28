<?php
require_once __DIR__ . "/../models/Student.php";
class StudentController
{
    private $student;
    public function __construct()
    {
        $this->student = new Student();
    }
    public function addStudent()
    {
        if (isset($_POST['save'])) {
            $name = $_POST['name'];
            $email = $_POST['email'];

            if ($this->student->insert($name, $email)) {
                $_SESSION['success'] = "Student added successfully!";
            } else {
                $_SESSION['error'] = "Failed to add student!";
            }
            header("Location: index.php");
            exit();
        }
    }
    public function viewStudents()
    {
        return $this->student->getAll();
    }
    public function deleteStudent()
    {
        if (isset($_GET['id'])) {
            $this->student->delete($_GET['id']);
            header("Location: index.php?action=view");
        }
    }
    public function editStudent()
    {
        if (isset($_GET['id'])) {
            return $this->student->getById($_GET['id']);
        }
    }
    public function updateStudent()
    {
        if (isset($_POST['update'])) {
            $id = $_POST['id'];
            $name = $_POST['name'];
            $email = $_POST['email'];

            if ($this->student->update($id, $name, $email)) {
                $_SESSION['success'] = "Student updated successfully!";
            } else {
                $_SESSION['error'] = "Update failed!";
            }
            header("Location: index.php?action=view");
            exit();
        }
    }
}
