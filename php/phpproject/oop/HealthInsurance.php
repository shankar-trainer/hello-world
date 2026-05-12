<?php 
include('Insurance.php');
class HealthInsurance extends Insurance{
   private $premimumAmt;
   private $maturityYear;

   #[Override]
   public function __construct($id, $name, $location,$premimumAmt,$maturityYear)
   {
    $this->premimumAmt=$premimumAmt;
    $this->maturityYear=$maturityYear;
    parent::__construct($id, $name, $location);
   }

public function getHeathInsuranceDetails(){
     $this->getInsuranceDetails();
   echo "<br> premium amt ".$this->premimumAmt;
   echo "<br> maturity  ".$this->maturityYear;

     

}
}
$heath=new HealthInsurance(1,'5 year plan','chennai',20000,12);
$heath->getHeathInsuranceDetails();
