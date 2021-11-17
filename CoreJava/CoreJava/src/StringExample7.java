
public class StringExample7 {

	public static void main(String[] args) {
		String var = "we are learning java. we will learn sql too";

		System.out.println(var.replace('e', 'i'));
		System.out.println(var.replaceAll("we", "i"));

		char ar[] = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };

		String a = new String(ar);

		String valueOf1 = String.valueOf(878787.90f);
		String valueOf2 = String.valueOf(ar);

		String a1 = Integer.toString(123);
		String binary = Integer.toBinaryString(1234);
		String hexString = Integer.toHexString(1234);
		String octString = Integer.toOctalString(1234);
		
		System.out.println(a1);
		System.out.println(binary);
		System.out.println(hexString);
		System.out.println(octString);

	}
}
