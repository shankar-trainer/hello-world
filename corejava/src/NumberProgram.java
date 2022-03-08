import java.util.Scanner;

public class NumberProgram {
    static void search(int myarr[], int search) {
    	boolean status=false;
    	int pos=0;
    	for(int k:myarr) {
    		if(k==search) {
    			status=true;
    			break;
    		}
    		pos++;
    	}
    	if(status==true)
    		System.out.println("found at "+pos+"  position");
    	else
    		System.out.println("not found");
    }
    static void hi_low(int array1[]) {
    	int max=0,min=0;
    	for(int k:array1) {
    		if(k>=max)
    			max=k;
    		else if(k<=min)
    			min=k;
    	}
    	System.out.println("max is "+max);
    	System.out.println("min is "+min);
    }
    
	static void  sorting(int ar[]) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <ar.length-1-i; j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("sorted in ascending order");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+",");
		}
		System.out.println("\nsorted in descending order");
		for (int i = ar.length-1 ; i>=0; i--) {
			System.out.print(ar[i]+",");
		}
	}

    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many   number ");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter no ");
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		int avg=sum/n;
		System.out.println("total sum is "+sum);
		System.out.println("average is "+avg);
		
		System.out.println("Enter no to search");
		int p=sc.nextInt();
		search(ar,p);
	    hi_low(ar);	
	    sorting(ar);
	    
		// find a given no in array , if present then display the position  -- use method 
		// display the highest and lowest no without sorting       -- use method
		// display all number in ascending and descending order  -- use method
		
		sc.close();
	}
}
