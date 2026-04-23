import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Users {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.parse(new File("Users.xml"));

		NodeList nodeList = document.getElementsByTagName("users");

		for (int i = 0; i < nodeList.getLength(); i++) {

			NodeList childNodes = nodeList.item(i).getChildNodes();

			for (int j = 0; j < childNodes.getLength(); j++) {
				NodeList childNodes2 = childNodes.item(j).getChildNodes();

				for (int k = 0; k < childNodes2.getLength(); k++) {

					NodeList childNodes3 = childNodes2.item(k).getChildNodes();
					for (int l = 0; l < childNodes3.getLength(); l++) {
						if (childNodes3.item(l).getNodeType() == Node.TEXT_NODE)
							System.out.print(childNodes3.item(l).getNodeValue());
					}
					System.out.println();
				}

			}

		}
	}
}
