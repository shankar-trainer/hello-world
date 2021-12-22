package com.cognizant.error;

public class MyProgram {
	void disp(int arr[], int index) throws Exception {
		int len = arr.length;

		try {
			if (index > len - 1)
				// throw new RuntimeException("index error ");// unchecked exception, not
				// checked by compiler
				throw new Exception("index error ");// checked exception , checked by the compiler
			else
				System.out.println("no is " + arr[index]);
		} catch (Exception e) {
			System.err.println("inside disp  method error is " + e.getMessage());
			throw e;// rethrowing the caught exception
		}
	}

	public static void main(String[] args) // throws Exception
	{
		System.out.println("start of program");
		try {
			new MyProgram().disp(new int[] { 1, 2, 3, 4, 5, 6 }, 7);
		} catch (Exception e) {
			System.err.println("in main method error is " + e.getMessage());
		}
		System.out.println("end of program");
	}
}
