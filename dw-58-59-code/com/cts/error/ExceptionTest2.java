package com.cts.error;

public class ExceptionTest2 {

	public static void main(String[] args) {
	    try {
		int ar[]= {1,2,3,4,5};
		//System.out.println(ar[5]);
		System.out.println(ar[4]);
	    
	    }
	
	    catch (ArrayIndexOutOfBoundsException e) {
	    	System.err.println("array index error");
	    }  	  
	    
	    catch (Exception e) {
	    	//System.out.println(e);
	    	System.out.println(e.getMessage());
	    }
	    
	    finally {
			System.out.println("finally block");
		}
	}
}
