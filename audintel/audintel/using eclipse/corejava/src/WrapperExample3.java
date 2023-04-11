public class WrapperExample3 {

	public static void main(String[] args) {
		
		String marks1="67.67";
		String marks2="87.17";
		
		float total=Float.parseFloat(marks1)+Float.parseFloat(marks2);
		System.out.println("marks1 "+marks1);
		System.out.println("marks2 "+marks2);
		System.out.println("total marks "+total);
		System.out.println("average marks "+total/2);
	  
		Float salary=new Float(566556767);// parse at compilation time
		Float salary1=new Float("566556767");//parse at runtime
        
		// static method parseXXX-- string to primitive
		
		Integer valueOf = Integer.valueOf("67867788");// static method valueOf string to Object 
		                                              // parse at runtime
		
		System.out.println(Integer.parseInt("67.3"));
	}
}
