public class Table {
    static void displayTable(int p) {
        System.out.println("\ntable of " + p + " is below \n");
        int c = 1;
        while (c <= 10) {
            System.out.println(c + " * " + p + " = " + c * p);
            c=c+1;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter no ");
        int x = sc.nextInt();
        displayTable(x);
        displayTable(7);
    }
}
