public class Book {

    static{
        System.out.println("static block called");
    }

    Book(){
        System.out.println("constructor called ");
    }

    public static void main(String[] args) {
   new Book();
   new Book();
   new Book();
    }
}
