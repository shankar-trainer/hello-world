

public class Student1Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Student1 student1=null;
        System.out.println("Enter Student's id");
        int id = sc.nextInt();
        System.out.println("Enter Student's name");
        String name = sc.next();
        System.out.println("Enter Student's address");
        String address = sc.next();
        String res="";
        do {
            System.out.println("Whether student is from NIT(Yes/No)");
            res = sc.next();
            if (res.equalsIgnoreCase("Yes")) {
                student1 = new Student1(id, name, address);
              break;
            }
            else if (res.equalsIgnoreCase("No")) {
                System.out.println("Enter the college name");
                String college1 = sc.next();
                student1 = new Student1(id, name, address, college1);
                break;
            } else {
                System.out.println("Wrong input");
            }
        }
        while(!res.equalsIgnoreCase("Yes") || !res.equalsIgnoreCase("No"));
        System.out.println( "Student id :"+student1.getStudentId());
        System.out.println( "Student name :"+student1.getStudentName());
        System.out.println( "Student address :"+student1.getStudentAddress());
        System.out.println( "College Name :"+student1.getCollegeName());
    }
}
