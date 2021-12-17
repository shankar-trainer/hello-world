
public class StringReplace {

	public static void main(String[] args) {

		String s = "i am typing java ";
		String k = s.replace('i', 'k');

		System.out.println(k);
		System.out.println(s.replace('a', 'z'));

		System.out.println(s.replaceAll("am", "are"));

	}
}