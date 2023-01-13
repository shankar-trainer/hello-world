
public class StringBufferProgram1 {

	public static void main(String[] args) {

//		StringBuffer buffer="hello";// not accept string literal
		StringBuffer buffer = new StringBuffer("hello");

		System.out.println(buffer);
		buffer.append(" world");

		System.out.println(buffer);

		buffer.reverse();
		System.out.println(buffer);
		buffer.reverse();

		buffer.insert(3, "  hi hi  ");

		System.out.println(buffer);

		buffer.delete(3, 10);
		System.out.println(buffer);

		StringBuffer buffer1 = new StringBuffer(20);

		buffer1.append("hello world  hello world  hello world hello world hello world");
		System.out.println(buffer1);

	}
}
