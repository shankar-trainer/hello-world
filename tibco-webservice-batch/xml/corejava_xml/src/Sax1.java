import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.AttributeList;
import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;

public class Sax1 extends HandlerBase {

    public static void main(String[] args) {
        Sax1 handler = new Sax1(); 
        SAXParserFactory factory = SAXParserFactory.newInstance();
        
        try {
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse("second.xml", handler);
            System.out.println("parsing is done");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("starting");
    }

    @Override
    public void startElement(String name, AttributeList attrs) throws SAXException {
        System.out.println("element name is " + name);	
    }
    
}