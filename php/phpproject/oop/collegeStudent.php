<?php
include("Student.php");

class CollegeStudent extends Student
{
    private $fees;
    private $email;
    function __construct($id, $name, $subject, $fees, $email)
    {
        parent::__construct($id, $name, $subject);
        $this->fees = $fees;
        $this->email = $email;
    }

    public function getStudentDetails()
    {
        parent::getStudentDetails();
        echo "<br>  fees  is " . $this->fees;
        echo "<br>  email  is " . $this->email;
    }
}
$student1 = new CollegeStudent(90001, 'hari', 'english', 5000, 'hari@gmail.com');
$student1->getStudentDetails();
// echo Student::getdetails();
echo CollegeStudent::getdetails();
