import java.util.Objects;

public class Product {

    private int productId;
    private String productName;
    private float productCost;

    public Product(int productId, String productName, float productCost) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    @Override
    public String toString() {
        //return super.toString();
      return  "Product \n"
                +"\tId: "+productId
                +"\tName: "+productName
                +"\tCost: "+productCost;
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if(obj instanceof  Product ){
            Product p=(Product)obj;
            if(p.productCost==this.productCost && p.productId==this.productId && p.productName==this.productName)
                return  true;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productCost);
    }

    public static void main(String[] args) {

        Product product1=new Product(10001,"hair oil",50);
        Product product2=new Product(10001,"hair oil",50);
        //System.out.println(product.toString());
        System.out.println(product1);
        System.out.println(product2);

        System.out.println(product1.equals(product2));

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());


    }
}
