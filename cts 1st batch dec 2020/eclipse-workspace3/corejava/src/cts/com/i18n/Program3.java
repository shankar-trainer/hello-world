package cts.com.i18n;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ResourceBundle bundle = ResourceBundle.getBundle("message", Locale.FRANCE);

		System.out.println(bundle.getString("n1"));
		int n1 = scanner.nextInt();

		System.out.println(bundle.getString("n2"));

		int n2 = scanner.nextInt();

		int sum = n1 + n2;
		System.out.println(bundle.getString("n3") + sum);

		
	}
}
