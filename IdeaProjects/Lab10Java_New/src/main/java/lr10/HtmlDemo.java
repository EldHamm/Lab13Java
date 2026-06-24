package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;

public class HtmlDemo {

    public static void main(String[] args) {

        try {

            Document doc = Jsoup.connect("https://example.com").get();

            System.out.println("TITLE: " + doc.title());

            Elements links = doc.select("a");

            try (FileWriter writer = new FileWriter("links.txt")) {

                for (Element link : links) {
                    System.out.println("Link: " + link.text());
                    System.out.println("URL: " + link.attr("href"));
                    System.out.println("-----");

                    // ДОРАБОТКА: запись в файл
                    writer.write(link.text() + " | " + link.attr("href") + "\n");
                }

            }

            System.out.println("HTML parsed + saved");

        } catch (Exception e) {
            System.out.println("Error loading page");
            e.printStackTrace();
        }
    }
}