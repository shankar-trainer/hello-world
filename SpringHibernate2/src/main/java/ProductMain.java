import com.example.config.CourseConfig;
import com.example.config.ProductConfig;
import com.example.dao.CourseDao;
import com.example.dao.ProductDao;
import com.example.model.Course;
import com.example.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext
				//(CourseDao.class)
				//(CourseConfig.class);
				//(ProductDao.class);
				(ProductConfig.class);

		ProductDao dao = ctx.getBean(ProductDao.class);
		Product product=new Product();
		product.setPrdName("biscuit");
		product.setPrdCost(67);

		dao.addProduct(product);
		
		System.out.println("product added");
		
		dao.findAllProduct().forEach(System.out::println);
	}
}
