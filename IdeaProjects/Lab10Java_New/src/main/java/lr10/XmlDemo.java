package lr10;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class XmlDemo {

    public static void main(String[] args) {

        try {
            File file = new File("src/lr10/books.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList books = doc.getElementsByTagName("book");

            for (int i = 0; i < books.getLength(); i++) {

                Node node = books.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element el = (Element) node;

                    System.out.println("Title: " +
                            el.getElementsByTagName("title").item(0).getTextContent());

                    System.out.println("Author: " +
                            el.getElementsByTagName("author").item(0).getTextContent());

                    System.out.println("----------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}