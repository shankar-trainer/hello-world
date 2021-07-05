import java.text.DecimalFormat;

public class FormatPrg1 {

	public static void main(String[] args) {
		int x=100;
		String city="delhi";
		float salary=767676.7667f;
		System.out.println("id is "+"\ncity is "+city+"\nsalary is "+salary);
		
		System.out.printf("\nid is %d \ncity is %s\nsalary is %f",x,city,salary);
		
		System.out.printf("\n%6.2f",salary);
		System.out.printf("\n%20.2f",salary);
		System.out.printf("\n%-20.2f",salary);
	
		DecimalFormat decimalFormat=new DecimalFormat("###,###.00");
		String s1=decimalFormat.format(salary);
		System.out.println();
		System.out.println(s1);
		
		decimalFormat=new DecimalFormat("##,##,##.00");
		System.out.println(decimalFormat.format(salary));
		
	}
}
