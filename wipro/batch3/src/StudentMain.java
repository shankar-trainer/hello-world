public class StudentMain {
    public static void main(String[] args) {
        Student  st1=new Student();
        //st1.roll=0;// error
        //st1.name="";
        //st1.marks=-67.6f;

        st1.setRoll(10001);
        st1.setName("ram kumar");
        st1.setMarks(78);

        System.out.println("student details ");
        System.out.println("\ttoll :"+st1.getRoll());
        System.out.println("\tname :"+st1.getName());
        System.out.println("\tmarks :"+st1.getMarks());
    }
}
