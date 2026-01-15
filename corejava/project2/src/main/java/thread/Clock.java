package thread;

import java.util.Date;

public class Clock {
    public static void main(String[] args)
            throws InterruptedException {
        Date date;

        for(;;){
            date=new Date();
            System.out.println(date);
            Thread.sleep(1000);
        }
    }
}
