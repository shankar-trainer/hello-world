
public class WarppeerDemo4 {

	public static void main(String[] args) {

		Character c1=new Character('a');
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('p'));
		
	if(Character.isAlphabetic(65))
		System.out.println("is alphabet "+(char)65);
	
System.out.println(Character.isLetter('1'));
System.out.println(Character.isLetter('x'));
System.out.println(Character.isDigit('1'));

System.out.println(Character.isLetterOrDigit('a'));

if(Character.isLetterOrDigit('#'))
	System.out.println("its special character");


	}
}
