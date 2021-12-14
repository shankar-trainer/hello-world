import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.com.Student;

public class MarsallingPrg1 {

	public static void main(String[] args) throws JAXBException {
		File file=new File("student1.xml");
		
		Student st1=new Student();
	
		st1.setRegNo(1);
		st1.setRoll(10001);
		st1.setName("abhiranjan kumar");
		st1.setSubject("Math");
		
		st1.setMarks(67.77f);
		
		JAXBContext context=JAXBContext.newInstance(Student.class);
		
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(st1, file);
		
		
	}
}
