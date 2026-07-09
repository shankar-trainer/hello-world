import java.util.Scanner;

class Hosteller extends Student2 {
    private String hostelName;
    private int roomNumber;

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}

class Main {
    public static Hosteller getHostellerDetails() {
        Hosteller hosteller = new Hosteller();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        hosteller.setStudentId(scanner.nextInt());
        System.out.println("Student Name");
        hosteller.setName(scanner.next());
        System.out.println("Department Id");
        hosteller.setDepartmentId(scanner.nextInt());

        System.out.println("Gender");
        hosteller.setGender(scanner.next());

        System.out.println("Phone Number");
        hosteller.setPhone(scanner.next());

        System.out.println("Phone Number");
        hosteller.setHostelName(scanner.next());

        System.out.println("Room Number");
        hosteller.setRoomNumber(scanner.nextInt());

        System.out.println("Modify Room Number");
        if (scanner.next().equals("Y"))
            hosteller.setRoomNumber(scanner.nextInt());
        System.out.println("Modify Phone Number");
        if (scanner.next().equals("Y"))
            hosteller.setPhone(scanner.next());

        return hosteller;
    }

    public static void main(String[] args) {
        Hosteller hostellerDetails = getHostellerDetails();
        String s=hostellerDetails.getStudentId()+" "+hostellerDetails.getName()+" "+hostellerDetails.getGender()+" "+hostellerDetails.getPhone()+" "+hostellerDetails.getHostelName()+" "+hostellerDetails.getRoomNumber();
        System.out.println("The Student Details \n"+s);

    }

}