package reduce;

public class Ex2 {

	public static void main(String[] args) {
	
		Runnable runnable2 = () -> {
			System.out.println("run called");
		};
		new Thread(runnable2).start();
	}
}
