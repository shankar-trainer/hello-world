public class Student1Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        Student1 student1=null;

        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();

        System.out.println("Enter Student's Name:");
        String name = sc.next();

        System.out.println("Enter Student's address:");
        String address = sc.next();
        boolean flag=true;
        while(flag) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            String ch = sc.next();
            if (ch.equals("Yes")) {
                student1 = new Student1(id, name, address);
                flag=false;
            } else if (ch.equals("No")) {
                System.out.println("Enter the college name:");
                String collegename = sc.next();
                student1 = new Student1(id, name, address, collegename);
                flag=false;
                break;
            } else {
                System.out.println("Wrong Input ");
                flag=true;
            }
        }

        System.out.println("Student id:"+student1.getStudentId());
        System.out.println("Student name:"+student1.getStudentName());
        System.out.println("Address:"+student1.getStudentAddress());
        System.out.println("College name:"+student1.getCollegeName());

    }
}
