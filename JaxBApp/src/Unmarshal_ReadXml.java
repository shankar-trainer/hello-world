
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.com.Employee;

public class Unmarshal_ReadXml {

	public static void main(String[] args) throws JAXBException {
		File file=new File("Employee.xml");
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		
		Employee unmarshal = (Employee) unmarshaller.unmarshal(file);
	
		System.out.println(unmarshal.getId()+"  "+unmarshal.getName()+"  "+unmarshal.getSalary());
	}
}
