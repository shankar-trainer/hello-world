

public class ProductMain {
    public static void main(String[] args) {

        java.util.Scanner sc=new java.util.Scanner(System.in);
        Product prd=null;;

        System.out.println("Enter product  id, name, cost, total no ");
        int pid=sc.nextInt();
        sc.nextLine();
        String pname=sc.nextLine();
        float cost=sc.nextFloat();
        int totalno=sc.nextInt();
        System.out.println("Enter delivery location and country name");
        sc.nextLine();
        String location=sc.nextLine();
        String country=sc.nextLine();

        if(location.equals("chennai") && country.equals("india"))
            prd=new Product(pid,pname,cost,totalno);
        else
            prd=new Product(pid,pname,cost,totalno,location,country);

        System.out.println("product information ");
        System.out.println("\tid :"+prd.getProductId());
        System.out.println("\tname :"+prd.getProductName());
        System.out.println("\tcost :"+prd.getProductCost());
        System.out.println("\ttotal no of product :"+prd.getProductTotalNo());
        System.out.println("\ttotal cost  :"+(prd.getProductCost()*prd.getProductTotalNo()));
        System.out.println("\tdelivery location :"+prd.getProductDeliveryLocation());
        System.out.println("\tcountry :"+prd.getProductCountry());
    }
}
