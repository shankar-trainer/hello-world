import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXml1 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("Adress.xml"));

		NodeList root = document.getElementsByTagName("Addresses");
		for (int i = 0; i < root.getLength(); i++) {
			NodeList childNodes = root.item(i).getChildNodes();
			for (int j = 0; j < childNodes.getLength(); j++) {
				NodeList childNodes1 = childNodes.item(j).getChildNodes();

				for (int k = 0; k < childNodes1.getLength(); k++) {
					NodeList childNodes2 = childNodes1.item(k).getChildNodes();

					for (int l = 0; l < childNodes2.getLength(); l++) {
						if (childNodes2.item(l).getNodeType() == Node.TEXT_NODE)
							System.out.println(childNodes2.item(l).getNodeValue());
					}
				}

			}
		}

	}
}
