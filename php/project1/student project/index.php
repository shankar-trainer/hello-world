<?php
session_start();
require_once "controllers/StudentController.php";

$controller = new StudentController();
$action = $_GET['action'] ?? '';

if ($action == "view") {
    $students = $controller->viewStudents();
    include "views/view_students.php";
} elseif ($action == "edit") {
    $student = $controller->editStudent();
    include "views/edit_student.php";
} elseif ($action == "update") {
    $controller->updateStudent();
} elseif ($action == "delete") {
    $controller->deleteStudent();
} else {
    $controller->addStudent();
    include "views/add_student.php";
}
