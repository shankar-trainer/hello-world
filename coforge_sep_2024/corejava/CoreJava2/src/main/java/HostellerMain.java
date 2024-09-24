public class HostellerMain {

    public static Hosteller getHostellerDetails() {
        Hosteller hosteller = new Hosteller();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter the Details:");

        System.out.println("Student Id");
        hosteller.setStudentId(sc.nextInt());

        System.out.println("Student Name");
        sc.nextLine();
        hosteller.setName(sc.nextLine());

        System.out.println("Department Id");
        hosteller.setDepartmentId(sc.nextInt());

        System.out.println("Gender");
        hosteller.setGender(sc.next());

        System.out.println("Phone Number");
        hosteller.setPhone(sc.next());

        System.out.println("Hostel Name");
        hosteller.setHostelName(sc.next());

        System.out.println("Room Number");
        hosteller.setRoomNumber(sc.nextInt());

        System.out.println("Modify Room No (Y\\N) ");

        String choice = sc.next();
        if (choice.equals("Y")) {
            System.out.println("New Room No");
            hosteller.setRoomNumber(sc.nextInt());
        }

        System.out.println("Modify Phone No (Y\\N) ");

        choice = sc.next();
        if (choice.equals("Y")) {
            System.out.println("New Phone No");
            hosteller.setPhone(sc.next());
        }


        return hosteller;
    }

    public static void main(String[] args) {

        Hosteller hosteller = getHostellerDetails();

        System.out.println("The Student Details:");
        System.out.println(hosteller.getStudentId()+" "+hosteller.getName()+" "+ hosteller.departmentId+" "+ hosteller.getGender()+" "+hosteller.getPhone()+" "+hosteller.getHostelName()+" "+ hosteller.getRoomNumber());

    }
}
