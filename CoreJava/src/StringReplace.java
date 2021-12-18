
public class StringReplace {

	public static void main(String[] args) {

		String s = "i am typing java ";
		     // replace method replace  character 
		String k = s.replace('i', 'k');

		System.out.println(k);
		System.out.println(s.replace('a', 'z'));

		//replaceall will replace word
		System.out.println(s.replaceAll("am", "are"));

	}
}