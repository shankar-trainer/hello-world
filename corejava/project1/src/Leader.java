public class Leader {
    private int id;
    private String   name;
    private int age;

    private Speech speech; // Leader has a speech -- has a relationship

    public Leader(int id, String name, int age, Speech speech) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.speech = speech;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Speech getSpeech() {
        return speech;
    }
}
