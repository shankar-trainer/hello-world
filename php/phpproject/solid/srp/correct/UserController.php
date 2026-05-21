<?php 
      
include("MailService.php");
include("UserRepository.php");

class UserController{
    public function service($req){
         switch ($req){
         case "mail":
            $data = [];
            $mail=new MailService();
            $mail->sendMail($data);
            header("Location:mail.php");
            break;
         case "repository":
            $user=new UserRepository();
            $user->create();
            header("Location:user_data.php");
            break;
         }
    }
}
$user1 = new UserController();
$user1->service("mail");
// $user1->service("repository");
?>
