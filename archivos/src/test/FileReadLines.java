package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadLines {
    public static void main(String[] args) {
        Path path = Path.of("files", "clientes.txt");
        try(var lines = Files.lines(path)){
            lines.forEach(a -> System.out.println(a));
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
