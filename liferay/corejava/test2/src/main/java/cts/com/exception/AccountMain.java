package cts.com.exception;

public class AccountMain {

    public static void main(String[] args) {
        Account account=new Account();
        try {
            account.setAccountId(0);
            account.setAccountName("");
            account.setAccountLocation("");
            account.setBalance(-90);
            System.out.println("account data ");
            System.out.println(account);
        } catch (AccountException e) {
            System.err.println(e.getMessage());
        }
    }
}
