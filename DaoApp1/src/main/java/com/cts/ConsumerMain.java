package com.cts;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Optional;
import java.util.Scanner;

import com.cts.dao.ConsumerDao;
import com.cts.exception.ConsumerException;
import com.cts.model.Consumer;
import com.cts.util.ApplicationUtil;

public class ConsumerMain {

	public static void main(String[] args) {
		String s = "y";
		Scanner scanner = new Scanner(System.in);
		ConsumerDao dao;
		try {
			dao = new ConsumerDao();

			while (s.equals("y")) {

				System.out.println("1.Add Record");
				System.out.println("2.Remove Record");
				System.out.println("3.Search Record");
				System.out.println("4.Update Record");
				System.out.println("5.Show All Record");
				int op = scanner.nextInt();
				Consumer consumer1 = null;

				switch (op) {
				case 1:
					consumer1 = null;
					consumer1 = new Consumer();
					System.out.println("Enter id ");
					consumer1.setId(scanner.nextInt());

					System.out.println("Enter name ");
					scanner.nextLine();
					consumer1.setName(scanner.nextLine());

					System.out.println("Enter salary");
					consumer1.setSalary(scanner.nextFloat());

					System.out.println("Enter dob in dd-MM-yyyy");
					String string = scanner.next();

					consumer1.setDob(ApplicationUtil.checkDateFormat(string));
					Consumer addConsumer;
					try {
						addConsumer = dao.addConsumer(consumer1);
						if (addConsumer != null) {
							System.out.println("Record added with values ");
							System.out.println(addConsumer.getId() + "  " + addConsumer.getName() + "  "
									+ addConsumer.getSalary() + "  " + addConsumer.getDob());
						}
					} catch (ConsumerException e) {
						System.err.println(e.getMessage());
					}

					/*
					 * else System.out.println("Record alreday present");
					 */
					break;

				case 2:
					consumer1 = null;
					consumer1 = new Consumer();
					System.out.println("Enter id ");
					consumer1.setId(scanner.nextInt());
					try {
						Consumer deleteConsumer = dao.deleteConsumer(consumer1);

						if (deleteConsumer != null) {
							System.out.println("Record delete  with values ");
							System.out.println(deleteConsumer.getId() + "  " + deleteConsumer.getName() + "  "
									+ deleteConsumer.getSalary() + "  " + deleteConsumer.getDob());
						}
					} catch (ConsumerException e) {
						System.err.println(e.getMessage());
					}
					// else
					// System.out.println("Record Not present");
					break;

				case 3:
					consumer1 = null;
					consumer1 = new Consumer();
					System.out.println("Enter id to search");
					consumer1.setId(scanner.nextInt());
					Consumer consumer2 = null;
					try {
						consumer2 = dao.searchConsumer(consumer1);
						// if (consumer2 == null)
						// System.out.println("consumer not found");
						if (consumer2 != null) {
							System.out.println("consumer found");
							System.out.println(consumer2.getId() + " " + consumer2.getName() + "  "
									+ consumer2.getSalary() + "  " + consumer2.getDob());
						}
					} catch (ConsumerException e) {
						System.err.println(e.getMessage());
					}
					break;

				case 4:
					consumer1 = null;
					consumer1 = new Consumer();
					System.out.println("Enter id ");
					consumer1.setId(scanner.nextInt());

					System.out.println("Enter name ");
					scanner.nextLine();
					consumer1.setName(scanner.nextLine());

					System.out.println("Enter salary");
					consumer1.setSalary(scanner.nextFloat());

					System.out.println("Enter dob in dd-MM-yyyy");
					string = scanner.next();

					consumer1.setDob(ApplicationUtil.checkDateFormat(string));
					try {
						Consumer updateConsumer = dao.updateConsumer(consumer1);

						if (updateConsumer != null) {
							System.out.println("Record updated with values ");
							System.out.println(updateConsumer.getId() + "  " + updateConsumer.getName() + "  "
									+ updateConsumer.getSalary() + "  " + updateConsumer.getDob());
						}
					} catch (ConsumerException e) {
						System.err.println(e.getMessage());
					}
					// else
					// System.out.println("Record not alreday present");
					break;

				case 5:
					try {
						for (Consumer consumer : dao.getAllConsumer())
							System.out.println(consumer.getId() + "  " + consumer.getName() + "  "
									+ consumer.getSalary() + "  " + consumer.getDob());
					} catch (ConsumerException e) {
						System.err.println(e.getMessage());
					}
					break;

				default:
					break;
				}
				System.out.println("continue y\\n");
				s = scanner.next();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			System.out.println("date not in dd-MM-yyyy format");
		}
	}
}
