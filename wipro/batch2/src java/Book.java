public class Book {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String bname,author,btype;
        long isbn;
        float cost,final_cost;
        float discount=0;

        System.out.println("Enter book isbn");
        isbn=sc.nextLong();

        System.out.println("Enter book name");
        bname=sc.next();

        System.out.println("Enter book author");
        author=sc.next();
        System.out.println("Enter book cost");
        cost=sc.nextFloat();

        System.out.println("Enter book type from below \n\t1.computer\n\t2.literature\n\t3.children");
        btype=sc.next();

        if(btype.equals("computer"))
            discount=10/100.0f;
        else if(btype.equals("literature"))
            discount=20/100.0f;
        else if(btype.equals("children"))
            discount=30/100.0f;

        final_cost=cost-(cost*discount);

        System.out.println("Book Information");
        System.out.println("\n\tisbn "+isbn);
        System.out.println("\tname "+bname);
        System.out.println("\tauthor "+author);
        System.out.println("\tcost "+cost);
        System.out.println("\tdiscount "+discount);
        System.out.println("\tfinal cost "+final_cost);
    }

}


/*

In Book.java

take isbn, bname, author,cost, btype from user and display it

computer -- 10% discount
literature -- 20%
children   -- 30%







 */