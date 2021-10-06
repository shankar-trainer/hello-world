package corejava;

import java.text.DecimalFormat;

public class FormatDemo1 {

	public static void main(String[] args) {
		float salary=767667.67789f;
		
		System.out.println(salary);
		DecimalFormat decimalFormat=new DecimalFormat
				("###,##.00");
		String s=decimalFormat.format(salary);
		System.out.println(s);
		salary=566565656565.78888f;
		decimalFormat=new DecimalFormat
				("###,###,###.00");
		
		System.out.println( decimalFormat.format(salary));
		
		decimalFormat=new DecimalFormat
				("000,000,000,00,00,00.00");
		
		System.out.println( decimalFormat.format(salary));
		
		
		
		
	}
}
