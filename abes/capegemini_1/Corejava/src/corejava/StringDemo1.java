package corejava;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		String ar[]={"java","python","perl","ruby"};
		String s=null;
		
			s=String.join("-", ar);
		
			System.out.println(s);
	}
}
