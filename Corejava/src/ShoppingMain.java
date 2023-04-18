
public class ShoppingMain {

	public static void main(String[] args) {
      Shopping shopping[]=new Shopping[4];
      
      shopping[0]=new Shopping(54545, "java book",1000, "book", 5/100.0f);
      shopping[1]=new Shopping(54546, "pizza",800, "food", 25/100.0f);
      shopping[2]=new Shopping(54548, "cold drink",200, "drink", 30/100.0f);
      shopping[3]=new Shopping(54549, "mobile",12000, "electronic", 15/100.0f);
    
      System.out.println("id\tname\tcost\ttype\tdiscount\tfinal cost");
      
      for (Shopping shopping2 : shopping) {
		System.out.println(shopping2.getProductId()+"  "+shopping2.getProductName()+"   "+shopping2.getProductCost()+" "+shopping2.getProductType()+" "+shopping2.getProductDiscount()+"  "+(shopping2.getProductCost()-(shopping2.getProductCost()*shopping2.getProductDiscount())));
	}
      
	}
}
