public class ProductMain {

    public static void main(String[] args) {

        Product product=new Product(1001,"britania biscuit",40);
        System.out.println("product information ");
        System.out.println("\t id is "+product.getProductId());
        System.out.println("\t name is "+product.getProductName());
        System.out.println("\t cost is "+product.getProductCost());
        System.out.println("\tcompany name " + Product.getCompany_name());

        // java.lang -- package
        // java.lang.Math
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.sqrt(26));
        System.out.println(Math.pow(2,5));
    }
}
