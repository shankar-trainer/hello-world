package thread;

public class RunnableProgram1 {

    public static void main(String[] args) {

        Runnable runnable=()-> {
            Thread t=Thread.currentThread();
            for (int i = 0; i <=20 ; i++)
                System.out.println("child thread "+i+" name "+t.getName());
        };

        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        Thread t3=new Thread(runnable);

        t1.setName("program1");
        t2.setName("program2");
        t3.setName("program3");
        t1.start();
        t2.start();
        t3.start();
    }
}
