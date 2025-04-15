package deadlock.sealed;

import sync.Account;

//public class Account {
 sealed  class Account1 permits  SavingAccount {
}


non-sealed  class SavingAccount extends Account1 {

}
//class DemateAccount extends  Account1{

//}
