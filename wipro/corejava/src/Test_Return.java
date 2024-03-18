public class Test_Return {

    public static void main(String[] args) {
        System.out.println("program starts ");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            if(i==6)
                //System.exit(0);
                return;
        }
        System.out.println("program ends ");
    }
}
