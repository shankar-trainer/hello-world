package com.cts.lambda;

public interface BankingOperation {
//    public static final String name;
    String name="abc ltd";;;;
    String country="india";;;;

    void deposit(float amount);

    void withdraw(float amount);

    default void info(User user){
        System.out.println(user);
    }
    static void bankingInfo(){
        System.out.println(" name "+name);
        System.out.println(" country  "+country);
    }
}

class User implements  BankingOperation{
    private String userName;
    private String userEmail;
    private float balance;

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public float getBalance() {
        return balance;
    }

    public User(String userName, String userEmail, float balance) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.balance = balance;
    }

    @Override
    public void deposit(float amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(float amount) {
        balance-=amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", balance=" + balance +
                '}';
    }
}
class UserMain{
    public static void main(String[] args) {
        User user=new User("amit kumar","amit_k@gmail.com",25000);
        //System.out.println(user);
       user.info(user);

       BankingOperation.bankingInfo();

       user.withdraw(3000);
        System.out.println("after with draw  balance is "+user.getBalance());
       user.deposit(7000);
        System.out.println("after deposit  balance is "+user.getBalance());

    }
}