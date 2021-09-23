public class LabelProgram {

	public static void main(String[] args) {

		label1:
     	for (int i = 0; i < 6; i++) {
			// without label continue will come here
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
				if (j % 2 == 0)
					 //continue;
					continue label1;
				//	break;
						//break label1;
				
			}
			System.out.println();
		}

	}
}
