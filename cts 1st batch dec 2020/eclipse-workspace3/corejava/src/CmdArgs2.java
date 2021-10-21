class CmdArgs2 {

	public static void main(String args[]) {
		String n1= args[0];
		String n2 = args[1];
		
		float f1=Float.parseFloat(n1);
		float f2=Float.parseFloat(n2);

		System.out.println("sum is "+(f1+f2));
		System.out.println("div is "+(f1/f2));
		System.out.println("mul is "+(f1*f2));
		
	}

}