
public class Alphabet2 {

	static void smallAlphabet() {
		
		char c='a';
		System.out.println(c++);
		System.out.println(c++);
		System.out.println(c++);

		c='a';
		while(true) {
			System.out.print(c+", ");
			if(c=='z')
				break;
			c++;
		}
	}
	
	public static void main(String[] args) {
		smallAlphabet();
	}

}
