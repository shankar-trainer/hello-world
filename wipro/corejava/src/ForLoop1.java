public class ForLoop1 {
    public static void main(String[] args) {
                int counter=1;// declaration

        while (counter<=10){// condition check
            System.out.println(counter);
            counter=counter+1;// decrent, increment
        }

        for (int i = 1; i <=10 ; i++) { // counter declaration, condition check, counter increment,decrement
            System.out.print(i+", ");
        }
        System.out.println();

        for (int i = 1; i <=10 ; i=i+2) {
            System.out.print(i+", ");
        }
//        for(;;){// infinite loop
//            System.out.println("hello");
//        }

        int p=20;
        for(;p<=25;) {
            System.out.println(p++);
        }

    }
}
