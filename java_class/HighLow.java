class HighLow{
	
	public static  	void main(String args[]){
		
		int high=0,low=0;
		int count=1;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n=0;
		while(count<=10){
		 System.out.println("Enter no ");	
			n=sc.nextInt();
			if(count==1){
				high=low=n;
			}
			else if(n>=high){
				high=n;
			}
			else if(n<=low){
				low=n;
			}
			count=count+1;
		}
		System.out.println("max is "+high+"\nmin is "+low);
	}
	
	
}