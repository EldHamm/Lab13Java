package lr10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HtmlDemo {

    public static void main(String[] args) {

        try {
            // подключаемся к странице
            Document doc = Jsoup.connect("https://example.com").get();

            System.out.println("TITLE: " + doc.title());

            // получаем ссылки
            Elements links = doc.select("a");

            for (Element link : links) {
                System.out.println("Link text: " + link.text());
                System.out.println("URL: " + link.attr("href"));
                System.out.println("-------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}