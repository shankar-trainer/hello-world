
public class StringFormatting {
    int id;
    String name;
    float salary;
    
    public StringFormatting() {
	  id=10001;
	  name="hanumath kumar";
	  salary=12000.6667f;
    }
	
	public static void main(String[] args) {
	   StringFormatting formatting=new StringFormatting();
	   System.out.println("id is "+formatting.id+"\nname is "+formatting.name+"\nsalary is "+formatting.salary);

	System.out.printf("\nid is %d\nname is %s\nsalary is %f",formatting.id,formatting.name,formatting.salary);
	System.out.printf("\nsalary  is %f",formatting.salary);  
	System.out.printf("\nsalary  is %.2f",formatting.salary);  
	
	System.out.println (String.format("\nsalary  is %.2f",formatting.salary));  
	
	}
}
