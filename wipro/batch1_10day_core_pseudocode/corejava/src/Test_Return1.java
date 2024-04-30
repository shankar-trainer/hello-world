public class Test_Return1 {
 static boolean print(){
     for (int i = 1; i <=10 ; i++) {
         System.out.print(i+", ");
         if(i==5)
             System.exit(0);
             //return;
     }
     return  true;
 }

    public static void main(String[] args) {
        print();
        System.out.println("program ends");
    }
}
