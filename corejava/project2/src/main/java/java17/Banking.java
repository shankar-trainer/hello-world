package java17;

public sealed  class Banking permits  SavingBank {

}

final class SavingBank extends Banking{

}

//class CurrentBank extends Banking{

//}

record Transaction(int id, String name, float amount){}

class TransactionMain{
    public static void main(String[] args) {
        Transaction transaction=new Transaction(10001,"payment for product",25000);
        Transaction transaction1=new Transaction(10001,"payment for product",25000);
        System.out.println(transaction);

        System.out.println(transaction.id());
        System.out.println(transaction.name());
        System.out.println(transaction.amount());
        System.out.println(transaction.equals(transaction1));
        System.out.println(transaction.hashCode());
        System.out.println(transaction1.hashCode());

    }
}
