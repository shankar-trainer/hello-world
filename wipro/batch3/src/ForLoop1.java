public class ForLoop1 {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+", ");
        }
        int j=1;
        System.out.println();
        for (; j <=10 ;) {
            System.out.print(j);
            j++;
        }

        //infinite loop
        for(;;){
            System.out.println("infinite for loop");
        }
//        while(true){
//            System.out.println("while infinite loop");
//        }

//        while(1>0){
//            System.out.println("while infinite loop");
//        }
    }
}
