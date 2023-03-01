import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class StuentRead {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File("Student.xml");
		if (file.exists()) {
			System.out.println("file present");

			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse(file);
			NodeList nodelist = document.getElementsByTagName("student");
			//System.out.println("root node length "+nodelist.getLength());

			NodeList childNodes = nodelist.item(0).getChildNodes();
			//System.out.println("childNodes length "+childNodes.getLength());

			for (int i = 0; i < childNodes.getLength(); i++) {
				NodeList childNodes1 = childNodes.item(i).getChildNodes();
				//System.out.println("childNodes1 length "+childNodes1.getLength());

				for (int j = 0; j < childNodes1.getLength(); j++) {
					System.out.println(childNodes1.item(j).getNodeValue());
				}
			}

		}

		else {
			System.out.println("file not present");
		}
	}
}
