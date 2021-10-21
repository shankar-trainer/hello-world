class CmdArgs1 {

	public static void main(String args[]) {
		String fname = args[0];
		String lname = args[1];

		System.out.println(fname + "  " + lname);
		
		
		for (String string : args) {
			System.out.print(string+"   ");
		}

	}

}