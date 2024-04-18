public class Alphabet {

    public static void main(String[] args) {
        System.out.println("\n capital alphabet with ascii code \n");
        for (int i = 65; i <= 90; i++) {
            System.out.print(i + "->" + ((char) i + "  "));
            if (i % 5 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println("\nCapital alphabet using char");
        System.out.println('c' + "  " + (int) 'c');
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + "  ");
        }
        System.out.println("\nsmall case alphabet with ascii code ");
        for (int i = 97; i <= 122; i++) {
            System.out.print(i + "->" + ((char) i + "  "));
            if (i % 5 == 0)
                System.out.println();
        }
        System.out.println("Small  alphabet using char");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + "  ");
        }

    }
}