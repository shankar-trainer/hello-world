package bean;

public class Student {

    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    static Student student;
    public static Student createStudent(){
        if(student==null) {
            student = new Student();
           student.setRoll(1001);
           student.setName("ram kumar");
        }
       return  student;
    }
}
