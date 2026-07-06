public class Student {
private    int roll;
 private    String name;
    private   String subject;

    public static void main(String[] args) {
        Student student1=new Student();

        System.out.println("default value of student");
        System.out.println("roll is "+student1.roll);
        System.out.println("name is "+student1.name);
        System.out.println("subject is "+student1.subject);

        student1.roll=100001;
        student1.name="ram kumar";
        student1.subject="math";

        System.out.println("after initialisation value of student1 ");
        System.out.println("roll is "+student1.roll);
        System.out.println("name is "+student1.name);
        System.out.println("subject is "+student1.subject);
    }
}

