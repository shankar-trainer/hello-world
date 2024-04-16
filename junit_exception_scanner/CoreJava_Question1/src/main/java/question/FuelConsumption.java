package question;

import java.util.*;
import java.text.*;

class FuelConsumption {
    public static String[] calculateFuelConsumption(double liter, double km) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double gallon = liter * 0.2642;
        double mile = km * 0.6214;

        double literPerKm = (liter / km) * 100;
        double gallonPerKm = mile / gallon;

        String[] res = new String[2];

        res[0] = decimalFormat.format(literPerKm);
        res[1] = decimalFormat.format(gallonPerKm);
        return res;
    }

    public static void test(double value) {
        if (value <= 0) {
            System.out.println((int) value + " is an Invalid Input");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double liter = scanner.nextDouble();
        test(liter);
        System.out.println("Enter the distance covered");
        double km = scanner.nextDouble();
        test(km);
        String[] strings = calculateFuelConsumption(liter, km);

        System.out.println("Liters/100KM");
        System.out.println(strings[0]);
        System.out.println("Miles/gallons");
        System.out.println(strings[1]);
    }
}
