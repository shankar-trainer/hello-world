import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

class ConcurrentDemo extends Thread {
	//ArrayList<String> l = new ArrayList<>();
	 static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();

	public void run() {
		for (int i = 0; i <= 10; i++) {
			l.add("hello");
			// System.out.println(i + " child thread " + l.size()+" "+l);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ConcurrentDemo t = new ConcurrentDemo();
		t.l.add("welcome");
		t.l.add("Greeting");
		t.l.add("Bye");

		t.start();
		// t.run();
		System.out.println(t.l);
	}
}
