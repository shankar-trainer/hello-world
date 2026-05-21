<?php
class FormController{

    public function submit()
    {
        $id = $_POST['id'];
        $name = $_POST['name'];
        if(empty($id) || empty($name))  {
            echo "enter values in the all form fields ";
            return;
        }
        else {
            echo "sucessfully received id -$id and name -$name";
            return;
        }
    }
}?>