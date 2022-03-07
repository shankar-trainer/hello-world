
public class Continue_Return_Break1 {

	public static void main(String[] args) {
		
		System.out.println("using break\n");
		for(int x=1;x<=10;x++) {
			if(x==5)
				break;
			System.out.print(x+"  ");
		}
		
		System.out.println("\nusing continue");
		for(int x=1;x<=10;x++) {
			if(x==5)
				continue;
			System.out.print(x+"  ");
		}
		
		System.out.println("\nusing return");
		for(int x=1;x<=10;x++) {
			if(x==5)
				return;
			System.out.print(x+"  ");
		}

		System.out.println("\nend of program");
	}
}
