package collection;

public class HexCode {

	public static void main(String[] args) {
		
		System.out.println("#abc124".matches("#[a-fA-F0-9]{6}"));
		System.out.println("*".matches("[*+-/%]"));
			
		if("*".matches("[*+-/%]")){
			System.out.println("do the operation");
		}
		else
			System.out.println("wrong operator ");
	}
}
