<?php

class Student
{
    private $id;
    private $name;
    private $subject;
    // private static $country = 'india';
    static $country = 'india';

    private static $city = 'chennai';

    public function __construct($id, $name, $subject)
    {
        $this->id = $id;
        $this->name = $name;
        $this->subject = $subject;
    }
    public function getStudentDetails()
    {
        echo '<br>id :' . $this->id . '<br>name : ' . $this->name . '<br>subject :' . $this->subject;
        echo '<br>city  :' . self::$city;
        echo '<br>country :' . self::$country;
    }
    public static function getdetails()
    {
        return '<p>city is ' . self::$city . ' <br>country is ' . self::$country . '';
        //return '<p>id  is '.$this->id; // error 

    }
}
//$student = new Student(10001, 'suresh kumar', 'math');
//$student->getStudentDetails();

//echo "<p>country is " . Student::$country;
//echo student::getdetails();
