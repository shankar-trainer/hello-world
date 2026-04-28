<?php
require_once("formcontroller.php");

// $action=$_GET["action"]?? 'show';
$action=$_GET["action"];

if($action==='submit'){
    $controller=new FormController();
    $controller->submit();
}

else {
    include('form.php');
}
?>