public class PersonMain {

    public static void main(String[] args) {
        Person person=new Person();
        //person.id=98989;
        person.setId(100001);
        person.setName("aman kumar");
        person.setSalary(56000);

        System.out.println("Person information");

        System.out.println("\tid :"+person.getId());

        System.out.println("\tname :"+person.getName());

        System.out.println("\tid :"+person.getSalary());

    }

}
