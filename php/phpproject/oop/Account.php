<?php
abstract class Account
{
    private $accountId;
    private $amt;
    private $name;
    private $location;

    public function __construct($accountId, $amt, $name, $location)
    {
        $this->amt = $amt;
        $this->accountId = $accountId;
        $this->name = $name;
        $this->location = $location;
    }

    public function getAccountDetails()
    {
        return "<p>account details <br> id " . $this->accountId . "<br>amount " . $this->amt . "<br>name" . $this->name . "<br>location" . $this->location;
    }

    public function getAmt(){
        return $this->amt ;
    }
    public function setAmt($amt){
     $this->amt=$amt ;
    }

    abstract public function deposit($currency);
    abstract public function withdraw($currency);
}
