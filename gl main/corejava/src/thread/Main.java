package thread;

public class Main {

	public static void main(String[] args) {
				
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getThreadGroup());
		
	}

}