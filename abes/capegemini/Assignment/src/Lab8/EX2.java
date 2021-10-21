package Lab8;

import java.time.LocalTime;

public class EX2 implements Runnable {
	LocalTime localTime;
	@Override
	public void run() {
		while (true) {
			localTime = LocalTime.now();
			System.out.println(localTime);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

	public static void main(String[] args) {
    new Thread(new EX2()).start();
	}
}
