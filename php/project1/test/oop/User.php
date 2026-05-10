<?php 
class User{
    public $id;
    public $username;

    public function __construct($id, $username){
       $this->id = $id;
       $this->username = $username;
    }
    public function getDetails(){
     return "id is ".$this->id."<br>name :".$this->username;
    }
}
$u=new User(1001,"suresh kumar");
echo $u->getDetails();
?>