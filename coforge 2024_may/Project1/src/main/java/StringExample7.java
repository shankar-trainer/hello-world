
public class StringExample7 {

	public static void main(String[] args) {
		
		
		//StringBuffer buffer="";// error 
		
		StringBuffer buffer=new StringBuffer("welcome ");
		
		System.out.println(buffer);
		buffer.append("to java");
		
		System.out.println(buffer);
		
		buffer.delete(2, 5);
		
		System.out.println(buffer);
		
		buffer.reverse();

		System.out.println(buffer);
		
		String s1="hello";
		s1.replace('e', 'z');
		System.out.println(s1);
		
		
		StringBuffer buffer2=new StringBuffer(s1);
		
		buffer2.replace(0,3,"abc");
		
		System.out.println(buffer2);
		
		
		StringBuilder builder=new StringBuilder("lean java");
		builder.append(" and spring ");
		System.out.println(builder);
		builder.reverse();
		System.err.println(builder);
		
		
	}
}
