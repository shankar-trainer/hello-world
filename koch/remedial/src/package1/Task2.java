package package1;

public class Task2 extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 30; i++) {
            System.out.println("this is mytask2");
        }
    }

    void mytask2() {
        for (int i = 0; i <= 30; i++) {
            System.out.println("this is mytask2");
        }
    }
}
