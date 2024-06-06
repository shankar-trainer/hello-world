public class AccountMain {
    public static void main(String[] args) {
/*
        Account account=new Account(1001,"amit kumar",45000,0.05f);
        System.out.println("account data ");
        System.out.println("\t id : "+account.getActId());
        System.out.println("\t name : "+account.getActName());
        System.out.println("\t rate : "+account.getRate());
        System.out.println("\t balance : "+account.getBalance());
       */
        SavingAccount account=new SavingAccount(1001,"amit kumar",45000,0.05f,4,"jaipur");
        System.out.println("account data ");
        System.out.println("\t id : "+account.getActId());
        System.out.println("\t name : "+account.getActName());
        System.out.println("\t rate : "+account.getRate());
        System.out.println("\t balance : "+account.getBalance());
        System.out.println("\t time : "+account.getTime());
        System.out.println("\t interest : "+ account.interest());
        System.out.println("\t location : "+ account.getLocation());
        account.deposit(3000);
        System.out.println("after deposit balance is "+account.getBalance());
        account.withdraw(300);
        System.out.println("after withdraw balance is "+account.getBalance());

    }
}
