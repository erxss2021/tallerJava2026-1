package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        //Files.readString(null)
        Path path = Path.of("files", "mensajes.txt");
        String content = "";
        try {
            content = Files.readString(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(content);
        //Files.readAllLines(null)
        //Files.lines(null)
        //BufferedReader
        //Scanner
    }
}
