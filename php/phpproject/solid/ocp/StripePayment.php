<?php 
include("Payment.php");

class StripePayment implements Payment{
 public function pay($amt){
 echo "Payment by stripe ".$amt; 
 }
}
?>
