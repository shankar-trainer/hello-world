<?php
class Students{
   public  $roll;
   public  $name;
   public  $subject;
    
   public function __construct($roll1,$name1,$subject1){
       $this->roll=$roll1;
       $this->name=$name1;
       $this->subject=$subject1;
       
   }
    
   public function getStudent(){
       echo "student details<br>";
       echo "<br>roll  ".$this->roll;
       echo "<br>name  ".$this->name;
       echo "<br>subject  ".$this->subject;
   }
}

$student=new Students(1001,'ram kumar','math');
$student->getStudent();
?>