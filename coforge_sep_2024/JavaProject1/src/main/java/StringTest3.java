public class StringTest3 {

    public static void main(String[] args) {

        String s1="we all are indian";

        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));

        char[] charArray = s1.toCharArray();

        System.out.println(charArray[0]);
        System.out.println(charArray[1]);
        System.out.println(charArray[2]);

        String email="coforge_ram@gmail.com";
        System.out.println(email.endsWith(".com"));
        System.out.println(email.startsWith("coforge"));
        int p=email.indexOf("@");

        if(p>=0)
            System.out.println("@ is present ");
        else
            System.out.println("not present");

    }
}
