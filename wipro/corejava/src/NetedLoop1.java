public class NetedLoop1 {

    public static void main(String[] args) {

        System.out.println("***** table of 1 to 5 *******\n");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
