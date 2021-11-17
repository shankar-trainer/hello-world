
public class StringPalindrome {

	public static void main(String[] args) {

		String s1 = "hellolleh";
		//String s1 = "hello";
		
		String s3 = "";

		System.out.println("first way ");
		for (int i = s1.length() - 1; i >= 0; i--) 
			s3 = s3 + s1.charAt(i);

		if (s3.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

		System.out.println("another way ");
		
		char ar1[] = s1.toCharArray();
		char ar2[] = new char[ar1.length];

		int j=0;
		for (int i = ar1.length - 1; i >= 0; i--) 
			ar2[j++] = ar1[i];
		System.out.println(new String(ar2).equals(s1));
	}

}
