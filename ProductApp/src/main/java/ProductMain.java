import java.sql.SQLException;
import java.util.Scanner;

import com.cts.entity.Product;
import com.cts.exception.ProductException;
import com.cts.service.ProductService;
import com.cts.service.ProductServiceImpl;

public class ProductMain {

	public static void main(String[] args) {
		
			String ch = "y";
			Scanner scanner = new Scanner(System.in);
			int i;
			Product p1;
			while (ch.equalsIgnoreCase("y")) {
				try {

				ProductService service = new ProductServiceImpl();

				System.out.println("1.Add Product");
				System.out.println("2.Search Product");
				System.out.println("3.ShowAll Product");
				i = scanner.nextInt();
				switch (i) {
				case 1:
					p1 = null;
					p1 = new Product();
					System.out.println("Enter product id name and cost");
					p1.setPrdId(scanner.nextInt());
					scanner.nextLine();

					p1.setPrdName(scanner.nextLine());
					p1.setPrdCost(scanner.nextFloat());

					service.addProduct(p1);

					break;

				case 2:
					p1 = null;
					System.out.println("enter product id to search");
					p1 = new Product();
					p1.setPrdId(scanner.nextInt());
					service.searchProduct(p1);

					break;
				case 3:
					service.getAllProduct();
					break;
				default:
					break;
				}
				}
				catch (SQLException | ProductException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("continue y\\n");
				ch = scanner.next();
			}
		} 
	}

