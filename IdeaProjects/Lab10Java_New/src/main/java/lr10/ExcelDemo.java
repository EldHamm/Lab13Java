package lr10;

import java.io.FileWriter;
import java.io.IOException;

public class ExcelDemo {

    public static void main(String[] args) {

        String fileName = "books.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("title,author\n");
            writer.write("Java Basics,Ivan\n");
            writer.write("Algorithms,Petrov\n");
            writer.write("Database Systems,Sidorov\n");

            System.out.println("CSV file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}