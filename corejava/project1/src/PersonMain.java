public class PersonMain {

    public static void main(String[] args) {

        Person person1 = new Person(10001, "sumit kumar", 20000);

        Person person2 = new Person(10002, "aumit kumar", 80000);
        Person person3 = new Person();

        System.out.println("person data ");
        System.out.println("id " + person1.getPersonId());
        System.out.println("name " + person1.getPersonName());
        System.out.println("salary " + person1.getPersonSalary());

        System.out.println("\n country is " + Person.getCountry());

        System.out.println(Math.PI);
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println(Math.E);

        System.out.println("total created object "+Person.count);
    }

}
