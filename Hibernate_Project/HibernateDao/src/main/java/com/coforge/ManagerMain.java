package com.coforge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;

import com.coforge.dao.ManagerDao;
import com.coforge.dao.ManagerDaoImpl;
import com.coforge.exception.ManagerException;
import com.coforge.model.Manager;

public class ManagerMain {

    public static void main(String[] args) {
        Manager manager;
        ManagerDao dao = new ManagerDaoImpl();

        Scanner scanner = new Scanner(System.in);
        String ch = "y";
        while (ch.equals("y")) {
            System.out.println("1.Add Manager");
            System.out.println("2.Show All Manager");
            System.out.println("3.Search  Manager ");
            System.out.println("4.Delete  Manager ");
            System.out.println("5.Update  Manager ");
            int op = scanner.nextInt();

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String date = null;
            try {
                switch (op) {
                    case 1:
                        manager = null;
                        manager = new Manager();
                        //System.out.println("enter id, name, salary  and dob(dd-MM-yyyy)");
                        System.out.println("enter  name, salary  and dob(dd-MM-yyyy)");
                        //manager.setManagerId(scanner.nextLong());
                        scanner.nextLine();
                        manager.setMangerName(scanner.nextLine());
                        manager.setSalary(scanner.nextFloat());
                        date = scanner.next();

                        LocalDate parsedDate = LocalDate.parse(date, dateTimeFormatter);

                        manager.setDob(parsedDate);
                        dao.addManager(manager);

                        break;
                    case 2:
                        dao.getAllManagers().forEach(a -> System.out.println(a));
                        break;
                    case 3:
                        System.out.println("enter id to search ");
                        Manager manager1 = dao.searchManager(scanner.nextLong());
                        System.out.println(manager1);
                        break;
                    case 4:
                        System.out.println("enter id to deleted ");
                        Manager manager2 = dao.deleteManager(scanner.nextLong());
                        System.out.println("manager deleted " + manager2);
                        break;
                    case 5:
                        manager = null;
                        manager = new Manager();
                        //System.out.println("enter id, name, salary  and dob(dd-MM-yyyy)");
                        System.out.println("name, salary  and dob(dd-MM-yyyy)");
                        //manager.setManagerId(scanner.nextLong());
                        //scanner.nextLine();
                        manager.setMangerName(scanner.nextLine());
                        manager.setSalary(scanner.nextFloat());
                        date = scanner.next();

                        parsedDate = LocalDate.parse(date, dateTimeFormatter);

                        manager.setDob(parsedDate);
                        Manager manager3 = dao.updateManager(manager);
                        System.out.println("Manager updated " + manager3);
                        break;

                    default:
                        System.out.println("wrong operation");
                        break;
                }
            } catch (ManagerException e) {
                System.err.println(e.getMessage());
            }
            System.out.println("continue y\\n");
            ch = scanner.next();
        }
    }

}
