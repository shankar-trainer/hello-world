package package1;

public class Task1  extends  Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 30; i++) {
            System.out.println("this is mytask1");
        }
    }

    void mytask1() {
        for (int i = 0; i <= 30; i++) {
            System.out.println("this is mytask1");
        }
    }


}
