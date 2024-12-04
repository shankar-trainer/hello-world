public class School {

    int regNo;
    String name;
    String location;

    public School() {
        System.out.println("default constructor ");
        this.regNo = 878787;
        this.name = "kasturba gandhi school";
        this.location = "chennai";
    }

    public School(String location, int regNo) {
        this(regNo,"cps",location);
        System.out.println("overloaded  constructor  with 2 argument ");
    }

    public School(int regNo, String name, String location) {
        System.out.println("overloaded  constructor  with 3 argument ");
        this.regNo = regNo;
        this.name = name;
        this.location = location;
    }

    void schoolInfo() {
        System.out.println("\nschool info");
        System.out.println("\tRegNo " + regNo);
        System.out.println("\tName " + name);
        System.out.println("\tLocation " + location);
    }

    public static void main(String[] args) {
        School school[] = new School[3]; // array creation
        School school1 = new School();
        School school2 = new School("kanpur",5665665);

        int regno1[] = {56657667, 7667676, 65655665};
        String nm[] = {"gandhi public school", "vps school", "dps school"};
        String loc[] = {"kolkotta", "aagra", "mathura"};

        for (int i = 0; i < 3; i++) {
            school[i] = new School(regno1[i], nm[i], loc[i]);
        }

        for (School s : school)
            s.schoolInfo();

        school1.schoolInfo();
        school2.schoolInfo();
    }
}
