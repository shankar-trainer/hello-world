

// client code, must be lightweight
public class BookMain1 {
    public static void main(String[] args) {
        Book book[] = new Book[3];// create array of 3 objects , not created book object
        java.util.Scanner sc=new java.util.Scanner(System.in);

        for (int i = 0; i <book.length ; i++) {
            book[i]=new Book();// object creation
            System.out.println("Enter book isbn name author and cost");
            book[i].isbn=sc.nextInt();
            sc.nextLine();
            book[i].bname=sc.nextLine();
            book[i].author=sc.nextLine();
            book[i].cost=sc.nextFloat();
        }
        for(Book b:book)
            b.bookInfo();

        System.out.println("total cost "+book[0].totalCost(book));
        System.out.println("average cost "+book[0].avgCost(book));
    }
}
