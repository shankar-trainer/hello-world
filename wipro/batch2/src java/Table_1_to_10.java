public class Table_1_to_10 {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }

        System.out.println("triangle design ");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("triangle design ");
         char c='a';
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
        System.out.println("triangle design ");
        for (int i = 1; i <=5 ; i++) {
         c='a';
            for (int j = 1; j <=i; j++) {
                System.out.print(c+++" ");
            }
            System.out.println();
        }
    }
}
