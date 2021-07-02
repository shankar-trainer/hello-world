import java.text.NumberFormat;
import java.util.Locale;

public class FormatPrg2 {

	public static void main(String[] args) {
		float salary=878787.56656f;
		
		NumberFormat   numberFormat=NumberFormat.getCurrencyInstance();
		System.out.println(numberFormat.format(salary));
		
		 numberFormat=NumberFormat.getCurrencyInstance(Locale.FRENCH);
		System.out.println(numberFormat.format(salary));
		
		
		numberFormat=NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(numberFormat.format(salary));
		
		Locale locale=new Locale("en","in");
		numberFormat=NumberFormat.getCurrencyInstance(locale);
		System.out.println(numberFormat.format(salary));
		
			}
}
