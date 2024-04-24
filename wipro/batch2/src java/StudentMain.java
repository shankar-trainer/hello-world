public class StudentMain {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int id;
        String name;
        String address;
        String collegeName;

        Student student=null;
        String ch="Yes";

        System.out.println("Enter Student's Id :");
        id = sc.nextInt();

        System.out.println("Enter Student's Name :");
        name = sc.next();

        System.out.println("Enter Student's Address :");
        address = sc.next();
         boolean flag=true;
        while (flag) {
            System.out.println("Whether the  Student is from NIT(Yes/No) :");
            ch = sc.next();
            if (ch.equalsIgnoreCase("Yes")) {
                student = new Student(id, name, address);
                flag=false;
            } else if (ch.equalsIgnoreCase("No")) {
                System.out.println("Enter the college name :");
                collegeName = sc.next();
                student = new Student(id, name, address, collegeName);
                flag=false;
            } else {
                System.out.println("Wrong  Input ");
                flag=true;
            }
        }
        System.out.println("Student id :"+student.getStudentId());
        System.out.println("Student name :"+student.getStudentName());
        System.out.println("Address:"+student.getStudentAddress());
        System.out.println("College name:"+student.getCollegeName());
    }
}
