
public class SwitchCase {

	public static void main(String[] args) {

		char op = '+';

//		  if(op=='+')
//			  System.out.println("it is arithmatic operation");
//		
//		  if(op=='-')
//			  System.out.println("it is subtraction operation");

		op='k';
		switch (op) {
		case '+': {
			System.out.println("it is arithmatic operation");
			break;
		}
		case '-': {
			System.out.println("it is subtraction operation");
			break;
		}

		default:
			System.out.println("unkown operation  operation");

		}

	}

}
