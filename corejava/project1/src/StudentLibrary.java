// child, derived, subclass
public class StudentLibrary extends  Library {
   private int members;
   private float fee;

    public StudentLibrary(int members, float fee) {
        this.members = members;
        this.fee = fee;
    }

    public static void main(String[] args) {

        StudentLibrary studentLibrary=new StudentLibrary(200,350.67f);
        studentLibrary.libraryId=767676;
        studentLibrary.libraryName="pg student library";
        studentLibrary.libraryLocation="gr noida";

        studentLibrary.libraryInfo();
        System.out.println("fees :"+studentLibrary.fee);
        System.out.println("total members :" + studentLibrary.members);
    }

}
