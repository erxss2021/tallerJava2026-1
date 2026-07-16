package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
    public static void main(String[] args) {
        //Files.writeString(null, null, null)
        Path path = Path.of("files", "mensajes.txt");
        try {
            if (Files.exists(path)) {
                Files.writeString(path, "Primera linea\nHola Java 21\nManejo de archivo.");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        //Files.write(null, null, null)
        //BufferedWriter
        //FileWriter
        //PrintWriter
    }
}
