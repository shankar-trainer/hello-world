package corejava;

import java.text.DecimalFormat;

public class formtatEx2 {

	public static void main(String[] args) {
		float price=6676.76657f;

		
		DecimalFormat df=new DecimalFormat("##,##,##.00");
 
		
		System.out.println(df.format(price));
		
	}
}
