package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonDemo {

    public static void main(String[] args) {

        JSONObject root = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Java Basics");
        book1.put("author", "Ivan");

        JSONObject book2 = new JSONObject();
        book2.put("title", "Algorithms");
        book2.put("author", "Petrov");

        books.add(book1);
        books.add(book2);

        root.put("books", books);

        try (FileWriter file = new FileWriter("books.json")) {
            file.write(root.toJSONString());
            System.out.println("JSON created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}