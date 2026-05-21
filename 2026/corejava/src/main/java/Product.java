import java.util.Objects;

public class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Product product1=new Product(10001,"prd1");
        Product product2=new Product(10001,"prd1");
//        System.out.println(product1.toString());
        System.out.println(product1);
        System.out.println(product2.toString());
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
    }

}
