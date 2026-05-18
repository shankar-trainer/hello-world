<?php
include("Account.php");
class SavingAccount extends Account
{

    public function deposit($currency)
    {
        $amt1 = $this->getAmt();
        $amt1 = $amt1 + $currency;
        $this->setAmt($amt1);
    }

    public function withdraw($currency)
    {
        $amt1 = $this->getAmt();
        $amt1 = $amt1 - $currency;
        $this->setAmt($amt1);
    }
}
$act=new SavingAccount(1001,12000,'suresh','chennai');
echo $act->getAccountDetails();
$act->deposit(500);

echo "after deposit account details are ";
echo $act->getAccountDetails();


?>
