<?php 
class MailService{

    public function sendMail(array $data){

           mail($data["email"],$data["name"],$data[""]);
    }
}
?>