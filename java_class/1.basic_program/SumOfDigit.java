class SumOfDigit{
	
	public static void main(String args[]){
		int x=1234;
		int p=0;
		
	    for(;x!=0;){
			p=p+x%10;
			x=x/10;
		}
		System.out.println(p);
		
		/*
		System.out.println(x%10);
		p=p+x%10;
	
	    System.out.println(x/10);
		
		x=x/10;// x=123 
		
		System.out.println(x%10);
		p=p+x%10;
		
		System.out.println(p);
	*/
	}
	
}