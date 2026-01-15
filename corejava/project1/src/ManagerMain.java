public class ManagerMain {
    public static void main(String[] args) {
        Manager manager=new Manager(10001,"kamal kumar",20000,"hyderabad","telengana");

        System.out.println("manager data ");
        System.out.println("\t id :"+manager.getPersonId());
        System.out.println("\t name :"+manager.getPersonName());
        System.out.println("\t salary :"+manager.getPersonSalary());
        System.out.println("\t location :"+manager.getLocation());
        System.out.println("\t state :"+manager.getState());


    }

}
