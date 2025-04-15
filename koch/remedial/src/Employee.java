import java.io.Serializable;

public class Employee  implements Serializable {
    private  int id;
    private String name;
    transient  private float salary;
    private static String state="tamil nadu";

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        Employee.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
