import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EmployeeRead {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File("Employee.xml");
		if (file.exists()) {
			System.out.println("file present");

			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse(file);
			NodeList nodelist = document.getElementsByTagName("Employees");

			System.out.println("root length " + nodelist.getLength());

			for (int i = 0; i < nodelist.getLength(); i++) {
				NodeList nodelist1 = nodelist.item(i).getChildNodes();
				System.out.println("nodelist1 length " + nodelist1.getLength());

				for (int j = 0; j < nodelist1.getLength(); j++) {
					NodeList nodelist2 = nodelist1.item(j).getChildNodes();
					System.out.println("nodelist2 length " + nodelist2.getLength());

					for (int k = 0; k < nodelist2.getLength(); k++) {
						
							NodeList nodelist3 = nodelist2.item(k).getChildNodes();
							System.out.println("nodeList3" + nodelist3.getLength());
							// "+(nodelist3.item(k).getNodeType()==Node.TEXT_NODE));
							for (int l = 0; l < nodelist3.getLength(); l++) {
								{
									System.out.println((nodelist3.item(l).getNodeValue()));
								}
							}
						
					}
				}

			}
		}
	}
}
