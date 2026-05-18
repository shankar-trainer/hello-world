<?php

class Insurance
{
    protected $id;
    protected $name;
    protected $location;

    public function __construct($id, $name, $location){
        $this->id = $id;
        $this->name = $name;
        $this->location = $location;
    }
    public function getInsuranceDetails(){
        echo "insurannce details  are";
        echo "<br> id ".$this->id;
        echo "<br> name ".$this->name;
        echo "<br> location ".$this->location;
    }

}