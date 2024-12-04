public class Person {

    private int personId;
    private String personName;
    private int personSalary;

    public Person(int personId, String personName, int personSalary) {
        this.personId = personId;
        this.personName = personName;
        this.personSalary = personSalary;
    }

    public int getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public int getPersonSalary() {
        return personSalary;
    }

    public void personInfo() {
        System.out.println("Person Information");
        System.out.println("\tid " + getPersonId());
        System.out.println("\tname " + getPersonName());
        System.out.println("\tsalary " + getPersonSalary());
    }
}
