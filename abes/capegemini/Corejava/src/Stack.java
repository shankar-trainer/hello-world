public class Stack {
	static int[] push(int ar[], int n) {
		int ar1[] = new int[ar.length + 1];

		for (int i = 0; i <ar1.length-1; i++) {
			ar1[i]=ar[i];
		}
				
		ar1[ar1.length-1] = n;
		return ar1;

	}

	static int[] push(int ar[], int n, int pos) {
		int ar1[] = new int[ar.length + 1];

		for (int i = 0; i <pos-1; i++) {
			ar1[i] = ar[i];
		}
		ar1[pos] = n;

		for (int i = pos + 1; i < ar1.length; i++) {
			ar1[i] = ar[i];
		}
		return ar1;
	}

	static int[] pop(int ar[]) {

		int ar1[] = new int[ar.length-1];
		for (int i = 0; i <ar1.length - 1; i++) {
			ar1[i] = ar[i];
		}

		return ar1;
	}

	static void disp(int ar[]) {

	}

	public static void main(String args[]) {
     int ar[]={1,2,3,4,5};
     for (int p:push(ar, 100))
    	 System.out.print(p+"  ");
	
     System.out.println("after pop");
     
     for (int p:pop(ar))
    	 System.out.print(p+"  ");
	}
	}
	
