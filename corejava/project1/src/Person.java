public class Person {
    private int personId;
    private  String  personName;
    private float  personSalary;

   private static String country;
   static int count=0;
    static{
        country="India";
        System.out.println("static block called");
    }

    public Person() {
        count++;
        System.out.println("constructor called ");
    }

    public Person(int personId, String personName, float personSalary) {
        count++;
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

    public float getPersonSalary() {
        return personSalary;
    }

    public static String getCountry() {
        return country;
    }
    //
//    public static void main(String[] args) {
//
//    }
}
