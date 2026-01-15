package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorEx1 {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();

        Runnable runnable=()-> System.out.println(t.getName()+" thread running ");

//        Thread thread=new Thread(runnable);
//        thread.start();

        Executor executor= Executors.newSingleThreadExecutor();
        executor.execute(runnable);

    }
}
