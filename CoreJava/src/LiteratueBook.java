
public class LiteratueBook extends Book {

	float rebate=0.2f;
	
	@Override
	//public
	//protected
	
	void setBcost(float bcost) {
		super.setBcost(bcost-bcost*rebate);
	}
	
	
	public static void main(String[] args) {
		LiteratueBook book=new LiteratueBook();
		
		book.setBname("love story");
		book.setIsbn(56566565);
		book.setAuthor("p kumar");
		book.setBcost(789);
		
		System.out.println("isbn "+book.getIsbn());
		System.out.println("isbn "+book.getAuthor());
		System.out.println("isbn "+book.getBname());
		System.out.println("isbn "+book.getBcost());
		
	}
	
}
