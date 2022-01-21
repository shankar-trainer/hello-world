
public class Student {
   int roll;  //instance variable
   String name;
   float marks;
	
 
   public static void main(String[] args) {
	
	   Student s1=new Student();//
	   Student s2=new Student();//
	   Student s3=new Student();//
	   
	   s1.roll=88787;
	   s1.name="amit kumar";
	   s1.marks=88.89f;
	   
	   System.out.println(s1.roll+"  "+s1.name+"  "+s1.marks);
	   System.out.println(s2.roll+"  "+s2.name+"  "+s2.marks);
	   
}
}
