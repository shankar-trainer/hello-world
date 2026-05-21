<?php
session_start();

if (isset($_POST["id"]) && isset($_POST["name"])) {
    if (empty($_POST["id"])) {
        $_SESSION['id_err'] = "id is blank";
        header('Location:userform.php');
    }
     else if (empty($_POST["name"])) {
        $_SESSION['name_err'] = "name is blank";
        header('Location:userform.php');
    } 
    else {
        $_SESSION['id'] = $_POST['id'];
        $_SESSION['name'] = $_POST['name'];
        
        unset($_SESSION['name_err']);
        unset($_SESSION['id_err']);
        
        header('Location:userdata.php');
    }
}
?>