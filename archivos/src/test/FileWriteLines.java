package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriteLines {
    public static void main(String[] args) {
        List<String> lines = List.of("Juan", "Pedro", "Eloy", "Bingo");
        Path path = Path.of("files", "clientes.txt");
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
