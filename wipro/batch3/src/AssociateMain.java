public class AssociateMain {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);

        Associate associate=new Associate();

        System.out.println("Enter the associate id");
        associate.setAssociateId(sc.nextInt());

        System.out.println("Enter the associate name");
        associate.setAssociateName(sc.next());

        System.out.println("Enter the no of days ");
        associate.trackAssociateStatus(sc.nextInt());

        System.out.println("The associate "+associate.getAssociateName()+" work status "+associate.getWorkStatus());

    }
}
