<?php
// include("Payment.php");
//include("StripePayment.php");

include("Paypalpayment.php");
class PaymentProcessor{
    public function process(Payment $payment,$amt){
      $payment->pay($amt);
    }
}
$pcocessor = new PaymentProcessor();
// $stripe=new StripePayment();
// $pcocessor->process($stripe,10000);

$paypal=new PaypalPayment();

$pcocessor->process($paypal,20000);


?>