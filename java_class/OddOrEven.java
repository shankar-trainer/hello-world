class OddOrEven{
	static boolean evenOrOdd(int n){
		if(n%2==0)
			return true;
		else
		return false;
	}
	public static void main(String args[]){
		System.out.println("Enter no to check even or odd");
		int x=new java.util.Scanner(System.in).nextInt();
		
		if(evenOrOdd(x))
			System.out.println(x+" is even no");
		else
			System.out.println(x+" is odd no");
	
		
	}
	
}