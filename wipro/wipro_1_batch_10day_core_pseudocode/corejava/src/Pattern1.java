/**
 *     *
 *     *  *
 *     *  *  *
 */

public class Pattern1 {

    static void pattern(char c, int n){
        System.out.println("\n Pattern using "+c+"\n");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(c+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern('*',3);
        pattern('$',4);
        pattern('&',8);
    }

}
