public class Manager extends  Person{
// manager is a person
// is-a relationship

    public Manager(int personId, String personName, float personSalary, String location, String state) {
        super(personId, personName, personSalary);
        this.location = location;
        this.state = state;
    }
// generate only getter
    private String location;
    private String state;

    public String getLocation() {
        return location;
    }

    public String getState() {
        return state;
    }

    public static void main(String[] args) {

//        Manager manager=new Manager();
//        manager.personId=90909;
//        manager.personName="suresh kumar";
//        manager.personSalary=90000.00f;
//        manager.location="chennai";
//        manager.state="tamil nadu";
////sout
//        System.out.println("manager data");
//        System.out.println("\t id :"+manager.getPersonId());
//        System.out.println("\t name :"+manager.getPersonName());
//        System.out.println("\t location :"+manager.location);
//        System.out.println("\t state :"+manager.state);
    }
}
