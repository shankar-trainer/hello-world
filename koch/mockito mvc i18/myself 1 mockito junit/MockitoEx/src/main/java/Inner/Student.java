package Inner;

public class Student {

    private int roll;
    private String name;

    private Course course;


    public Student(int roll, String name, Course course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
