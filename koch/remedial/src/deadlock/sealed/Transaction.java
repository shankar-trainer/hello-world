package deadlock.sealed;

public record Transaction(int id, String name, float amount) {
}

class MyTransaction{
    public static void main(String[] args) {
        Transaction transaction=new Transaction(10001,"amit kumar",20000);
        System.out.println(transaction.id());
        System.out.println(transaction.name());
        System.out.println(transaction.amount());

        System.out.println(transaction);
    }
}
