public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            System.out.print(i+", ");
        }
        System.out.println();
        int k=1;
        for(;k<=20;k=k+2)
            System.out.print(k+", ");
        System.out.println();
         k=1;
        for(;k<=30;) {
            System.out.print(k+", ");
            k=k+3;
        }
        System.out.println("infinite loop ");
        for(;;){
            System.out.println("infinite loop ");
        }

    }
}
