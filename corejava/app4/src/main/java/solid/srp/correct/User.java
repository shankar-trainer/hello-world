package solid.srp.correct;

public class User {
    private int userId;
    private String userName;
    private float salary;

    public User(int userId, String userName, float salary) {
        this.userId = userId;
        this.userName = userName;
        this.salary = salary;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public float getSalary() {
        return salary;
    }
}