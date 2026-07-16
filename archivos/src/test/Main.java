package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("files", "ventas.txt");
        
        System.out.println(path);
        System.out.println(Files.exists(path));
        try {
            Files.createFile(path);
            System.out.println(Files.size(path));
            // System.out.println(Files.isReadable(path));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
