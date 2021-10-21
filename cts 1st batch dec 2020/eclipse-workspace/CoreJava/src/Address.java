
public class Address {

	String city;
	
	
	public static void main(String[] args) {
	
		Address address1=new Address();
		address1.city="chennai";
		
		Address address2,address3,address4;
		
		address2=address3=address4=address1;
		
		System.out.println(address3.city);
	
		address4.city="madurai";
		
		System.out.println(address3.city);
		
		String s1="hello";
		
		String s2=s1;// 2 ref variable 1 object , both referrs same object
		
		System.out.println(s1+"  "+s1);
		
		s2=s2+"world";// s2 has diff value, s2 create new object in heap
		//s1 ,s1 both have diff objects , 2 ref , 2 objects 
		
		System.out.println(s2+"  "+s1);
		
	}
}



