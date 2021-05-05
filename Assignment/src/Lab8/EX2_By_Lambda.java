package Lab8;

import java.time.LocalTime;

public class EX2_By_Lambda {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			while (true) {
				LocalTime localTime;
				localTime = LocalTime.now();
				System.out.println(localTime);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					System.err.println(e);
				}
			}
		};
		new Thread(runnable).start();
	}
}
