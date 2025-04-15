package deadlock;

public class User1 extends Thread {
    static Object object1 = "KeyBoard";
    static Object object2 = "Mouse";

    @Override
    public void run() {
        synchronized (object1) {
            System.out.println("User1  got lock over " + object1);

            synchronized (object2) {
                System.out.println("waiting for " + object2);
            }
        }
    }
}
 class User2 extends Thread {

    @Override
    public void run() {
        synchronized (User1.object2) {
            System.out.println("User2  got lock over " + User1.object2);

            synchronized (User1.object1) {
                System.out.println("waiting for " + User1.object1);
            }
        }
    }

     public static void main(String[] args) {
         System.out.println("program start");
         Thread t1=new User1();
         Thread t2=new User2();
         t1.start();
         t2.start();

         System.out.println("program ends ");
     }
}
