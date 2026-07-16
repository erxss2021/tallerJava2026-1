package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReadAllLines {
    public static void main(String[] args) {
        Path path = Path.of("files", "mensajes.txt");
        try {
            List<String> messages = Files.readAllLines(path);
            for (String message : messages) {
                System.out.println(message);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
