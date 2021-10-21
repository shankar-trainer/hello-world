import java.util.concurrent.CopyOnWriteArrayList;

class ConcurrentDemo2 extends Thread {
	static CopyOnWriteArrayList<String> l = new  CopyOnWriteArrayList<>();

	public void run() {
	for (int i = 0; i <=1000; i++)
		l.add("hello");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("welcome");
		l.add("Greeting");
		l.add("Bye");

		ConcurrentDemo2 t = new ConcurrentDemo2();
		t.start();
			
		System.out.println(l);
	}
}
