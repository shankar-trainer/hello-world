class PowerProgram{
		
	public static void main(String args[]){
		java.util.Scanner sc=new java.util.Scanner(System.in);
    
	    System.out.println("Enter no ");
		int p=sc.nextInt();
		int res=1;
		System.out.println("Enter  power factor ");
		int q=sc.nextInt();
		
		for(int x=1;x<=q;x++)
			res=res*p;
		
		System.out.println("Result is "+res);
	}
	
}