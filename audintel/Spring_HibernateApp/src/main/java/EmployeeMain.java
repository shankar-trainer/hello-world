import org.audintel.dao.EmployeeDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class EmployeeMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDao bean = beanFactory.getBean("dao",EmployeeDao.class);
		
		bean.getAllEmployee().forEach(a->System.out.println(a.getEmpId()+"\t"+a.getEmpName()+"\t"+a.getEmpsalary()));
		
	}
}
