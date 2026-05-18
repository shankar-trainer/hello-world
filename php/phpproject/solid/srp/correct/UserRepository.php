<?php
class UserRepository{
 public function create(){
   $connection=new mysqli('localhost','root','','db4');
   $result= $connection->query("insert into employee value(1001,'suresh kumar',2000)");
 }
}

?>