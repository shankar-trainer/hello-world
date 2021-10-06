
public class Example1 {

	public Example1 show(String x) {
		return new Example1();
	}
}

class Example2 extends Example1 {

	@Override
	// protected

	public Example2 show(String x) {
		return new Example2();
	}
}
