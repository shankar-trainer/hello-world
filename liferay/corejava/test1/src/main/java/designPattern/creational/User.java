package designPattern.creational;

class User {
    private int id;
    private String name;

    static User user;

    private User() {
    }

    public static User getUserInstance() {
        if (user == null)
            user = new User();
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

