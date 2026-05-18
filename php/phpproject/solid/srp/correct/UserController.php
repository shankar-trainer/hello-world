<?php 

class UserController{
    public function service($req){
         switch ($req){
         case "mail":
            $data = [];
            new MailService()->sendMail($data);
            break;
         case "repository":
            new UserRepository()->create();
            break;
         }
    }
}

?>