package core;

public class Result {
	
	
	public static long factorial(long n) {
	    long fact=1;
	    
		if(n==0)
			return 1;
		else {
			for(long p=1;p<=n;p++) {
				fact=fact*p;
			}
			//System.out.println(fact);
			return fact;
		}
	}

	public static long countOptions(int people, int groups) {
		
             
            long res=		 (factorial(people)/(factorial(groups)*factorial(people-groups)));                		
	   
            return 0;
	}


	public static void main(String[] args) {
		System.out.println(countOptions(7, 3));//
	}
}
