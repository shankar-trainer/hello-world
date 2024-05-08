package com.wipro.inheritance;

import java.util.Scanner;

public class HostellerMain {
    static Scanner sc = new Scanner(System.in);

    public static Hosteller getHostellerDetail() {
        Hosteller hosteller = new Hosteller();
        System.out.println("Enter the Details ");

        System.out.println("Student Id ");
        hosteller.setStudentId(sc.nextInt());
        System.out.println("Student Name ");
        sc.nextLine();
        hosteller.setName(sc.nextLine());
        System.out.println("Department Id ");
        hosteller.setDepartmentId(sc.nextInt());

        System.out.println("Gender ");
        hosteller.setGender(sc.next());

        System.out.println("Phone no ");
        hosteller.setPhone(sc.next());

        System.out.println("Hostel Name");
        hosteller.setHostelName(sc.next());

        System.out.println("Room No");
        hosteller.setRoomNumber(sc.nextInt());

        return hosteller;

    }

    public static void main(String[] args) {

        Hosteller hosteller = getHostellerDetail();
        System.out.println("Modify Room No ");
        if (sc.next().equalsIgnoreCase("Y")) {
            System.out.println("New Room No ");
            hosteller.setRoomNumber(sc.nextInt());
        }
        System.out.println("Modify Phone No ");
        if (sc.next().equalsIgnoreCase("Y")) {
            System.out.println("New Phone No ");
            hosteller.setPhone(sc.next());
        }
        System.out.println("The Student Details ");
        System.out.println(hosteller.getStudentId() + "\t" + hosteller.getName() + "\t" + hosteller.getDepartmentId() + "\t" + hosteller.getGender() + "\t" + hosteller.getPhone() + "\t" + hosteller.getHostelName() + "\t" + hosteller.getRoomNumber());
    }
}