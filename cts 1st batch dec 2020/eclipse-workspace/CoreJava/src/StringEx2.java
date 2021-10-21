
public class StringEx2 {
public static void main(String[] args) {
	
	String s1="java";
	String s2=new String("java");
	
	if(s1=="java")
		System.out.println("ok");
	
	if(s1.equals("java"))
		System.out.println("ok1");
	
	if(s1==s2)
		System.out.println("will not work");
	if(s1.equals(s2))
		System.out.println("it will  work");
	
	String j=s1;
	
	j.toUpperCase();
	
	System.out.println(j+"  "+s1);
	
}
}
