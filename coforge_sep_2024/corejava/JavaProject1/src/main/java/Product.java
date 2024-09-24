public class Product {
    // 3 instance variable
    private int productId;
    private String productName;
    private float productCost;

    // to initialize instance variable we use constructor
    public Product(int productId, String productName, float productCost) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        System.out.println("constructor called ");
    }
    // class or static variable

    private static String company_name;
    // class variable , static variable , static/class method, static block code is created  before the creation of object

    // to initialize the static variable we use static block
    static {
        company_name="HUL";
        System.out.println("static block ");
    }

    {
        System.out.println("non static block/init block ");
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductCost() {
        return productCost;
    }

    public static String getCompany_name() {
        return company_name;
    }
}
