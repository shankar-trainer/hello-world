
public class StringReverse {

	public static void main(String[] args) {
		String s = "we all are indian";

		char[] charArray = s.toCharArray();
		char ar2[] = new char[charArray.length];
		
		
		for (int i = ar2.length-1,j=0; i >= 0; i--) {
		  ar2[j++]=charArray[i];	
		}
		
		String rev1=new String(ar2);
		System.out.println(rev1);
	}
}
