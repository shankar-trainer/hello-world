package org.com;

import java.io.File;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class StudentXmlRead {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			Student student = (Student) unmarshaller.unmarshal
					(new File("Student.xml"));

	List<Stud> slist1=student.getSlist();
	for (Stud stud : slist1) {
		System.out.println(stud.getRoll()+"\t"+stud.getName()+"\t"+stud.getSubject());
	}	
	
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
