<?php 
include("Payment.php");

class PaypalPayment implements Payment{
 public function pay($amt){
 echo "Payment by paypal ".$amt; 
 }
}
?>
