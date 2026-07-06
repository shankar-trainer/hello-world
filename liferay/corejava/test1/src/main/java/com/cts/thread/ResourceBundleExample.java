package com.cts.thread;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.stream.Stream;

public class ResourceBundleExample {

    public static void main(String[] args) {
        Locale locale = Locale.US;
        System.out.println(locale.getCountry() + "\t" + locale.getDisplayLanguage());
        locale = new Locale("hi", "IN");
        locale = new Locale("te", "IN");
        System.out.println(locale.getCountry() + "\t" + locale.getDisplayLanguage());

        Locale[] availableLocales = Locale.getAvailableLocales();
        Stream<Locale> localeStream = Locale.availableLocales();

// localeStream.forEach(a-> System.out.println(a.getCountry()+"\t"+a.getDisplayLanguage()));

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        String id = resourceBundle.getString("id");
        String name = resourceBundle.getString("name");

        System.out.println(id);
        System.out.println(name);
        Scanner scanner = new Scanner(System.in);

        int id1 = scanner.nextInt();
        scanner.nextLine();
        String nm = scanner.nextLine();

        System.out.println(resourceBundle.getString("result.id") + "  " + id1);
        System.out.println(resourceBundle.getString("result.name") + "  " + nm);

        //=================================== in french

        resourceBundle = ResourceBundle.getBundle("message",Locale.FRANCE);
        id = resourceBundle.getString("id");
        name = resourceBundle.getString("name");

        System.out.println(id);
        System.out.println(name);

        id1 = scanner.nextInt();
        scanner.nextLine();
        nm = scanner.nextLine();

        System.out.println(resourceBundle.getString("result.id") + "  " + id1);
        System.out.println(resourceBundle.getString("result.name") + "  " + nm);


    }

}
