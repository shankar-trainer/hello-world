
public class Test1 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close resources");
	}

	
}
