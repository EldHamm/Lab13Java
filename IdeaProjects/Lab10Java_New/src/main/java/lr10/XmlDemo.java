package lr10;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlDemo {

    public static void main(String[] args) {

        try {
            // ✔ путь к файлу XML
            File file = new File("src/main/java/lr10/books.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList books = doc.getElementsByTagName("book");

            System.out.println("SEARCH BY AUTHOR = Ivan\n");

            for (int i = 0; i < books.getLength(); i++) {

                Node node = books.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element el = (Element) node;

                    String title = el.getElementsByTagName("title")
                            .item(0)
                            .getTextContent();

                    String author = el.getElementsByTagName("author")
                            .item(0)
                            .getTextContent();

                    if (author.equals("Ivan")) {
                        System.out.println("Title: " + title);
                        System.out.println("Author: " + author);
                        System.out.println("-------------------");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}