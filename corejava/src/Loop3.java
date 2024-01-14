
public class Loop3 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <=10; i++) {
			System.out.print(i+", ");
		}
		
		System.out.println();
		for (int i = 1,j=10; i <=10; i++,j=j+10) {
			System.out.println(i+",  "+j);
		}
		int i = 65;
		for (; i <=90; ) {
			System.out.println(i+", "+(char)i);
			i++;
		}
		
		System.out.println();
		int p=1;
		for(char c='a';c<='z';c++) {
			System.out.print(c+"\t");
		  if(p%5==0)
			  System.out.println();
		  p++;
		}
		
		
		
	}
}
