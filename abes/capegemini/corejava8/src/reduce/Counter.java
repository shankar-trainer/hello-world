package reduce;

public class Counter {
    private volatile int counter;
 
    public int getValue(){
        return counter;
    }
 
    public  synchronized int increment(){
        return counter++;
    }
}