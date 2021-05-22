import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cts.model.Product;

public class Test1 {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Product> forEntity = restTemplate.getForEntity("http://localhost:9090/prd/search/565665",
				Product.class);
		Product product;
		System.out.println(forEntity.getStatusCodeValue());
		if (forEntity.getStatusCodeValue() == 200) {
			product = forEntity.getBody();
			
			System.out.println("Id  Name Cost ");
			System.out.println(product.getId() + "  " + product.getName() + " " + product.getCost());
		}
		else
			System.out.println("not found");
	}
}
