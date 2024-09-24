public class UserBook extends Book{
    private float rebate;
    private String btype;

    public float getRebate() {
        return rebate;
    }

    public String getBtype() {
        return btype;
    }

    public UserBook(long isbn, String bname, String author, float cost, float rebate, String btype) {
        super(isbn, bname, author, cost);
        this.rebate = rebate;
        this.btype = btype;
    }
    float finalCost(){
        return  getCost()-(getCost()*getRebate());
    }

    public static void main(String[] args) {

        UserBook userBook=new UserBook(10001,"java for me","s kumar",1200,0.05f,"literature");
        //Book userBook=new UserBook(10001,"java for me","s kumar",1200,0.05f,"literature");

        System.out.println("Book Information ");
        System.out.println("\tisbn :"+userBook.getIsbn());
        System.out.println("\tname :"+userBook.getBname());
        System.out.println("\tauthor :"+userBook.getAuthor());
        System.out.println("\tcost :"+userBook.getCost());
        System.out.println("\trebate :"+userBook.getRebate());
        System.out.println("\ttype :"+userBook.getBtype());
        System.out.println("\tfinal cost after rebate  :"+userBook.finalCost());

    }
}

// in any class default constructor is added if there is no overloaded constructor

// in each constructor there is super() keyword -- call super class default constructor