public class Product {
    private long productId;
    private String productName;
    private float productCost;
    private int productTotalNo;
    private String productDeliveryLocation;
    private String productCountry;

    public Product() {
        System.out.println("default constructor");
    }

    public Product(long productId, String productName, float productCost, int productTotalNo, String productDeliveryLocation, String productCountry) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productTotalNo = productTotalNo;
        this.productDeliveryLocation = productDeliveryLocation;
        this.productCountry = productCountry;
        System.out.println("overloaded  constructor with 6 argument");
    }

    public Product(long productId, String productName, float productCost, int productTotalNo) {
        this(productId, productName, productCost, productTotalNo, "chennai", "india");
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productTotalNo = productTotalNo;
        System.out.println("overloaded constructor with 4 argument");
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductCost() {
        return productCost;
    }

    public int  getProductTotalNo() {
        return productTotalNo;
    }

    public String getProductDeliveryLocation() {
        return productDeliveryLocation;
    }

    public String getProductCountry() {
        return productCountry;
    }
}
