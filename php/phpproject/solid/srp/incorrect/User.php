<?php

class User{
   public function create(array $data){
   $connection=new mysqli('localhost','root','','db4');
   $result= $connection->query("insert into employee value(1001,'suresh ',2000)");

   mail($data["email"],$data["name"],$data[""]);
   }
}


?>