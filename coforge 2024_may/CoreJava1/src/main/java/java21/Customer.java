public record Customer(int id, String name) {

}

class Main{
    public static void main(String[] args) {
        System.out.println(new Customer(1001,"ram kumar"));
    }
}
