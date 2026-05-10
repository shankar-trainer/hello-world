<?php
class person{
    var $name;
    
     function set_name($name) {
         $this->name=$name;
     }
    
     function get_name() {
         return  $this->name;
     }   
}
 $p=new person();
 $p->set_name('ram kumar');
 echo ('name is '.$p->get_name());

?>