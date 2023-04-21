public class MethodOverLoading {
	public int addition(int a, int b ) {
  		return a+b;
	}
	public int addition(int a, int b, int c ) {
  		return a+b+c;
	}
	public float addition(float a, float b ) {
  		return a+b;
	}
	public String addition(String a, String b ) {
  		return a+b;
	}

	public static void main(String[] args) {
		MethodOverLoading loading=new MethodOverLoading();
		
	System.out.println("full name is "+	loading.addition("suresh", "kumar"));
	System.out.println("addition of two  integer  is "+	loading.addition(12, 33));

	System.out.println("addition of three  integer  is "+	loading.addition(12, 33,22));

	System.out.println("addition of float is "+	loading.addition(33.45f, 55.6f));

	
	}
	

}
