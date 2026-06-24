package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.Iterator;

public class JsonDemo {

    public static void main(String[] args) {

        JSONArray books = new JSONArray();

        // книга 1
        JSONObject book1 = new JSONObject();
        book1.put("title", "Java Basics");
        book1.put("author", "Ivan");

        // книга 2
        JSONObject book2 = new JSONObject();
        book2.put("title", "Algorithms");
        book2.put("author", "Petrov");

        books.add(book1);
        books.add(book2);

        // ===== ПОИСК =====
        System.out.println("\nSEARCH RESULT:");

        for (Object obj : books) {
            JSONObject book = (JSONObject) obj;

            if (book.get("author").equals("Ivan")) {
                System.out.println("Title: " + book.get("title"));
                System.out.println("Author: " + book.get("author"));
            }
        }

        // ===== ДОБАВЛЕНИЕ =====
        JSONObject newBook = new JSONObject();
        newBook.put("title", "Database Systems");
        newBook.put("author", "Sidorov");

        books.add(newBook);
        System.out.println("\nBook added!");

        // ===== УДАЛЕНИЕ =====
        Iterator iterator = books.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();

            if (book.get("title").equals("Algorithms")) {
                iterator.remove();
                System.out.println("Book removed: Algorithms");
            }
        }

        // ===== СОХРАНЕНИЕ В ФАЙЛ =====
        JSONObject root = new JSONObject();
        root.put("books", books);

        try (FileWriter file = new FileWriter("books_updated.json")) {
            file.write(root.toJSONString());
            System.out.println("\nJSON saved successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}