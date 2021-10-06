package reduce;

import java.util.*;

class ConcurrentDemo extends Thread {
	static ArrayList<String> l = new ArrayList<>();

	public void run() {
	for (int i = 0; i <=1000; i++)
		l.add("hello");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("welcome");
		l.add("Greeting");
		l.add("Bye");

		ConcurrentDemo t = new ConcurrentDemo();
		t.start();
			
		System.out.println(l);
	}
}
